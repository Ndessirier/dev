package com.example.demo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DemoApplicationTests {

    @Test
    public void testAdd() {
        // Logique de test pour l'addition
        assertEquals(4, Calculator.add(2, 2));
    }

    @Test
    public void testMultiply() {
        // Logique de test pour la multiplication
        assertEquals(6, Calculator.multiply(2, 3));
    }

    @Test
    public void testDivide() {
        // Logique de test pour la division
        assertEquals(2, Calculator.divide(6, 3));
    }
}
