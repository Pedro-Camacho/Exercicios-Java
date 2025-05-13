package ports;

import dominio.Produto;
import ports.saida.ProdutoService;

import java.util.HashMap;
import java.util.Map;

public class InMemoryProdRepo implements ProdutoService {
    private final Map<String, Produto> storage = new HashMap<>();
    @Override
    public void salvarProduto(Produto produto) {
        storage.put(produto.getNome(), produto);
    }

    @Override
    public Produto buscaProduto(String nomeProduto) {
        return storage.get(nomeProduto);
    }
}
