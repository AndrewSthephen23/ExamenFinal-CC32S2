package org.example;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class AlertaClimaticaTest3 {
    @Test
    public void testGenerarAlertasConFakes() {
        // Usamos fakes para simular condiciones climáticas
        Temperatura tempFake = CondicionesClimaticasFake.getTemperatura(35.0);
        Lluvia lluviaFake = CondicionesClimaticasFake.getLluvia(60.0);
        Viento vientoFake = CondicionesClimaticasFake.getViento(80.0);

        AlertaClimatica alertaClimatica = new AlertaClimatica(tempFake, lluviaFake, vientoFake);
        List<String> alertas = alertaClimatica.generarAlertas();

        assertTrue(alertas.contains("Alerta: Temperatura Alta!"));
        assertTrue(alertas.contains("Alerta: Lluvia Intensa!"));
        assertTrue(alertas.contains("Alerta: Viento Fuerte!"));
    }
}