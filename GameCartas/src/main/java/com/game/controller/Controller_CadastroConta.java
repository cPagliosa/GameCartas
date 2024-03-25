/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.game.controller;

import com.game.gui.Cadastro_Conta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author caiop
 */
public class Controller_CadastroConta implements ActionListener{
    private Cadastro_Conta cad = new Cadastro_Conta();

    public Controller_CadastroConta() {
        
        //Pegar os botoes para poder controlar as acoes
        this.cad.getBtn_Entrar().addActionListener(this);
        this.cad.getBtn_Limpar().addActionListener(this);
        this.cad.getBtn_Voltar().addActionListener(this);
    }

    public Cadastro_Conta getCad() {
        return cad;
    }
    
    private void limpar(){
        this.cad.getTxt_Usuario().setText(null);
        this.cad.getTxt_Senha1().setText(null);
        this.cad.getTxt_Senha2().setText(null);
        this.cad.getCbox_Raca().setSelectedIndex(0);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.cad.getBtn_Limpar()) {
             this.limpar();
         }
    }
    
    
}
