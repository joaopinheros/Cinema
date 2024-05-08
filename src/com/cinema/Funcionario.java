package com.cinema;

public class Funcionario {

    private int idFuncionario;
    private String usuario;
    private String senha;

    public Funcionario(int idFuncionario, String usuario, String senha) {
        this.idFuncionario = idFuncionario;
        this.usuario = usuario;
        this.senha = senha;
    }

    public Funcionario(){
        this.idFuncionario = idFuncionario;
        this.usuario = usuario;
        this.senha = senha;
    }

    public int getIdFuncionario() {
        return idFuncionario;

    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
