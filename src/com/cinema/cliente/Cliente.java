package com.cinema.cliente;

import com.cinema.produto.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Representa um cliente do sistema de cinema.
 */
public class Cliente {
    // Atributos do cliente
    private int idCliente;
    private String nomeCompleto;
    private String endereco;
    private String telefone;
    private String email;
    private String cpf;
    private String preferencais;
    private Produto produto; // Produto preferido pelo cliente

    /** Número total de clientes criados. */
    private static int numClientes = 0;

    /** Número total de clientes criados, acessível mesmo por classes derivadas. */
    protected static int numClientes2 = 0;

    /** Inicializando lista de clientes */
    private static List<Cliente> clientes = new ArrayList<>();

    private static Scanner sc = new Scanner(System.in);

    /**
     * Cadastra um novo cliente no sistema.
     * @param cliente O cliente a ser cadastrado.
     * @return Uma representação em texto do novo cliente cadastrado.
     */
    public static String cadastrarCliente(Cliente cliente) {
        Cliente novoCliente = new Cliente();

        System.out.println("Digite o nome do cliente:");
        String nome = sc.nextLine();
        novoCliente.setNomeCompleto(nome);
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
        System.out.println("Digite as preferências de filmes do cliente:");
        String preferencias = sc.nextLine();
        novoCliente.setPreferencais(preferencias);

        clientes.add(novoCliente);
        return novoCliente.toString();
    }

    /**
     * Construtor padrão para criar um cliente.
     */
    public Cliente() {
        this.idCliente = numClientes++;
    }

    // Getters e Setters

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPreferencais() {
        return preferencais;
    }

    public void setPreferencais(String preferencais) {
        this.preferencais = preferencais;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    /**
     * Retorna uma representação em texto do cliente.
     * @return Uma string representando o cliente.
     */
    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", nomeCompleto='" + nomeCompleto + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
