/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.game.controller;

import com.game.gui.Cadastro_Conta;
import com.game.gui.Login;
import com.game.model.Cartas;
import com.game.model.Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.management.Query;
import javax.swing.JOptionPane;

/**
 *
 * @author caiop
 */
public class Controller_CadastroConta implements ActionListener {

    private Cadastro_Conta cad = new Cadastro_Conta();
    private Controller_Login log;

    public Controller_CadastroConta() {

        //Pegar os botoes para poder controlar as acoes
        this.cad.getBtn_Entrar().addActionListener(this);
        this.cad.getBtn_Limpar().addActionListener(this);
        this.cad.getBtn_Voltar().addActionListener(this);
    }

    public Cadastro_Conta getCad() {
        return cad;
    }

    private void limpar() {
        this.cad.getTxt_Usuario().setText(null);
        this.cad.getTxt_Senha1().setText(null);
        this.cad.getTxt_Senha2().setText(null);
        this.cad.getTxt_Email().setText(null);
        this.cad.getCbox_Raca().setSelectedIndex(0);
    }

    private void salvar() {
        try {

            System.out.println("sim");

            FileOutputStream arquivo = new FileOutputStream("Conta");
            ObjectOutputStream out = new ObjectOutputStream(arquivo);

            Usuario conta = new Usuario(
                    this.cad.getTxt_Usuario().getText(),
                    this.cad.getTxt_Email().getText(),
                    String.valueOf(this.cad.getTxt_Senha2().getText()),
                    this.cad.getCbox_Raca().getSelectedIndex(),
                    null,
                    this.gerarCartasIniciais());

            Controller_Main.contas.add(conta);
            out.writeObject(Controller_Main.contas);
            out.close();
            arquivo.close();
            System.out.println("serializado sim");

            this.limpar();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Controller_CadastroConta.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Controller_CadastroConta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private Queue gerarCartasIniciais() { //1
        Random random = new Random();
        Queue<Cartas> deck = new LinkedList<Cartas>();
        for (int i = 0; i < 3; i++) { //1
            int id = random.nextInt(Controller_Main.cartas.size());
            for (Cartas cart : Controller_Main.cartas) { //1
                if (id == cart.getId()) { //1
                    deck.offer(cart);
                }
            }
        }
        return deck;
    }

    private void tratamento() { //1
        if (this.validUsuario()) { //1
            if (this.validSenha()) { // 1
                if (this.validEmail(this.cad.getTxt_Email().getText())) { //1
                    int resposta = JOptionPane.showInternalConfirmDialog(null, "Voce tem certeza que quer salvar com estes daods?\nUsuario: " + this.cad.getTxt_Usuario().getText() + "\nSenha: " + this.cad.getTxt_Senha2().getText() + "\nEmail: " + this.cad.getTxt_Email().getText() + "\nraca: " + String.valueOf(this.cad.getCbox_Raca().getSelectedItem()));
// Verificar qual botão foi pressionado pelo usuário
                    if (resposta == JOptionPane.YES_OPTION) { //1
                        // O usuário clicou em "Sim" ou "OK"
                        this.salvar();
                    } else if (resposta == JOptionPane.NO_OPTION) { //1
                        // O usuário clicou em "Não"
                        this.limpar();
                    } else if (resposta == JOptionPane.CANCEL_OPTION) { //1
                        // O usuário clicou em "Cancelar"
                        this.limpar();
                    } else if (resposta == JOptionPane.CLOSED_OPTION) {//1
                        // O usuário fechou a caixa de diálogo sem fazer uma escolha
                        this.limpar();
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Email invalido", "Erro Email", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    private boolean validUsuario() { //1
        if (this.cad.getTxt_Usuario().getText().length() >= 3 && this.cad.getTxt_Usuario().getText().length() <= 12) { //2
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Usuario invalido", "Erro Usuario", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    private boolean validSenha() { //1
        if (this.cad.getTxt_Senha1().getText().length() >= 3) { //1
            if (this.cad.getTxt_Senha1().getText().equals(this.cad.getTxt_Senha2().getText())) { //1
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Senhas nao identicas", "Erro Senha", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Senha invalida!!", "Erro Senha", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    private boolean validEmail(String email) {
        // Expressão regular para verificar o formato do email
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return email.matches(emailRegex);
    }

    @Override
    public void actionPerformed(ActionEvent e) { //1
        if (e.getSource() == this.cad.getBtn_Limpar()) { //1
            this.limpar();
        } else if (e.getSource() == this.cad.getBtn_Entrar()) { //1
            this.tratamento();
        } else if (e.getSource() == this.cad.getBtn_Voltar()) { //1
            log = new Controller_Login();
            Main.main.trocarTelas(log.getLog());
        }
    }

}
