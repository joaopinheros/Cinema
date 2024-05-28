package com.cinema.ChainOfResponsibility;

public class ProdutoEmEstoqueHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Request request) {
        if (isProductInStock(request.getProduto())) {
            System.out.println("Product is in stock: " + request.getProduto());
            if (nextHandler != null) {
                nextHandler.handleRequest(request);
            }
        } else {
            System.out.println("Product is not in stock: " + request.getProduto());
        }
    }

    private boolean isProductInStock(String product) {
        // Lógica para verificar se o produto está em estoque
        return product != null && !product.isEmpty(); // Simulação simplificada
    }
}