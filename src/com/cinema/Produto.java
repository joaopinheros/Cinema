package com.cinema;

import java.util.Date;


public class Produto {
    private String nome;
    private String categoria;
    private Date dataFabricacao;
    private Date dataValidade;
    private double precoUnitario;
    private int quantidadeEstoque;
    private int produtoId;
    private static int count = 0;
    


    public Produto(String nome, String categoria, Date dataFabricacao, Date dataValidade, double precoUnitario, int quantidadeEstoque, int produtoId) {
        this.nome = nome;
        this.categoria = categoria;
        this.dataFabricacao = dataFabricacao;
        this.dataValidade = dataValidade;
        this.precoUnitario = precoUnitario;
        this.quantidadeEstoque = quantidadeEstoque;
        this.produtoId = count;
        count++;
    }

    public Produto() {

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
    
    public int getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(int produtoId) {
        this.produtoId = produtoId;
    }

    @Override
public String toString() {
    return "Produto{" +
            "nome='" + nome + '\'' +
            ", categoria='" + categoria + '\'' +
            ", dataFabricacao=" + dataFabricacao +
            ", dataValidade=" + dataValidade +
            ", precoUnitario=" + precoUnitario +
            ", quantidadeEstoque=" + quantidadeEstoque +
            ", produtoId=" + produtoId +
            '}';
}

}
