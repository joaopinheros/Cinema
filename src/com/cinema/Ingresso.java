package com.cinema;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Ingresso {
    private int idIngresso;
    private String tipo;
    private Filme filme;
    private Sala sala;
    private LocalDateTime dataHora;
    private double preco;

    private List<Ingresso> ingressos = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    /** Cadastrar novo ingresso*/

    public String cadastrarIngresso(Ingresso ingresso) {
        Ingresso novoIngresso = new Ingresso();

        System.out.println("Digite a Identificação do ingresso: ");
        int idIngresso = sc.nextInt();
        novoIngresso.setIdIngresso(idIngresso);

        System.out.println("Digite o tipo do ingresso: ");
        sc.nextLine();
        String tipo = sc.nextLine();
        novoIngresso.setTipo(tipo);

        System.out.println("Digite a data e a hora do filme (no formato yyyy-MM-dd HH:mm): ");
        String dataHoraInput = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dataHora = LocalDateTime.parse(dataHoraInput, formatter);
        novoIngresso.setDataHora(dataHora);

        System.out.println("Digite o preço do ingresso: ");
        double preco = sc.nextDouble();
        novoIngresso.setPreco(preco);

        System.out.println("Digite o Filme: ");
        sc.nextLine(); // Consumir a quebra de linha deixada pelo nextDouble() antes de ler a string
        String filme = sc.nextLine();
        novoIngresso.setFilme(getFilme());

        System.out.println("Digite a Sala do filme:");
        int sala = sc.nextInt();
        novoIngresso.setSala(getSala());

        ingressos.add(novoIngresso);
        return ingressos.toString();
    }

    public Ingresso(int idIngresso, String tipo, Filme filme, Sala sala, LocalDateTime dataHora, double preco) {
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

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
