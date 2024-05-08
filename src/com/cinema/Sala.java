package com.cinema;

// Sessão é referente a sala do cinema.

public class Sala {
    private  int idSessao;
    private int capacidade;
    private String tipo;

    public Sala(int idSessao, int capacidade, String tipo) {
        this.idSessao = idSessao;
        this.capacidade = capacidade;
        this.tipo = tipo;
    }

    public int getIdSessao() {
        return idSessao;
    }

    public void setIdSessao(int idSessao) {
        this.idSessao = idSessao;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
