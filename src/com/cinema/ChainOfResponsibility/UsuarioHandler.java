package com.cinema.ChainOfResponsibility;

public class UsuarioHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(LoginRequest request) {
        for (Funcionario funcionario : Funcionario.getFuncionarios()) {
            if (funcionario.getUsuario().equals(request.getUsuario())) {
                if (nextHandler != null) {
                    nextHandler.handleRequest(request);
                }
                return;
            }
        }
        System.out.println("Usuário não encontrado: " + request.getUsuario());
    }
}


