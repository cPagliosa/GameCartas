package com.game.controller;

import com.game.gui.Janela;
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class Controller_Main {
    private Janela janela;
    private Controller_Login controller_login = new Controller_Login();
    
    protected void start(){
        
        janela = new Janela();
        janela.setVisible(true);
        janela.setSize(1500, 800);
        janela.setLocationRelativeTo(null);
        janela.setLayout(new BorderLayout());
        this.trocarTelas(controller_login.getLog());
    }
    
    protected void trocarTelas(JPanel painel) {

        janela.getContentPane().removeAll();
        janela.add(painel, BorderLayout.CENTER);
        janela.pack();

    }
}
