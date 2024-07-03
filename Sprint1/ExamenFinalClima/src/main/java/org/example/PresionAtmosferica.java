package org.example;

public class PresionAtmosferica {
    private double presion;

    public PresionAtmosferica(double presion) {
        this.presion = presion;
    }

    public double getPresion() {
        return presion;
    }

    public boolean esBaja() {
        return presion < 1000.0; // Ejemplo de criterio
    }
}
