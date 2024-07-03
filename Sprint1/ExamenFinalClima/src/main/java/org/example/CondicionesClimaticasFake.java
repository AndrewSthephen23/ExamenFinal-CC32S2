package org.example;

public class CondicionesClimaticasFake {
    public static Temperatura getTemperatura(double valor) {
        return new Temperatura(valor);
    }

    public static Lluvia getLluvia(double cantidad) {
        return new Lluvia(cantidad);
    }

    public static Viento getViento(double velocidad) {
        return new Viento(velocidad);
    }
}
