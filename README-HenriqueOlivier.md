# Sistema de Cálculo de Frete

Desenvolvido com **Java e Spring Boot**, este projeto tem como proposta principal calcular o valor do frete conforme a modalidade de entrega escolhida pelo usuário.

---

## Principais Recursos

- Cálculo automático do valor do frete
- Suporte a quatro tipos de entrega:
  - **Expressa**
  - **Econômica**
  - **Transportadora terceirizada**
  - **Transportadora via API externa**
- Envio de notificações ao cliente e à equipe responsável após a entrega ser concluída
- Arquitetura baseada em **padrões de projeto**, facilitando a manutenção e futuras melhorias

---

## Instruções de Uso

### Requisição de exemplo:

```
GET http://localhost:8080/frete/calcular?tipo=economica&peso=10.0
```

### Retorno esperado:

```
Frete (economica) para 10.0Kg: R$ 30.0
```

---

## Padrões de Projeto Utilizados

### Strategy – Definição da Lógica de Cálculo

O sistema seleciona dinamicamente a estratégia de cálculo com base no tipo de entrega informado.

- `FreteExpressa.java`
- `FreteEconomica.java`
- `FreteTercerizada.java`

---

### Adapter – Conexão com Transportadoras Externas

Para permitir a comunicação com APIs de transportadoras externas sem comprometer a estrutura do sistema, foi implementado um adaptador.

- `APITransportadoraExterna.java`
- `TransportadoraExternaAdapter.java`

---

### Observer – Envio de Notificações

A conclusão do processo de entrega aciona notificações automáticas para os envolvidos, como o cliente e a equipe interna.

- `NotificaCliente.java`
- `NotificaEquipeInterna.java`
- `NotificacaoEntrega.java`

---

## Estrutura do Projeto

```
atividadefrete/
├── controller/              → Responsável por gerenciar as requisições HTTP
├── service/                 → Camada que contém as regras de negócio
├── strategy/                → Estratégias de cálculo de frete
├── observer/                → Implementação das notificações
├── externotransportadora/  → Simulação da integração com uma API externa
```

---