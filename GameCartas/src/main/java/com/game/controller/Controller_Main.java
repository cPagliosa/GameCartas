package com.game.controller;

import com.game.gui.Janela;
import com.game.model.Cartas;
import com.game.model.Usuario;
import java.awt.BorderLayout;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

public class Controller_Main {

    //Incia o jFrame
    private Janela janela;
    
    //Inicia a classe controlhe da tela de Login
    private Controller_Login controller_login = new Controller_Login();
    
    //listas statias de contas e cartas
    public static LinkedList<Usuario> contas = new LinkedList<>();
    public static LinkedList<Cartas> cartas = new LinkedList<>();
    
    //reponsavel por controlar em que nivel esta(ajuda a barra lateral)
    public static int nivel = 0;
    
    //depois de logar os daods do usuario e salva 
    public static Usuario usu;
    
    //chama a classe Cartas para poder carregar todas as cartas
    Cartas car = new Cartas();

    //metado responsavel pro dar inicia ao jogo
    protected void start() {

        this.janela = new Janela();
        this.janela.setVisible(true);
        this.janela.setLayout(new BorderLayout());
        this.trocarTelas(controller_login.getLog());
        this.janela.setLocationRelativeTo(null);
        this.carregarDados();
        car.gerarCartas();

    }

    //medado para carregar a lista de usuarios cadastrados
    private void carregarDados() {
        try {

            FileInputStream arquivo = new FileInputStream("Conta");
            ObjectInputStream in = new ObjectInputStream(arquivo);
            this.contas = (LinkedList<Usuario>) in.readObject();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Controller_Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Controller_Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Controller_Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // metado responsavel por fazer as trocas de tela uma por uma
    protected void trocarTelas(JPanel painel) {
        janela.getContentPane().removeAll();
        janela.add(painel, BorderLayout.CENTER);
        janela.pack();

    }

    // metado responsavel por fazer as trocas de tela uma por duas
    protected void trocaGame(JPanel p1, JPanel p2) {
        janela.getContentPane().removeAll();
        janela.add(p1, BorderLayout.WEST);
        janela.add(p2, BorderLayout.CENTER);
        janela.pack();
    }
}
