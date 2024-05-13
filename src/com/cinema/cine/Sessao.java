package com.cinema.cine;

public class Sessao {

    private int codSessao;
    private Filme filme;
    private Sala sala;
    private String dataHora;

    public Sessao(int codSessao, Filme filme, Sala sala, String dataHora) {
        this.codSessao = codSessao;
        this.filme = filme;
        this.sala = sala;
        this.dataHora = dataHora;
    }

    public Sessao(Filme filme, Sala sala, String dataHora) {
        this.filme = filme;
        this.sala = sala;
        this.dataHora = dataHora;
    }

    public int getCodSessao() {
        return codSessao;
    }

    public void setCodSessao(int codSessao) {
        this.codSessao = codSessao;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    @Override
    public String toString() {
        return "Sessao{" +
                "codSessao=" + codSessao +
                ", filme=" + filme +
                ", sala=" + sala +
                ", dataHora='" + dataHora + '\'' +
                '}';
    }
}
