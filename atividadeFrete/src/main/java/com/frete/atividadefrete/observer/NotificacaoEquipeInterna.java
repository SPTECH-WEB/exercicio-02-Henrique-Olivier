package com.frete.atividadefrete.observer;
import org.springframework.stereotype.Component;

@Component
public class NotificacaoEquipeInterna implements ObservadorEntrega {

    @Override
    public void notificar(String tipo, double peso, double valor) {
        System.out.println("[Equipe Interna] Entrega registrada: " + tipo + " | Peso: " + peso + "kg | R$" + valor);
    }
}