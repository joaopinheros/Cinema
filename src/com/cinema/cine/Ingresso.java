package com.cinema.cine;

/**
 * Representa um ingresso para um filme em um cinema.
 */
public class Ingresso {
    private int idIngresso;  // Identificação única do ingresso
    private String tipo;  // Tipo do ingresso (ex: inteiro, meia-entrada)
    private double preco;  // Preço do ingresso
    private Sessao sessao;
    /**
     * Construtor para um ingresso com todos os atributos.
     */
    public Ingresso(int idIngresso, String tipo, double preco, Sessao sessao) {
        this.idIngresso = idIngresso;
        this.tipo = tipo;
        this.preco = preco;
        this.sessao = sessao;
    }

    /**
     * Construtor padrão para um ingresso.
     */
    public Ingresso() {

    }

    // Getters e setters para os atributos da classe

    /**
     * Obtém a identificação do ingresso.
     * @return A identificação do ingresso.
     */
    public int getIdIngresso() {
        return idIngresso;
    }

    /**
     * Define a identificação do ingresso.
     * @param idIngresso A identificação do ingresso a ser definida.
     */
    public void setIdIngresso(int idIngresso) {
        this.idIngresso = idIngresso;
    }

    /**
     * Obtém o tipo do ingresso.
     * @return O tipo do ingresso.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define o tipo do ingresso.
     * @param tipo O tipo do ingresso a ser definido.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    /**
     * Obtém o preço do ingresso.
     * @return O preço do ingresso.
     */
    public double getPreco() {
        return preco;
    }

    /**
     * Define o preço do ingresso.
     * @param preco O preço do ingresso a ser definido.
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }
}
