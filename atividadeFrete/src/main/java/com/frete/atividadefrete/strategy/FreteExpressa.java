package com.frete.atividadefrete.strategy;

import org.springframework.stereotype.Component;

@Component
public class FreteExpressa implements FreteStrategy {
    @Override
    public double calcular(double peso) {
        return 5.0 * peso;
    }

    @Override
    public String tipo() {
        return "Expressa";
    }
}
