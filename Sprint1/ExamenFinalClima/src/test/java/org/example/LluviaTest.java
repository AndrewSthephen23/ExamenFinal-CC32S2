package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LluviaTest {
    @Test
    public void testEsIntensa() {
        Lluvia lluvia = new Lluvia(60.0);
        assertTrue(lluvia.esIntensa());
    }

    @Test
    public void testNoEsIntensa() {
        Lluvia lluvia = new Lluvia(20.0);
        assertFalse(lluvia.esIntensa());
    }
}