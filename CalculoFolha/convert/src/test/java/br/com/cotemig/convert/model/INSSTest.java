package br.com.cotemig.convert.model;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.*;
class INSSTest {

    @Test
    void calculoInss() {

        INSS inss = new INSS();
        assertEquals(105.00,inss.calculoInss(1400.00));
        assertEquals(212.82,inss.calculoInss(2600.00));
    }
}