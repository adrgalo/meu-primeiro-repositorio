package br.com.cotemig.convert.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FOLHATest {

    @Test
    void calculoFolha() {
        FOLHA folha = new FOLHA();
        assertEquals(1306.10,folha.calculoFolha(1412.00));
        assertEquals(2192.18,folha.calculoFolha(2600.00));
        assertEquals(2291.18,folha.calculoFolha(3000.00));
        assertEquals(3143.2518,folha.calculoFolha(4664.68));
    }
}