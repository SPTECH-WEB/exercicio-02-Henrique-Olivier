package com.frete.atividadefrete.strategy;

import org.springframework.stereotype.Component;

@Component
public class FreteTercerizada implements FreteStrategy {
    @Override
    public double calcular(double peso) {
        return 7.0 * peso;
    }

    @Override
    public String tipo() {
        return "Tercerizada";
    }
}
