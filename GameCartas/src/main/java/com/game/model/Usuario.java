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
    private String email;
    private String senha;
    private int raca;
    
    private ArrayList<Cartas> inventario = new ArrayList<>(30);
    private Queue<Cartas> deck = new LinkedList<Cartas>();

    public Usuario(String nome, String email, String senha, int raca, ArrayList<Cartas> inventario,Queue<Cartas> deck) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.raca = raca;
        this.inventario = inventario;
        this.deck = deck;
    }

    public Usuario() {
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getRaca() {
        return raca;
    }

    public void setRaca(int raca) {
        this.raca = raca;
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
