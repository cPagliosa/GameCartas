package com.game.controller;

import com.game.gui.MapaMundi;
import com.game.model.Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author caiop
 */
public class ControllerMapa implements ActionListener {

    //jpainel que este controller controla
    private MapaMundi mundi = new MapaMundi();
    //outros controllers para fazer trocas de telas
    private Controller_NivelOne niv1;
    private Controller_Lateral blr;

//Contrutor da classe
    public ControllerMapa() {

        //chama os botoes dp jpainel para o controlher conseguir reconhecer
        this.mundi.getBtn_Nivel1().addActionListener(this);
    }

//Para poder chamar o jPainel para a tela
    public MapaMundi getMundi() {
        return mundi;
    }

//se tivet um evento como clicar ira ativar este metado
    @Override
    public void actionPerformed(ActionEvent e) {
        //botao nivel1
        if (e.getSource() == this.mundi.getBtn_Nivel1()) {
            Controller_Main.nivel = 1;
            niv1 = new Controller_NivelOne();
            blr = new Controller_Lateral();
            Main.main.trocaGame(blr.getBlr(), niv1.getNiv());

        }
    }

}
