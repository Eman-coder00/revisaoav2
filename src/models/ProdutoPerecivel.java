package models;

public class ProdutoPerecivel extends Produto{
    private String dataValidade;


    public ProdutoPerecivel(String nome, Double preco, Integer quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }
}
