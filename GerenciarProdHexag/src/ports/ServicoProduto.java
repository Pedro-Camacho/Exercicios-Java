package ports;

import dominio.Produto;
import ports.entrada.ProdutoPorta;
import ports.saida.ProdutoService;

public class ServicoProduto implements ProdutoPorta {
    private final ProdutoService repo;

    public ServicoProduto(ProdutoService repo) {
        this.repo = repo;
    }

    @Override
    public void cadastrarProduto(String nome, double preco, int codigo) {
        Produto produto = new Produto(nome, preco, codigo);
        repo.salvarProduto(produto);

    }

    @Override
    public void mudarPreco(Produto produto, double novoPreco) {
        produto.setPreco(novoPreco);
    }
}
