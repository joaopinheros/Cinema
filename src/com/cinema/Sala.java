package com.cinema;

// Sessão é referente a sala do cinema.

public class Sala {
    private  int idsala;
    private int capacidade;
    private String tipo;

    public Sala(int idsala, int capacidade, String tipo) {
        this.idsala = idsala;
        this.capacidade = capacidade;
        this.tipo = tipo;
    }

    public int getIdsala() {
        return idsala;
    }

    public void setIdsala(int idsala) {
        this.idsala = idsala;
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

@Override
    public String toString() {
    return "Sala{" +
            "idsala=" + idsala +
            ", capacidade=" + capacidade +
            ", tipo='" + tipo + '\'' +
            '}';
}

}
