package com.frete.atividadefrete.service;

import com.frete.atividadefrete.observer.NotificacaoEntrega;
import com.frete.atividadefrete.strategy.FreteStrategy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FreteService {
    private final List<FreteStrategy> estrategias;
    private final NotificacaoEntrega notificacaoEntrega;

    public FreteService(List<FreteStrategy> estrategias, NotificacaoEntrega notificacaoEntrega) {
        this.estrategias = estrategias;
        this.notificacaoEntrega = notificacaoEntrega;
    }

    public double calcular(String tipo, double peso) {
        FreteStrategy estrategia = estrategias.stream()
                .filter(e -> e.tipo().equalsIgnoreCase(tipo))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Tipo de frete inválido: " + tipo));

        double valor = estrategia.calcular(peso);
        notificacaoEntrega.notificarTodos(tipo, peso, valor);
        return valor;
    }
}
