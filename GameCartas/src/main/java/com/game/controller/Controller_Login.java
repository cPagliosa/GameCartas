package com.game.controller;

import com.game.gui.Cadastro_Conta;
import com.game.gui.Login;
import com.game.model.Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author caiop
 */
public class Controller_Login implements ActionListener {

    private Login log = new Login();
    private Controller_CadastroConta cad;
    private ControllerMapa mundi;

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

    private void entrar() { //1
        boolean usuNaoEncontrado = false;
        for (Usuario usu : Controller_Main.contas) { //1
            if (this.log.getTxt_Username().getText().equals(usu.getEmail())) { //1
                if (this.log.getTxt_Senha().getText().equals(usu.getSenha())) { //1
                    mundi = new ControllerMapa(usu);
                    Main.main.trocarTelas(mundi.getMundi());
                    usuNaoEncontrado = false;
                } else {
                    usuNaoEncontrado = true;
                }
            } else {
                usuNaoEncontrado = true;

            }
        }
        if (usuNaoEncontrado) { //1
            JOptionPane.showMessageDialog(null, "Email e senha Invalidos!!", "Erro Login", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) { //1
        //Caso aja uma acao ele vai entrar nos ifs
        if (e.getSource() == this.log.getBtn_Sair()) { //1
            System.exit(0);
        } else if (e.getSource() == this.log.getBtn_Cadastro()) { //1
            cad = new Controller_CadastroConta();
            Main.main.trocarTelas(cad.getCad());
        } else if (e.getSource() == this.log.getBtn_Entrar()) { //1
            this.entrar();
        }
    }
}
