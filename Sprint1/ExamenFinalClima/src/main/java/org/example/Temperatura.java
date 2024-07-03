package org.example;

public class Temperatura {
    private double valor;

    public Temperatura(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public boolean esCaliente() {
        return valor > 30.0;
    }

    public boolean esFrio() {
        return valor < 10.0;
    }
}

