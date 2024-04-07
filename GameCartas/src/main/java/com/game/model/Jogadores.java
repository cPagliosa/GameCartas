package com.game.model;

import java.util.LinkedList;
import java.util.List;

//clase para usar nas batalhas
public class Jogadores {

    private int vida;
    private int moeda;
    private String nome;
    private List<Cartas> deck = new LinkedList<Cartas>();

    public Jogadores() {
    }

    public Jogadores(int vida, int moeda, String nome, List<Cartas> deck) {
        this.vida = vida;
        this.moeda = moeda;
        this.nome = nome;
        this.deck = deck;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getMoeda() {
        return moeda;
    }

    public void setMoeda(int moeda) {
        this.moeda = moeda;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Cartas> getDeck() {
        return deck;
    }

    public void setDeck(List<Cartas> deck) {
        this.deck = deck;
    }

}
