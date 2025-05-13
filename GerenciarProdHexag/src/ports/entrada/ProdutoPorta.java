package ports.entrada;

import dominio.Produto;

public interface ProdutoPorta {
    void cadastrarProduto(String nome, double preco, int codigo);
    void mudarPreco(Produto produto, double novoPreco);
}
