package com.cinema.ChainOfResponsibility;

public class Request {

    private String usuario;
    private String produto;

    public Request(String usuario, String produto) {
        this.usuario = usuario;
        this.produto = produto;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getProduto() {
        return produto;
    }
}
