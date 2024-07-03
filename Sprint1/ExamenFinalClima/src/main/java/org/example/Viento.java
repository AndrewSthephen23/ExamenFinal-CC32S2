package org.example;

public class Viento {
    private double velocidad;

    public Viento(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public boolean esFuerte() {
        return velocidad > 50.0;
    }
}
