package com.game.controller;

import com.game.gui.MapaMundi;
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
    private Controller_Nivel1 nivel1;
    private Controller_Lateral blr;

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
            Controller_Main.nivel = 1;
            nivel1 = new Controller_Nivel1();
            blr = new Controller_Lateral(jogador);
            Main.main.trocaGame(blr.getBlr(), nivel1.getNiv());
           
        }
    }
    
    
}
