
package com.game.model;

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

    public Cartas() {
    }

    public Cartas(String nome, int vida, int ataque, int custo, int bonus) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.custo = custo;
        this.bonus = bonus;
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
    
    
}
