import models2.Livro;
import models2.Material;
import models2.Revista;
import services.Carrinho;
import services.Carrinho2;

public class biblioteca {
    static void main() {
        Carrinho carrinho = new Carrinho();
        Carrinho2 carrinho2 = new Carrinho2();
        Livro livro = new Livro("senhor dos aneis", "11", 2, "tolkien", "aw23");
        Material livro2 = new Livro("duna", "1", 1, "heljfe", "2332d");
        carrinho.addMaterial(livro);
        carrinho2.addMaterial(livro);
        carrinho2.addMaterial(livro2);
        Material revista = new Revista("mad", "32", 1, "4", "april");
        carrinho.addMaterial(revista);
        carrinho2.addMaterial(revista);
        carrinho2.finalizarCarrinho();
        livro.devolver();
        System.out.println(livro.getQuantidade());

    }
}
