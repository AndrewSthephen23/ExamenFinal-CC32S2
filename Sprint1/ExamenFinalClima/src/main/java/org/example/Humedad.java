package org.example;

public class Humedad {
    private double porcentaje;

    public Humedad(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public boolean esAlta() {
        return porcentaje > 80.0;
    }
}
