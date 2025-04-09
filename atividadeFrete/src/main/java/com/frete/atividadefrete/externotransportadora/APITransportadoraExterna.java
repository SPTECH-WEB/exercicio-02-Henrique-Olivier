package com.frete.atividadefrete.externotransportadora;

public class APITransportadoraExterna {
    public double calcularCustoEnvio(double pesoEmKg) {
        return 25.0 + pesoEmKg * 0.18;
    }
}