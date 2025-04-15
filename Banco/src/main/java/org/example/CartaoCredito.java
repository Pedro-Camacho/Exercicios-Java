package org.example;

public class CartaoCredito implements  Pagamento{
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento processado com cartão de crédito: "+ valor);
    }
}
