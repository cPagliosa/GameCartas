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
    private Janela janela;
    private Controller_Login controller_login = new Controller_Login();
    public static LinkedList<Usuario> contas = new LinkedList<>();
    public static LinkedList<Cartas> cartas = new LinkedList<>();
    public static int nivel=0;
    Cartas car = new Cartas();
    
    protected void start(){
        
        janela = new Janela();
        janela.setVisible(true);
        janela.setSize(1200, 720);
        janela.setLocationRelativeTo(null);
        janela.setLayout(new BorderLayout());
        this.trocarTelas(controller_login.getLog());
        this.carregarDados();
        car.gerarCartas();
        
    }
    
    private void carregarDados(){
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
    
    protected void trocarTelas(JPanel painel) {
        janela.getContentPane().removeAll();
        janela.add(painel, BorderLayout.CENTER);
        janela.pack();

    }
    
    protected void trocaGame(JPanel p1,JPanel p2){
        janela.getContentPane().removeAll();
        janela.add(p1, BorderLayout.WEST);
        janela.add(p2, BorderLayout.CENTER);
        janela.pack();
    }
}
