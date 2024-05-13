package com.cinema.cine;

/**
 * Representa um filme do cinema.
 */
public class Filme {
    private int id;
    private String titulo; /** O nome do filme */
    private String genero; /** O gênero do filme para assimilar com as preferências do cliente */
    private String diretor; /** O diretor do filme */
    private String descrição; /* A descrição do filme */
    private int duracao; /* Em minutos */


    public Filme(int id, String titulo, String genero, String diretor, String descrição, int duracao) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.diretor = diretor;
        this.descrição = descrição;
        this.duracao = duracao;
    }

    public Filme(String titulo, String genero, String diretor, String descrição, int duracao) {
        this.titulo = titulo;
        this.genero = genero;
        this.diretor = diretor;
        this.descrição = descrição;
        this.duracao = duracao;
    }

    public Filme(){

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtém o gênero do filme.
     * @return O gênero do filme.
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Define o gênero do filme.
     * @param genero O novo gênero do filme.
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Obtém o diretor do filme.
     * @return O diretor do filme.
     */
    public String getDiretor() {
        return diretor;
    }

    /**
     * Define o diretor do filme.
     * @param diretor O novo diretor do filme.
     */
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    /**
     * Obtém a descrição do filme.
     * @return A descrição do filme.
     */
    public String getDescrição() {
        return descrição;
    }

    /**
     * Define a descrição do filme.
     * @param descrição A nova descrição do filme.
     */
    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    /**
     * Retorna uma representação em string do filme.
     * @return Uma string que representa o filme.
     */
    @Override
    public String toString() {
        return "Filme{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", diretor='" + diretor + '\'' +
                ", descrição='" + descrição + '\'' +
                ", duracao=" + duracao +
                '}';
    }
}

