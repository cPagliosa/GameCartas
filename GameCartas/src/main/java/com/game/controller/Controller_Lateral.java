package com.game.controller;

import com.game.gui.BarraLateral;
import com.game.model.Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author caiop
 */
public class Controller_Lateral implements ActionListener {

    private BarraLateral blr = new BarraLateral();
    private Controller_Login log;
    private ControllerMapa map;
    private Usuario usu;

    public Controller_Lateral(Usuario usu) {
        this.GerenciamentoNivel();
        this.blr.getLbl_Username().setText(usu.getNome());
        this.usu = usu;

        this.blr.getBtn_Sair().addActionListener(this);
    }

    public BarraLateral getBlr() {
        return blr;

    }

    private void GerenciamentoNivel() {
        if (Controller_Main.nivel == 0) {
            this.blr.getBtn_Sair().setText("Sair");
        } else {
            this.blr.getBtn_Sair().setText("Voltar");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.blr.getBtn_Sair()) {
            if (this.blr.getBtn_Sair().getText() == "Sair") {
                this.GerenciamentoNivel();
                Controller_Main.nivel = 0;
                log = new Controller_Login();
                Main.main.trocarTelas(log.getLog());
            } else {
                Controller_Main.nivel = 0;
                map = new ControllerMapa(usu);
                this.GerenciamentoNivel();
                Main.main.trocaGame(blr, map.getMundi());
            }

        } else if (e.getSource() == this.blr.getBtn_Inv()) {

        }

    }
}
