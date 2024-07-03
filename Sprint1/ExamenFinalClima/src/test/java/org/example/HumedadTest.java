package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HumedadTest {
    @Test
    public void testEsAlta() {
        Humedad humedad = new Humedad(85.0);
        assertTrue(humedad.esAlta());
    }

    @Test
    public void testNoEsAlta() {
        Humedad humedad = new Humedad(60.0);
        assertFalse(humedad.esAlta());
    }
}