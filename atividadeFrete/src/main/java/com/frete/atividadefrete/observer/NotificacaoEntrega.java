package com.frete.atividadefrete.observer;

import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class NotificacaoEntrega {

    private final List<ObservadorEntrega> observadores;

    public NotificacaoEntrega(List<ObservadorEntrega> observadores) {
        this.observadores = observadores;
    }

    public void notificarTodos(String tipo, double peso, double valor) {
        for (ObservadorEntrega o : observadores) {
            o.notificar(tipo, peso, valor);
        }
    }
}