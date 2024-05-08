package com.cinema;

import java.util.Date;

public class Ingresso {
    private int idIngresso;
    private String tipo;
    private Filme filme;
    private Sessao sessao;
    private Date dataHora;
    private double preco;

    public Ingresso(int idIngresso, String tipo, Filme filme, Sessao sessao, Date dataHora, double preco) {
        this.idIngresso = idIngresso;
        this.tipo = tipo;
        this.filme = filme;
        this.sessao = sessao;
        this.dataHora = dataHora;
        this.preco = preco;
    }

    public int getIdIngresso() {
        return idIngresso;
    }

    public void setIdIngresso(int idIngresso) {
        this.idIngresso = idIngresso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Sessao getSala() {
        return sessao;
    }

    public void setSala(Sessao sessao) {
        this.sessao = sessao;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
