package com.frete.atividadefrete.adapter;

import com.frete.atividadefrete.externotransportadora.APITransportadoraExterna;
import com.frete.atividadefrete.strategy.FreteStrategy;
import org.springframework.stereotype.Component;

@Component
public class TransportadoraExternaAdapter implements FreteStrategy {

    private final APITransportadoraExterna apiExterna;

    public TransportadoraExternaAdapter() {
        this.apiExterna = new APITransportadoraExterna();
    }

    @Override
    public double calcular(double peso) {
        return apiExterna.calcularCustoEnvio(peso);
    }

    @Override
    public String tipo() {
        return "externa";
    }
}