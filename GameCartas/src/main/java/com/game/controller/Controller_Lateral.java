package com.game.controller;

import com.game.gui.BarraLateral;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author caiop
 */
public class Controller_Lateral implements ActionListener {

//jpainel que este controller controla
    private BarraLateral blr = new BarraLateral();

    //outros controllers para fazer trocas de telas
    private Controller_Login log;
    private ControllerMapa map;

//Contrutor da classe
    public Controller_Lateral() {
        this.GerenciamentoNivel();
        this.blr.getLbl_Username().setText(Controller_Main.usu.getNome());

        this.blr.getBtn_Sair().addActionListener(this);
    }

//Para poder chamar o jPainel para a tela
    public BarraLateral getBlr() {
        return blr;

    }
//metado responsavel de gerenciar as trocas de tela de nineis e mudar o botao para voltar para o mapa mundi

    private void GerenciamentoNivel() {
        if (Controller_Main.nivel == 0) {
            this.blr.getBtn_Sair().setText("Sair");
        } else {
            this.blr.getBtn_Sair().setText("Voltar");
        }
    }
//se tivet um evento como clicar ira ativar este metado

    @Override
    public void actionPerformed(ActionEvent e) {
        //botao para deslocar ou voltar para o mapa mundi
        if (e.getSource() == this.blr.getBtn_Sair()) {
            if (this.blr.getBtn_Sair().getText() == "Sair") {
                this.GerenciamentoNivel();
                Controller_Main.nivel = 0;
                log = new Controller_Login();
                Main.main.trocarTelas(log.getLog());
            } else {
                Controller_Main.nivel = 0;
                map = new ControllerMapa();
                this.GerenciamentoNivel();
                Main.main.trocaGame(blr, map.getMundi());
            }
        } //botao em desenvolvimento
        else if (e.getSource() == this.blr.getBtn_Inv()) {
            JOptionPane.showMessageDialog(null, "Em desenvolvimento", "info", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
