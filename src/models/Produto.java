package models;

public abstract class Produto {
    private String nome;
    private Double preco;
    private Integer quantidade;

    public Produto(String nome, Double preco, Integer quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public boolean realizarVenda(int qtd) {
        if (quantidade == 0) {
            System.out.println("Produto sem estoque");
            return false;
        }
        if (qtd <= quantidade) {
            quantidade -= qtd;
            System.out.println("venda realizada com sucesso");
            System.out.println(nome+", preco: "+preco+ ", quantidade: "+quantidade);
            if (quantidade < 7) {
                System.out.println("alerta de estoque baixo");
            }
            return true;
        }
        else{
            System.out.println("mais pedidos que estoque disponivel");
            return false;
        }
    }
}
