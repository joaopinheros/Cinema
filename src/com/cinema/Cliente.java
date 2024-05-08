package com.cinema;

public class Cliente {
        private int idCliente;
        private String nome;
        private String sobrenome;
        private String endereco;
        private String telefone;
        private String email;
        private String cpf;
        private String preferencias;

        // Construtor


    public Cliente(int idCliente, String nome, String sobrenome, String endereco, String telefone, String email, String cpf, String preferencias) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
        this.preferencias = preferencias;
    }

    // Contrutor sem metodos para o List do sistema.
        public Cliente() {
            this.idCliente = idCliente;
            this.nome = nome;
            this.sobrenome = sobrenome;
            this.endereco = endereco;
            this.telefone = telefone;
            this.email = email;
            this.cpf = cpf;
            this.preferencias = preferencias;
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

        public String getPreferencias() {
            return preferencias;
        }

        public void setPreferencias(String preferencias) {
            this.preferencias = preferencias;
        }

}
