package com.game.model;

import com.game.controller.Controller_Main;
import java.io.Serializable;

/**
 *
 * @author caiop
 */
public class Cartas implements Serializable {

    private String nome;
    private String Img;
    private int vida;
    private int id;
    private int ataque;
    private int custo;
    private int bonus;
    private int tipo;

    public Cartas() {
    }

    public Cartas(String nome, String Img, int vida, int id, int ataque, int custo, int bonus, int tipo) {
        this.nome = nome;
        this.Img = Img;
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

    public String getImg() {
        return Img;
    }

    public void setImg(String Img) {
        this.Img = Img;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setCusto(int custo) {
        this.custo = custo;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    //Gera todas as cartas do game
    public void gerarCartas() {

        Cartas cart = new Cartas("Lobo Branco", "/Cartas/FundoCarta.png", 4, 1, 4, 3, 0, 1);
        Controller_Main.cartas.add(cart);
        cart = new Cartas("Lobo Cinza", "/Cartas/FundoCarta.png", 6, 2, 2, 3, 0, 2);
        Controller_Main.cartas.add(cart);
        cart = new Cartas("Aranha Pequena", "/Cartas/FundoCarta.png", 2, 3, 4, 2, 0, 1);
        Controller_Main.cartas.add(cart);
        cart = new Cartas("Aranha Gorda", "/Cartas/FundoCarta.png", 4, 4, 4, 1, 0, 2);
        Controller_Main.cartas.add(cart);
        cart = new Cartas("Goblin Jovem", "/Cartas/FundoCarta.png", 2, 5, 2, 1, 0, 1);
        Controller_Main.cartas.add(cart);
        cart = new Cartas("Goblin Guerreiro", "/Cartas/FundoCarta.png", 4, 6, 3, 3, 0, 1);
        Controller_Main.cartas.add(cart);
        cart = new Cartas("Goblin Escudeiro", "/Cartas/FundoCarta.png", 6, 7, 3, 2, 0, 1);
        Controller_Main.cartas.add(cart);
        cart = new Cartas("Goblin Arqueiro", "/Cartas/FundoCarta.png", 1, 2, 8, 1, 0, 0);
        Controller_Main.cartas.add(cart);
        cart = new Cartas("Rato", "/Cartas/FundoCarta.png", 1, 9, 2, 1, 0, 1);
        Controller_Main.cartas.add(cart);
        cart = new Cartas("toupeira", "/Cartas/FundoCarta.png", 3, 10, 1, 1, 0, 1);
        Controller_Main.cartas.add(cart);
        cart = new Cartas("Slime", "/Cartas/FundoCarta.png", 5, 11, 1, 1, 0, 1);
        Controller_Main.cartas.add(cart);
    }
}
