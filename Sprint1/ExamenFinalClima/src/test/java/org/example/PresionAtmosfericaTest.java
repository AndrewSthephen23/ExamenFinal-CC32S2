package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PresionAtmosfericaTest {
    @Test
    public void testEsBaja() {
        PresionAtmosferica presion = new PresionAtmosferica(950.0);
        assertTrue(presion.esBaja());
    }

    @Test
    public void testNoEsBaja() {
        PresionAtmosferica presion = new PresionAtmosferica(1020.0);
        assertFalse(presion.esBaja());
    }
}