package com.cinema;

import java.util.List;

public class Sistema {

    private List <Cliente> clientes;
    private List <Produto> produtos;
    private List <Ingresso> ingressos;
    private List <Sessao> sessoes;
    private List <Funcionario> funcionarios;
    private List <Filme> filmes;
    private List <Despesa> despesas;

    // Metodos de Cliente
    public List<Cliente> cadastrarCliente(Cliente cliente){
        Cliente novoCliente = new Cliente();
        novoCliente.setIdCliente(cliente.getIdCliente());
        novoCliente.setNome(cliente.getNome());
        novoCliente.setSobrenome(cliente.getSobrenome());
        novoCliente.setEndereco(cliente.getEndereco());
        novoCliente.setTelefone(cliente.getTelefone());
        novoCliente.setEmail(cliente.getEmail());
        novoCliente.setCpf(cliente.getCpf());
        novoCliente.setPreferencias(cliente.getPreferencias());

        clientes.add(novoCliente);
        return clientes;
    }

    // Metodos de Ingresso

    public List<Ingresso> cadastrarIngresso(Ingresso ingresso){
        Ingresso novoIngresso = new Ingresso();
        novoIngresso.setIdIngresso(ingresso.getIdIngresso());
        novoIngresso.setTipo(novoIngresso.getTipo());
        novoIngresso.setDataHora(novoIngresso.getDataHora());
        novoIngresso.setPreco(ingresso.getPreco());
        novoIngresso.setFilme(ingresso.getFilme());
        novoIngresso.setSala(novoIngresso.getSala());

        ingressos.add(novoIngresso);
        return ingressos;

    }

    // Métodos de Produto

    public List<Produto> cadastrarProduto(Produto produto){
        Produto novoProduto = new Produto();
        novoProduto.setNome(produto.getNome());
        novoProduto.setCategoria(produto.getCategoria());
        novoProduto.setDataFabricacao(produto.getDataFabricacao());
        novoProduto.setDataValidade(produto.getDataValidade());
        novoProduto.setPrecoUnitario(produto.getPrecoUnitario());
        novoProduto.setQuantidadeEstoque(novoProduto.getQuantidadeEstoque());

        produtos.add(novoProduto);
        return produtos;
    }

}
