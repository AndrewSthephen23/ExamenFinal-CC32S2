package org.example;

import java.util.ArrayList;
import java.util.List;

public class AlertaClimatica {
    private Temperatura temperatura;
    private Lluvia lluvia;
    private Viento viento;

    public AlertaClimatica(Temperatura temperatura, Lluvia lluvia, Viento viento) {
        this.temperatura = temperatura;
        this.lluvia = lluvia;
        this.viento = viento;
    }

    public List<String> generarAlertas() {
        List<String> alertas = new ArrayList<>();

        if (temperatura.esCaliente()) {
            alertas.add("Alerta: Temperatura Alta!");
        }

        if (lluvia.esIntensa()) {
            alertas.add("Alerta: Lluvia Intensa!");
        }

        if (viento.esFuerte()) {
            alertas.add("Alerta: Viento Fuerte!");
        }

        return alertas;
    }

    public static void main(String[] args) {
        Temperatura temp = new Temperatura(35.0);
        Lluvia lluvia = new Lluvia(25.0);
        Viento viento = new Viento(55.0);

        AlertaClimatica alertaClimatica = new AlertaClimatica(temp, lluvia, viento);
        List<String> alertas = alertaClimatica.generarAlertas();

        for (String alerta : alertas) {
            System.out.println(alerta);
        }
    }
}
