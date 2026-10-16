package models2;

public abstract class Material {
    private String titulo;
    private String codigoVerificacao;
    private Integer quantidade;

    public Material(String titulo, String codigoVerificacao, Integer quantidade) {
        this.titulo = titulo;
        this.codigoVerificacao = codigoVerificacao;
        this.quantidade = quantidade;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCodigoVerificacao() {
        return codigoVerificacao;
    }

    public void setCodigoVerificacao(String codigoVerificacao) {
        this.codigoVerificacao = codigoVerificacao;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;

    }
    public abstract Integer prazoDevolucao();
}
