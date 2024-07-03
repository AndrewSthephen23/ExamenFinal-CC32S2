package org.example;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class AlertaClimaticaTest {
    @Test
    public void testGenerarAlertas() {
        Temperatura temp = new Temperatura(35.0);
        Lluvia lluvia = new Lluvia(25.0);
        Viento viento = new Viento(55.0);

        AlertaClimatica alertaClimatica = new AlertaClimatica(temp, lluvia, viento);
        List<String> alertas = alertaClimatica.generarAlertas();

        assertTrue(alertas.contains("Alerta: Temperatura Alta!"));
        assertTrue(alertas.contains("Alerta: Lluvia Intensa!"));
        assertTrue(alertas.contains("Alerta: Viento Fuerte!"));
    }
}