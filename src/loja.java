import models.Produto;
import models.ProdutoNaoPerecivel;

public class loja {
    static void main() {
        Produto cadeira = new ProdutoNaoPerecivel("cadeira", 200.0, 2);
        cadeira.realizarVenda(2);
        cadeira.realizarVenda(1);
    }
}
