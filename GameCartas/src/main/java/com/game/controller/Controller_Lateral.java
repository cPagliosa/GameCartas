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
        this.blr.getLbl_Username().setText(usu.getNome());
        this.usu = usu;

        this.blr.getBtn_Sair().addActionListener(this);
    }

    public BarraLateral getBlr() {
        return blr;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.blr.getBtn_Sair()) {
            if (this.blr.getBtn_Sair().getText().equals("Sair")) {
                log = new Controller_Login();
                Main.main.trocarTelas(log.getLog());
            } else {
                map = new ControllerMapa(usu);
                Main.main.trocarTelas(map.getMundi());
            }

        } else if (e.getSource() == this.blr.getBtn_Inv()) {

        }

    }
}
