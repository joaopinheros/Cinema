package com.cinema;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ingresso {
    private int idIngresso;
    private String tipo;
    private Filme filme;
    private Sala sala;
    private Date dataHora;
    private double preco;

    public Ingresso(int idIngresso, String tipo, Filme filme, Sala sala, Date dataHora, double preco) {
        this.idIngresso = idIngresso;
        this.tipo = tipo;
        this.filme = filme;
        this.sala = sala;
        this.dataHora = dataHora;
        this.preco = preco;
    }

    public Ingresso() {
        this.idIngresso = idIngresso;
        this.tipo = tipo;
        this.filme = filme;
        this.sala = sala;
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

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
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

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        return "Ingresso{" +
                "idIngresso=" + idIngresso +
                ", tipo='" + tipo + '\'' +
                ", filme=" + filme +
                ", sala=" + sala +
                ", dataHora=" + dateFormat.format(dataHora) +
                ", preco=" + preco +
                '}';
    }
}