package models2;

import interfaces.Devolvivel;

public class Livro extends Material implements Devolvivel {
    private String autor;
    private String ISBN;

    public Livro(String titulo, String codigoVerificacao, Integer quantidade, String autor, String ISBN) {
        super(titulo, codigoVerificacao, quantidade);
        this.autor = autor;
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public Integer prazoDevolucao() {
        return 14;
    }

    @Override
    public void devolver() {
        setQuantidade(getQuantidade()+1);
        System.out.println(getTitulo()+" devolvido");
    }
}
