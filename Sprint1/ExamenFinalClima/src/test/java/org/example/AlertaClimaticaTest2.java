package org.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

public class AlertaClimaticaTest2 {
    @Test
    public void testGenerarAlertasConStubs() {
        // Creamos stubs usando Mockito
        Temperatura temperaturaStub = Mockito.mock(Temperatura.class);
        Lluvia lluviaStub = Mockito.mock(Lluvia.class);
        Viento vientoStub = Mockito.mock(Viento.class);

        // Configuramos respuestas predefinidas
        when(temperaturaStub.esCaliente()).thenReturn(true);
        when(lluviaStub.esIntensa()).thenReturn(false);
        when(vientoStub.esFuerte()).thenReturn(true);

        AlertaClimatica alertaClimatica = new AlertaClimatica(temperaturaStub, lluviaStub, vientoStub);
        List<String> alertas = alertaClimatica.generarAlertas();

        assertTrue(alertas.contains("Alerta: Temperatura Alta!"));
        assertTrue(alertas.contains("Alerta: Viento Fuerte!"));
        assertTrue(!alertas.contains("Alerta: Lluvia Intensa!"));
    }
}