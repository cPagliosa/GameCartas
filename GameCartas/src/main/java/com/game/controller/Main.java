package com.game.controller;

import com.game.gui.Janela;

public class Main {
    //chama o controller dela
    public static Controller_Main main;
    
    public static void main(String[] args) {
        //inicia o jogo
        main = new Controller_Main();
        main.start();
        
    }
}
