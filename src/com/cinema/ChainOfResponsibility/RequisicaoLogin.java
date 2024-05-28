package com.cinema.ChainOfResponsibility;

public class RequisicaoLogin {
    private String usuario;
    private String senha;

    public RequisicaoLogin (String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }
}
