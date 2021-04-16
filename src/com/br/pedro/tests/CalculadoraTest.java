package com.br.pedro.tests;

import com.br.pedro.entities.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

class CalculadoraTest {

    @Test
    void testSumA() {
        int result = 10;
        int expectedResult = Calculadora.sum(8, 2);
        assertTrue(result == expectedResult);
    }

    @Test
    void testSumB(){
        int result = 11;
        int expectedResult = Calculadora.sum(8, 2);
        assertEquals(result , expectedResult);
    }

    @Test
    void testSumC(){
        int result = 12;
        int expectedResult = Calculadora.sum(6, 6);
        assertTrue(result == expectedResult);
    }

    @Test
    void testSumD(){
        int result = 20;
        int expectedResult = Calculadora.sum(10, 8);
        assertTrue(result == expectedResult);
    }
}