package com.cinema;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {
    private List <Cliente> clientes;
    private List <Produto> produtos;
    private List <Ingresso> ingressos;
    private List <Sala> salas;
    private List <Funcionario> funcionarios;
    private List <Filme> filmes;
    private List <Despesa> despesas;

    private Scanner sc;

    // Iniciando um novo array list vazio de cada uma das listas instânciadas

    public Sistema(){
        clientes = new ArrayList<>();
        produtos = new ArrayList<>();
        ingressos = new ArrayList<>();
        salas = new ArrayList<>();
        funcionarios = new ArrayList<>();
        filmes = new ArrayList<>();
        despesas = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    // Metodos de Ingresso

    public List<Ingresso> cadastrarIngresso(Ingresso ingresso){
        Ingresso novoIngresso = new Ingresso();

        System.out.println("");
        novoIngresso.setIdIngresso(ingresso.getIdIngresso());
        novoIngresso.setTipo(novoIngresso.getTipo());
        novoIngresso.setDataHora(novoIngresso.getDataHora());
        novoIngresso.setPreco(ingresso.getPreco());
        novoIngresso.setFilme(ingresso.getFilme());
        novoIngresso.setSala(novoIngresso.getSala());

        ingressos.add(novoIngresso);
        return ingressos;
    }

    // Métodos de Produto

    public List<Produto> cadastrarProduto(Produto produto){
        Produto novoProduto = new Produto();
        novoProduto.setNome(produto.getNome());
        novoProduto.setCategoria(produto.getCategoria());
        novoProduto.setDataFabricacao(produto.getDataFabricacao());
        novoProduto.setDataValidade(produto.getDataValidade());
        novoProduto.setPrecoUnitario(produto.getPrecoUnitario());
        novoProduto.setQuantidadeEstoque(novoProduto.getQuantidadeEstoque());

        produtos.add(novoProduto);
        return produtos;
    }

    private static void exibirInicio() {
        System.out.println("----------------------------------------------");
        System.out.println("-----------------CineMark---------------------");
        System.out.println("----------------------------------------------");
        System.out.println("----------------------------------------------");
    }

    public void menuadm() {
        //private static Scanner input = new Scanner(System.in);
        System.out.println("----------------------------------------------");
        System.out.println("-----------Bem vindo ao CineMark--------------");
        System.out.println("----------------------------------------------");
        System.out.println("**********Selecione a Opção desejada**********");
        System.out.println("----------------------------------------------");
        System.out.println("/    Opção 1 - Venda     /");
        System.out.println("/    Opção 2 - Ver Sessões    /");
        System.out.println("/    Opção 3 - Relatorios     /");
        System.out.println("/    Opção 4 - Cadastros     /");
        System.out.println("/    Opção 5 - Sair     /");
        
        Scanner scan = new Scanner(System.in);
        int option = scan.nextInt();
        switch (option) {
        default:
        System.out.println("------------Opção Inválida!------------");

        case 4:
        System.out.println("----------------------------------------------");
        System.out.println("**********Selecione a Opção desejada**********");
        System.out.println("----------------------------------------------");
        System.out.println("/    Opção 1 - Cadastro de Cliente     /");
        System.out.println("/    Opção 2 - Cadastro de Produto    /");
        System.out.println("/    Opção 3 - Cadastro de Filme     /");
        System.out.println("/    Opção 4 - Sair     /");

            int option1 = scan.nextInt();

                switch(option1){
                    default:
                    System.out.println("------------Opção Inválida!------------");

                    case 1:
                    
                    
                }


    }




}
}
