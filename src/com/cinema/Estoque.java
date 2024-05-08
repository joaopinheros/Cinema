package com.cinema;

import java.util.List;
import java.util.ArrayList;

/**
 * Representa o estoque de produtos, mantendo uma lista de itens de estoque.
 */

// vai faltar um metodo para dar baixa no estoque de a cordo com a venda
public class Estoque {
    private List<ItemEstoque> itensEstoque;

    public Estoque() {
        this.itensEstoque = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida. Adicione uma quantidade válida.");
            return;
        }
        ItemEstoque item = encontrarItemPorProduto(produto);
        if (item != null) {
            item.adicionarQuantidade(quantidade);
        } else {
            itensEstoque.add(new ItemEstoque(produto, quantidade));
        }
        System.out.println(quantidade + " unidades de " + produto.getNome() + " adicionadas ao estoque.");
    }

    public ItemEstoque encontrarItemPorProduto(Produto produto) {
        for (ItemEstoque item : itensEstoque) {
            if (item.getProduto().equals(produto)) {
                return item;
            }
        }
        return null;
    }

    public void removerProduto(Produto produto, int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida. Insira uma quantidade positiva.");
            return;
        }
        ItemEstoque item = encontrarItemPorProduto(produto);
        if (item != null && item.getQuantidade() >= quantidade) {
            item.removerQuantidade(quantidade);
            System.out.println(quantidade + " unidades de " + produto.getNome() + " removidas do estoque.");
        } else {
            System.out.println("Produto não encontrado ou quantidade insuficiente em estoque.");
        }
    }

    public void exibirEstoque() {
        System.out.println("---- Estoque Atual ----");
        for (ItemEstoque item : itensEstoque) {
            System.out.println(item.getProduto().toString() + " - Quantidade em estoque: " + item.getQuantidade() + " unidades.");
        }
    }

    public int verificarEstoque(Produto produto) {
        ItemEstoque item = encontrarItemPorProduto(produto);
        if (item != null) {
            int quantidade = item.getQuantidade();
            System.out.println("Quantidade de " + produto.getNome() + " em estoque: " + quantidade + " unidades.");
            return quantidade;
        }
        return 0;
    }

    public List<Produto> getProdutos() {
        List<Produto> produtos = new ArrayList<>();
        for (ItemEstoque item : itensEstoque) {
            produtos.add(item.getProduto());
        }
        return produtos;
    }

    @Override
    public String toString() {
        return "Estoque{" +
                "Lista de estoque ='" + itensEstoque + '\'' +
                '}';

}
}