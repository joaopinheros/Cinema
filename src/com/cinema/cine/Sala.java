package com.cinema.cine;

/**
 * Representa uma sala de cinema.
 */
public class Sala {
    /** Identificador único da sala. */
    private int idsala;

    /** Capacidade máxima de assentos da sala. */
    private int numPoltronas;

    private boolean status;

    /**
     * Construtor da Sala.
     * @param idsala O identificador único da sala.
     * @param numPoltronas máxima de assentos da sala.
     * */
    public Sala(int idsala, int numPoltronas, boolean status) {
        this.idsala = idsala;
        this.numPoltronas = numPoltronas;
        this.status = status;
    }

    /**
     * Obtém o identificador da sala.
     * @return O identificador da sala.
     */
    public int getIdsala() {
        return idsala;
    }

    /**
     * Define o identificador da sala.
     * @param idsala O novo identificador da sala.
     */
    public void setIdsala(int idsala) {
        this.idsala = idsala;
    }

    public int getNumPoltronas() {
        return numPoltronas;
    }

    public void setNumPoltronas(int numPoltronas) {
        this.numPoltronas = numPoltronas;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * Retorna uma representação em formato de string da sala.
     * @return Uma string representando a sala.
     */
    @Override
    public String toString() {
        return "Sala{" +
                "idsala=" + idsala +
                ", numPoltronas=" + numPoltronas +
                ", status=" + status +
                '}';
    }
}
