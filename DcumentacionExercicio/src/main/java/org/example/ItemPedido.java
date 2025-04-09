package org.example;

public class ItemPedido {

    private String descricao;
    private double preco;
    private int quantidade;

    /**
     *
     * @param descricao
     * @param preco
     * @param quantidade
     */
    public ItemPedido(String descricao, double preco, int quantidade) {
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    /**
     *
     * @return get descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     *
     * @return get precos
     */
    public double getPreco() {
        return preco;
    }

    /**
     *
     * @return get quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }
}
