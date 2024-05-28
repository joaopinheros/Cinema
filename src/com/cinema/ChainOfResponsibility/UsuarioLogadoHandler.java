package com.cinema.ChainOfResponsibility;

public class UsuarioLogadoHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Request request) {
        if (isUserLoggedIn(request.getUsuario())) {
            System.out.println("User is logged in: " + request.getUsuario());
            if (nextHandler != null) {
                nextHandler.handleRequest(request);
            }
        } else {
            System.out.println("User is not logged in: " + request.getUsuario());
        }
    }

    private boolean isUserLoggedIn(String Usuario) {
        // Lógica para verificar se o usuário está logado
        return Usuario != null &&  Usuario.isEmpty(); // Simulação simplificada
    }
}
