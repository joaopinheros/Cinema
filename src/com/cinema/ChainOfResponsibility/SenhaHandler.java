package com.cinema.ChainOfResponsibility;

public class SenhaHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(LoginRequest request) {
        for (Funcionario funcionario : Funcionario.getFuncionarios()) {
            if (funcionario.getUsuario().equals(request.getUsuario()) &&
                funcionario.getSenha().equals(request.getSenha())) {
                System.out.println("Login bem-sucedido para o usuário: " + request.getUsuario());
                if (nextHandler != null) {
                    nextHandler.handleRequest(request);
                }
                return;
            }
        }
        System.out.println("Senha incorreta para o usuário: " + request.getUsuario());
    }
}