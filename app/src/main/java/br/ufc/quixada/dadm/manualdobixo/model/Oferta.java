package br.ufc.quixada.dadm.manualdobixo.model;

public class Oferta {

    private String titulo;
    private String endereco;
    private String tipo;
    private String descricao;
    private Float preco;
    private Integer qtdQuartos;

    public Oferta(String titulo, String endereco, String tipo, String descricao, Float preco, Integer qtdQuartos) {
        this.titulo = titulo;
        this.endereco = endereco;
        this.tipo = tipo;
        this.descricao = descricao;
        this.preco = preco;
        this.qtdQuartos = qtdQuartos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public Integer getQtdQuartos() {
        return qtdQuartos;
    }

    public void setQtdQuartos(Integer qtdQuartos) {
        this.qtdQuartos = qtdQuartos;
    }

}
