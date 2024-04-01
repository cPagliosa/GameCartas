
package com.game.model;

import com.game.controller.Controller_Main;
import java.io.Serializable;

/**
 *
 * @author caiop
 */
public class Cartas implements Serializable{
    
    private String nome;
    private int vida;
    private int ataque;
    private int custo;
    private int bonus;
    private int tipo;

    public Cartas() {
    }

    public Cartas(String nome, int vida, int ataque, int custo, int bonus, int tipo) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.custo = custo;
        this.bonus = bonus;
        this.tipo = tipo;
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getCusto() {
        return custo;
    }

    public void setCusto(int custo) {
        this.custo = custo;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    
    public void gerarCartas(){
        
        Cartas cart = new Cartas("Lobo Branco", 4, 3, 3, 0,1);
        Controller_Main.cartas.add(cart);
        cart = new Cartas("Lobo Preto", 6, 2, 3, 0,1);
        Controller_Main.cartas.add(cart);
        cart = new Cartas("Aranha Pequena", 2, 4, 2, 0,1);
        Controller_Main.cartas.add(cart);
        cart = new Cartas("Aranha Gorda", 4, 1, 1, 0,1);
        Controller_Main.cartas.add(cart);
        cart = new Cartas("Goblin Jovem", 2, 2, 1, 0,1);
        Controller_Main.cartas.add(cart);
        cart = new Cartas("Goblin Guerreiro", 4, 3, 3, 0,1);
        Controller_Main.cartas.add(cart);
        cart = new Cartas("Goblin Escudeiro", 6, 3, 2, 0,1);
        Controller_Main.cartas.add(cart);
        cart = new Cartas("Goblin Arqueiro", 1, 2, 1, 0,0);
        Controller_Main.cartas.add(cart);
        cart = new Cartas("Rato", 1, 2, 1, 0,1);
        Controller_Main.cartas.add(cart);
        cart = new Cartas("toupeira", 3, 1, 1, 0,1);
        Controller_Main.cartas.add(cart);
        cart = new Cartas("Slime", 5, 1, 1, 0,1);
        Controller_Main.cartas.add(cart);
    }
}
