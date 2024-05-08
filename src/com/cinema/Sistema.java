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

    // Metodos de Clientes

    public String cadastrarCliente(Cliente cliente) {
        Cliente novoCliente = new Cliente();

        System.out.println("Digite o ID do cliente:");
        int idCliente = sc.nextInt();
        novoCliente.setIdCliente(idCliente);
        System.out.println("Digite o nome do cliente:");
        sc.nextLine(); // Consumir a quebra de linha deixada pelo nextInt() antes de ler a string
        String nome = sc.nextLine();
        novoCliente.setNome(nome);
        System.out.println("Digite o sobrenome do cliente:");
        String sobrenome = sc.nextLine();
        novoCliente.setSobrenome(sobrenome);
        System.out.println("Digite o endereço do cliente:");
        String endereco = sc.nextLine();
        novoCliente.setEndereco(endereco);
        System.out.println("Digite o telefone do cliente:");
        String telefone = sc.nextLine();
        novoCliente.setTelefone(telefone);
        System.out.println("Digite o email do cliente:");
        String email = sc.nextLine();
        novoCliente.setEmail(email);
        System.out.println("Digite o CPF do cliente:");
        String cpf = sc.nextLine();
        novoCliente.setCpf(cpf);
        System.out.println("Digite as preferências do cliente:");
        String preferencias = sc.nextLine();
        novoCliente.setPreferencias(preferencias);

        clientes.add(novoCliente);
        return novoCliente.toString();
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
    }




}
