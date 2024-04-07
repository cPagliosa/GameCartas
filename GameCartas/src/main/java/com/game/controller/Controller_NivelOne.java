package com.game.controller;

import com.game.gui.Nivel1;
import com.game.model.Cartas;
import com.game.model.Jogadores;
import com.game.model.Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author caiop
 */
public class Controller_NivelOne implements ActionListener {

    //jpainel que este controller controla
    private Nivel1 niv = new Nivel1();

    //outros controllers para fazer trocas de telas
    private Controller_Batalha bat;
    //para ja gerar os jogadores que vao disputar
    private Jogadores player;
    private Jogadores npc;

//Contrutor da classe
    public Controller_NivelOne() {
        this.niv.getBtn_Regiao1().addActionListener(this);
    }

    //Para poder chamar o jPainel para a tela 
    public Nivel1 getNiv() {
        return niv;
    }

    //gera todas as cartas que o npc podera jogar na batalha
    private List gerarCartasNpcs() {
        Random random = new Random();
        List<Cartas> deck = new LinkedList<Cartas>();
        for (int i = 0; i < 14; i++) {
            int id = random.nextInt(Controller_Main.cartas.size());
            for (Cartas cart : Controller_Main.cartas) {
                if (id == cart.getId()) {
                    deck.add(cart);
                }
            }
        }
        return deck;
    }
    
//se tivet um evento como clicar ira ativar este metado
    @Override
    public void actionPerformed(ActionEvent e) {
        //botao da fase 1
        if (e.getSource() == this.niv.getBtn_Regiao1()) {
            this.npc = new Jogadores(50, 5, "Slime", this.gerarCartasNpcs());
            List<Cartas> aux = new LinkedList<>();
            aux.addAll(Controller_Main.usu.getDeck());
            player = new Jogadores(50, 5, Controller_Main.usu.getNome(), aux);
            this.bat = new Controller_Batalha(player, npc);
            Main.main.trocarTelas(bat.getBat());

        }
    }
}
