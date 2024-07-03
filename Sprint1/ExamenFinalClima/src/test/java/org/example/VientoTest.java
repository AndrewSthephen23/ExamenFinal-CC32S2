package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VientoTest {
    @Test
    public void testEsFuerte() {
        Viento viento = new Viento(80.0);
        assertTrue(viento.esFuerte());
    }

    @Test
    public void testNoEsFuerte() {
        Viento viento = new Viento(30.0);
        assertFalse(viento.esFuerte());
    }
}