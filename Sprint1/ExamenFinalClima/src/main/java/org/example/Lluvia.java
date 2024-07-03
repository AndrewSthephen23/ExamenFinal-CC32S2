package org.example;

public class Lluvia {
    private double cantidad;

    public Lluvia(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getCantidad() {
        return cantidad;
    }

    public boolean esIntensa() {
        return cantidad > 20.0;
    }
}

