package com.game.controller;

import com.game.gui.Cadastro_Conta;
import com.game.gui.Login;
import com.game.model.Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author caiop
 */
public class Controller_Login implements ActionListener {

    private Login log = new Login();
    private Controller_CadastroConta cad;

    //Construtor da tela
    public Controller_Login() {

        //Pegar os botoes para poder controlar as acoes
        this.log.getBtn_Entrar().addActionListener(this);
        this.log.getBtn_Cadastro().addActionListener(this);
        this.log.getBtn_Sair().addActionListener(this);
    }

    public Login getLog() {
        return log;
    }

    private void entrar() {
        for (Usuario usu : Controller_Main.contas) {
            if (this.log.getTxt_Username().getText().equals(usu.getEmail())) {
                if (this.log.getTxt_Senha().getText().equals(usu.getSenha())) {

                }
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Caso aja uma acao ele vai entrar nos ifs
        if (e.getSource() == this.log.getBtn_Sair()) {
            System.exit(0);
        } else if (e.getSource() == this.log.getBtn_Cadastro()) {
            cad = new Controller_CadastroConta();
            Main.main.trocarTelas(cad.getCad());
        } else if (e.getSource() == this.log.getBtn_Entrar()) {
            this.entrar();
        }
    }

}
