package com.cinema.balcao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Representa um balcão automático de atendimento no cinema.
 */
public class BalcaoAut {

    /** Lista de balcões automáticos disponíveis */
    private static List<BalcaoAut> balcoesDisponiveis = new ArrayList<>();

    /** Identificador único do balcão */
    private int idBalcao;

    // Balcao fixo para teste
    private static BalcaoAut balcao1 = new BalcaoAut(1);

    /**
     * Construtor da classe BalcaoAut.
     * @param idBalcao O identificador único do balcão a ser criado.
     */
    public BalcaoAut(int idBalcao) {
        this.idBalcao = idBalcao;
        balcoesDisponiveis.add(this);
    }

    /**
     * Obtém o identificador do balcão.
     * @return O identificador único do balcão.
     */
    public int getIdBalcao() {
        return idBalcao;
    }

    /**
     * Retorna uma representação em string do objeto BalcaoAut.
     * @return Uma string contendo o identificador do balcão.
     */
    @Override
    public String toString() {
        return "BalcaoAut{" +
                "idBalcao=" + idBalcao +
                '}';
    }

    /**
     * Seleciona um balcão automático disponível para atendimento.
     * @return O balcão automático selecionado, ou null se nenhum estiver disponível.
     */
    public static BalcaoAut selecionarBalcao() {
        if (!balcoesDisponiveis.isEmpty()) {
            BalcaoAut balcaoSelecionado = balcoesDisponiveis.get(0);
            System.out.println("O Balcão " + balcaoSelecionado.getIdBalcao() + " foi selecionado.");
            return balcaoSelecionado;
        } else {
            System.out.println("Nenhum balcão automático disponível no momento.");
            return null;
        }
    }

    /**
     * Retorna a lista de balcões automáticos disponíveis.
     * @return A lista de balcões automáticos disponíveis.
     */
    public static List<BalcaoAut> getBalcoesDisponiveis() {
        return balcoesDisponiveis;
    }

    public static void main(String[] args) {
        // Teste para selecionar o balcão automático fixo
        BalcaoAut.selecionarBalcao();
    }
}
