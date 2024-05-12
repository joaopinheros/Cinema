package com.cinema.balcao;

import com.cinema.func.Funcionario;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Esta classe representa um balcão com um funcionário associado.
 */
public class BalcaoFun extends BalcaoAut {

    private Funcionario funcionarioBalcao; // Funcionário associado ao balcão

    private static List<BalcaoFun> balcoesFixos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    /**
     * Construtor para inicializar um BalcaoFun com um ID de balcão e um funcionário associado.
     * @param idBalcao O ID do balcão.
     * @param funcionarioBalcao O funcionário associado ao balcão.
     */
    public BalcaoFun(int idBalcao, Funcionario funcionarioBalcao) {
        super(idBalcao); // Chama o construtor da classe pai com o ID do balcão
        this.funcionarioBalcao = funcionarioBalcao; // Inicializa o funcionário associado
        balcoesFixos.add(this);
    }

    /**
     * Obtém o funcionário associado ao balcão.
     * @return O funcionário associado ao balcão.
     */
    public Funcionario getFuncionarioBalcao() {
        return funcionarioBalcao;
    }

    /**
     * Define o funcionário associado ao balcão.
     * @param funcionarioBalcao O funcionário a ser associado ao balcão.
     */
    public void setFuncionarioBalcao(Funcionario funcionarioBalcao) {
        this.funcionarioBalcao = funcionarioBalcao;
    }

    /**
     * Sobrescreve o método toString para retornar uma representação em string do BalcaoFun.
     * @return Uma representação em string do BalcaoFun.
     */
    @Override
    public String toString() {
        return "BalcaoFun{" +
                "idBalcao=" + getIdBalcao() +
                ", funcionarioBalcao=" + funcionarioBalcao +
                '}';
    }

    /**
     * Seleciona um balcão automático disponível para atendimento.
     * @return O balcão automático selecionado, ou null se nenhum estiver disponível.
     */
    public static BalcaoFun selecionarBalcao() {
        System.out.println("Balcões disponíveis:");
        for (BalcaoFun balcao : balcoesFixos) {
            System.out.println(balcao);
        }
        System.out.println("Escolha o ID do balcão que deseja selecionar:");
        int idEscolhido = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer
        for (BalcaoFun balcao : balcoesFixos) {
            if (balcao.getIdBalcao() == idEscolhido) {
                System.out.println("Balcão " + balcao.getIdBalcao() + " selecionado.");
                return balcao;
            }
        }
        System.out.println("Balcão não encontrado.");
        return null;
    }


}
