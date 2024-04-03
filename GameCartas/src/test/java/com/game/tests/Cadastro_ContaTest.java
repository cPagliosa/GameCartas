package com.game.tests;

import com.game.gui.Cadastro_Conta;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author LaisVarela
 */
public class Cadastro_ContaTest {

    private Cadastro_Conta cadastro;

    public Cadastro_ContaTest() {
        this.cadastro = new Cadastro_Conta();
    }

    @Test
    public void testVerificaSeLoginENumero1(){
       assertEquals("1", this.cadastro.getTxt_Usuario(),"Login é o número 1");
    }
}
