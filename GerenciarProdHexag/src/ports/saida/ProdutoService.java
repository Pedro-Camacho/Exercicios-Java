package ports.saida;

import dominio.Produto;

public interface ProdutoService {
    void salvarProduto(Produto produto);
    Produto buscaProduto(String nomeProduto);
}
