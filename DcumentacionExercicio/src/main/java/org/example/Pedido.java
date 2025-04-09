package org.example;

import java.time.LocalDateTime;
import java.util.List;

public class Pedido {

    private int numero;
    private String cliente;
    private LocalDateTime dataHora;
    private List<ItemPedido> itens;
    private boolean finalizado;

    /**
     *
     * @param numero
     * @param cliente
     * @param dataHora
     * @param itens
     * @param finalizado
     */
    public Pedido(int numero, String cliente, LocalDateTime dataHora, List<ItemPedido> itens, boolean finalizado) {
        this.numero = numero;
        this.cliente = cliente;
        this.dataHora = dataHora;
        this.itens = itens;
        this.finalizado = finalizado;
    }

    /**
     *
     * @param descricao
     * @param preco
     * @param quantidade
     * Adiciona itens a lista de pedido
     */
    public void adicionarItem(String descricao, double preco, int quantidade){
        itens.add(new ItemPedido(descricao, preco, quantidade));
    }

    /**
     *
     * @return total retorna o valor total do pedido no carrinho
     */
    public double calcularTotal(){
        double total = 0;
        for(ItemPedido item : itens){
            total+= item.getPreco() * item.getQuantidade();
        }
        return total;
    }

    public void finalizarPedido(){
        //finaliza o pedido
        this.finalizado = true;
    }

    /**
     *
     * @return retorna o estado de um pedido
     *
     */
    public boolean isFinalizado(){
        return finalizado;
    }

    /**
     *
     * @return get numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     *
     * @return get cliente
     */
    public String getCliente() {
        return cliente;
    }

    /**
     *
     * @return get data hora
     */
    public LocalDateTime getDataHora() {
        return dataHora;
    }

    /**
     *
     * @return get itens pedidos
     */
    public List<ItemPedido> getItens() {
        return itens;
    }
}

