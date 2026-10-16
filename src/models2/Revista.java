package models2;

import interfaces.Devolvivel;

public class Revista extends Material implements Devolvivel {
    private String numeroEdicao;
    private String mesPublicacao;

    public Revista(String titulo, String codigoVerificacao, Integer quantidade, String numeroEdicao, String mesPublicacao) {
        super(titulo, codigoVerificacao, quantidade);
        this.numeroEdicao = numeroEdicao;
        this.mesPublicacao = mesPublicacao;
    }

    public String getNumeroEdicao() {
        return numeroEdicao;
    }

    public void setNumeroEdicao(String numeroEdicao) {
        this.numeroEdicao = numeroEdicao;
    }

    public String getMesPublicacao() {
        return mesPublicacao;
    }

    public void setMesPublicacao(String mesPublicacao) {
        this.mesPublicacao = mesPublicacao;
    }

    @Override
    public Integer prazoDevolucao() {
        return 7;
    }

    @Override
    public void devolver() {
        setQuantidade(getQuantidade()+1);
        System.out.println(getTitulo()+" devolvido");
    }
}
