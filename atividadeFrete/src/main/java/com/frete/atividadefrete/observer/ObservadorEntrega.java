package com.frete.atividadefrete.observer;

public interface ObservadorEntrega {
    void notificar(String tipo, double peso, double valor);
}