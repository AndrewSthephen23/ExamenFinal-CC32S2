package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperaturaTest {
    @Test
    public void testEsCaliente() {
        Temperatura temp = new Temperatura(35.0);
        assertTrue(temp.esCaliente());
    }

    @Test
    public void testEsFrio() {
        Temperatura temp = new Temperatura(5.0);
        assertTrue(temp.esFrio());
    }

    @Test
    public void testNoEsCalienteNiFrio() {
        Temperatura temp = new Temperatura(20.0);
        assertFalse(temp.esCaliente());
        assertFalse(temp.esFrio());
    }
}