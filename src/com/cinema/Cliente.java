package com.cinema;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {
        private int idCliente;
        private String nome;
        private String sobrenome;
        private String endereco;
        private String telefone;
        private String email;
        private String cpf;

        /** Número total de clientes criados. */
        private static int numClientes = 0;
    
        /** Número total de clientes criados, acessível mesmo por classes derivadas. */
        protected static int numClientes2 = 0;

        /** Inicializando lista de clientes*/
        private List<Cliente> clientes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        /** Cadastrar novo cliente**/
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

            clientes.add(novoCliente);
            return novoCliente.toString();
        }


    /** Contrutor sem metodos para o List do sistema.*/
        public Cliente() {
            this.idCliente = numClientes;
            this.nome = nome;
            this.sobrenome = sobrenome;
            this.endereco = endereco;
            this.telefone = telefone;
            this.email = email;
            this.cpf = cpf;
            numClientes++;
        }

        // Getters e Setters

        public int getIdCliente() {
            return idCliente;
        }

        public void setIdCliente(int idCliente) {
            this.idCliente = idCliente;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getSobrenome() {
            return sobrenome;
        }

        public void setSobrenome(String sobrenome) {
            this.sobrenome = sobrenome;
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


    /** To String*/
    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", cpf='" + cpf + '\'' +
                 '}';
    }
}
