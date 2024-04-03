/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.game.controller;

import com.game.gui.MapaMundi;
import com.game.gui.Nivel1;
import com.game.model.Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author caiop
 */
public class ControllerMapa implements ActionListener{
    private Usuario jogador;
    private MapaMundi mundi = new MapaMundi();
    private controller_Nivel1 nivel1;

    public MapaMundi getMundi() {
        return mundi;
    }
    
    

    public ControllerMapa(Usuario jog) {
        jogador = new Usuario();
        jogador = jog;
        
        this.mundi.getBtn_Nivel1().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.mundi.getBtn_Nivel1()) {
            nivel1 = new controller_Nivel1();
            Main.main.trocarTelas(nivel1.getNiv());
        }
    }
    
    
}
