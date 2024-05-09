package com.cinema.produto;

import java.util.Date;

/**
 * Representa um produto disponível no cinema.
 */
public class Produto {
    private String nome; // Nome do produto
    private String categoria; // Categoria do produto
    private Date dataFabricacao; // Data de fabricação do produto
    private Date dataValidade; // Data de validade do produto
    private double precoUnitario; // Preço unitário do produto
    private int quantidadeEstoque; // Quantidade em estoque do produto
    private int produtoId; // Identificador único do produto
    private static int count = 0; // Contador para gerar IDs únicos

    /**
     * Construtor para criar um novo produto com todos os detalhes especificados.
     *
     * @param nome              O nome do produto.
     * @param categoria         A categoria do produto.
     * @param dataFabricacao    A data de fabricação do produto.
     * @param dataValidade      A data de validade do produto.
     * @param precoUnitario     O preço unitário do produto.
     * @param quantidadeEstoque A quantidade em estoque do produto.
     * @param produtoId         O identificador único do produto.
     */
    public Produto(String nome, String categoria, Date dataFabricacao, Date dataValidade,
                   double precoUnitario, int quantidadeEstoque, int produtoId) {
        this.nome = nome;
        this.categoria = categoria;
        this.dataFabricacao = dataFabricacao;
        this.dataValidade = dataValidade;
        this.precoUnitario = precoUnitario;
        this.quantidadeEstoque = quantidadeEstoque;
        this.produtoId = count; // Atribui o ID e incrementa o contador
        count++;
    }

    /**
     * Retorna o nome do produto.
     *
     * @return O nome do produto.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do produto.
     *
     * @param nome O novo nome do produto.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna a categoria do produto.
     *
     * @return A categoria do produto.
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Define a categoria do produto.
     *
     * @param categoria A nova categoria do produto.
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Retorna a data de fabricação do produto.
     *
     * @return A data de fabricação do produto.
     */
    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    /**
     * Define a data de fabricação do produto.
     *
     * @param dataFabricacao A nova data de fabricação do produto.
     */
    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    /**
     * Retorna a data de validade do produto.
     *
     * @return A data de validade do produto.
     */
    public Date getDataValidade() {
        return dataValidade;
    }

    /**
     * Define a data de validade do produto.
     *
     * @param dataValidade A nova data de validade do produto.
     */
    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    /**
     * Retorna o preço unitário do produto.
     *
     * @return O preço unitário do produto.
     */
    public double getPrecoUnitario() {
        return precoUnitario;
    }

    /**
     * Define o preço unitário do produto.
     *
     * @param precoUnitario O novo preço unitário do produto.
     */
    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    /**
     * Retorna a quantidade em estoque do produto.
     *
     * @return A quantidade em estoque do produto.
     */
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    /**
     * Define a quantidade em estoque do produto.
     *
     * @param quantidadeEstoque A nova quantidade em estoque do produto.
     */
    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    /**
     * Retorna o identificador único do produto.
     *
     * @return O identificador único do produto.
     */
    public int getProdutoId() {
        return produtoId;
    }

    /**
     * Define o identificador único do produto.
     *
     * @param produtoId O novo identificador único do produto.
     */
    public void setProdutoId(int produtoId) {
        this.produtoId = produtoId;
    }

    /**
     * Retorna uma representação em string do objeto Produto.
     *
     * @return Uma string que representa o objeto Produto.
     */
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
