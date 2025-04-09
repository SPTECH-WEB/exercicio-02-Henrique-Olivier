package com.frete.atividadefrete.observer;
import org.springframework.stereotype.Component;

@Component
public class NotificacaoCliente implements ObservadorEntrega {

    @Override
    public void notificar(String tipo, double peso, double valor) {
        System.out.println("[Cliente] Sua entrega (" + tipo + ") foi calculada: R$" + valor);
    }
}
