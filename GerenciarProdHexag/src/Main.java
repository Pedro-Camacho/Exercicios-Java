import dominio.Produto;
import ports.InMemoryProdRepo;
import ports.ServicoProduto;
import ports.entrada.ProdutoPorta;
import ports.saida.ProdutoService;

public class Main {
    public static void main(String[] args) {
        ProdutoService repo = new InMemoryProdRepo();
        ServicoProduto service =new ServicoProduto(repo);

        service.cadastrarProduto("Sabonete", 13.4, 2234);

    }
}