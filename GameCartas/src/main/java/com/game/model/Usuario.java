package com.game.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author caiop
 */
public class Usuario implements Serializable{
    private String nome;
    private String senha;
    private String raca;
    private int bonus;
    
    private ArrayList<Cartas> inventario = new ArrayList<>(30);
    private Queue<Cartas> deck = new LinkedList<Cartas>();

    public Usuario() {
    }

    public Usuario(String nome, String senha, String raca, int bonus) {
        this.nome = nome;
        this.senha = senha;
        this.raca = raca;
        this.bonus = bonus;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public ArrayList<Cartas> getInventario() {
        return inventario;
    }

    public void setInventario(ArrayList<Cartas> inventario) {
        this.inventario = inventario;
    }

    public Queue<Cartas> getDeck() {
        return deck;
    }

    public void setDeck(Queue<Cartas> deck) {
        this.deck = deck;
    }

   
    
    
}
