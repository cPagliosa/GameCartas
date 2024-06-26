package com.game.model;

import com.game.controller.Controller_Main;
import java.io.Serializable;

/**
 *
 * @author caiop
 */
public class Cartas implements Serializable {

    private String nome;
    private int vida;
    private int id;
    private int ataque;
    private int custo;
    private int bonus;
    private int tipo;

    public Cartas() {
    }

    public Cartas(String nome, int vida, int id, int ataque, int custo, int bonus, int tipo) {
        this.nome = nome;
        this.vida = vida;
        this.id = id;
        this.ataque = ataque;
        this.custo = custo;
        this.bonus = bonus;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getCusto() {
        return custo;
    }

    public int getBonus() {
        return bonus;
    }

    public int getTipo() {
        return tipo;
    }

    public int getId() {
        return id;
    }

    public void gerarCartas() {

        Cartas cart = new Cartas("Lobo Branco", 4, 1, 4, 3, 0, 1);
        Controller_Main.cartas.add(cart);
        cart = new Cartas("Lobo Preto", 6, 2, 2, 3, 0, 2);
        Controller_Main.cartas.add(cart);
        cart = new Cartas("Aranha Pequena", 2, 3, 4, 2, 0, 1);
        Controller_Main.cartas.add(cart);
        cart = new Cartas("Aranha Gorda", 4, 4, 4, 1, 0, 2);
        Controller_Main.cartas.add(cart);
        cart = new Cartas("Goblin Jovem", 2, 5, 2, 1, 0, 1);
        Controller_Main.cartas.add(cart);
        cart = new Cartas("Goblin Guerreiro", 4, 6, 3, 3, 0, 1);
        Controller_Main.cartas.add(cart);
        cart = new Cartas("Goblin Escudeiro", 6, 7, 3, 2, 0, 1);
        Controller_Main.cartas.add(cart);
        cart = new Cartas("Goblin Arqueiro", 1, 2, 8, 1, 0, 0);
        Controller_Main.cartas.add(cart);
        cart = new Cartas("Rato", 1, 9, 2, 1, 0, 1);
        Controller_Main.cartas.add(cart);
        cart = new Cartas("toupeira", 3, 10, 1, 1, 0, 1);
        Controller_Main.cartas.add(cart);
        cart = new Cartas("Slime", 5, 11, 1, 1, 0, 1);
        Controller_Main.cartas.add(cart);
    }
}
