package com.game.controller;

import com.game.gui.Cadastro_Conta;
import com.game.gui.Login;
import com.game.model.Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author caiop
 */
public class Controller_Login implements ActionListener {

    //jpainel que este controller controla
    private Login log = new Login();

    //outros controllers para fazer trocas de telas
    private Controller_CadastroConta cad;
    private ControllerMapa mundi;
    private Controller_Lateral blr;

    //Contrutor da classe
    public Controller_Login() {

        //Pegar os botoes para poder controlar as acoes
        this.log.getBtn_Entrar().addActionListener(this);
        this.log.getBtn_Conta().addActionListener(this);
        this.log.getBtn_Sair().addActionListener(this);
    }
//Para poder chamar o jPainel para a tela

    public Login getLog() {
        return log;
    }
//metado responsavel por realizar o login

    private void entrar() {
        boolean usuNaoEncontrado = false;
        for (Usuario usu : Controller_Main.contas) {
            if (this.log.getTxt_Email().getText().equals(usu.getEmail())) {
                if (this.log.getTxt_Senha().getText().equals(usu.getSenha())) {
                    Controller_Main.usu = usu;
                    mundi = new ControllerMapa();
                    blr = new Controller_Lateral();
                    Main.main.trocaGame(blr.getBlr(), mundi.getMundi());
                    usuNaoEncontrado = false;
                } else {
                    usuNaoEncontrado = true;
                }
            } else {
                usuNaoEncontrado = true;
            }
        }
        if (usuNaoEncontrado) {
            JOptionPane.showMessageDialog(null, "Email e senha Invalidos!!", "Erro Login", JOptionPane.ERROR_MESSAGE);
        }
    }
//se tivet um evento como clicar ira ativar este metado

    @Override
    public void actionPerformed(ActionEvent e) {
        //botao para fechar o jogo
        if (e.getSource() == this.log.getBtn_Sair()) {
            System.exit(0);
        } //botao para ir para a tela de cadastro
        else if (e.getSource() == this.log.getBtn_Conta()) {
            cad = new Controller_CadastroConta();
            Main.main.trocarTelas(cad.getCad());
        } //botao para realizar o login
        else if (e.getSource() == this.log.getBtn_Entrar()) {
            this.entrar();
        }
    }

}
