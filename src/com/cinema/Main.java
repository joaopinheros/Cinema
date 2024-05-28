package com.cinema;

import com.cinema.cine.Filme;
import com.cinema.cine.Sala;
import com.cinema.cine.Sessao;

import java.util.ArrayList;
import java.util.List;

import static com.cinema.manipularjson.cine.ManipularJsonFilme.*;
import static com.cinema.manipularjson.cine.ManipularJsonSala.*;
import static com.cinema.manipularjson.cine.ManipularJsonSessao.*;

public class Main {

    public static void main(String[] args) {

        //Padrão de Projeto

        Funcionario funcionario1 = new Funcionario(proximoId++, "João Silva", "joao", "senha123");
        Funcionario funcionario2 = new Funcionario(proximoId++, "Maria Souza", "maria", "senha456");
        funcionarios.add(funcionario1);
        funcionarios.add(funcionario2);

        Handler usuarioHandler = new UsuarioHandler();
        Handler senhaHandler = new SenhaHandler();
        usuarioHandler.setNextHandler(senhaHandler);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome de usuário:");
        String usuario = scanner.nextLine();
        System.out.println("Digite a senha:");
        String senha = scanner.nextLine();

        RequisicaoLogin request = new RequisicaoLogin(usuario, senha);
        usuarioHandler.handleRequest(request);

        //Sistema sistema = new Sistema();
        //Ingresso ingresso = new Ingresso();
        //String cadastrarteste = cliente.cadastrarCliente(cliente);
        //System.out.println(cadastrarteste);

//        Sistema sistema = Sistema.getInstance();
//        sistema.menuadm();


        /*
        Testes de manipulação de filmes

        Filme novoFilme = criarFilme();
        System.out.println("Filme criado: " + novoFilme);

        List<Filme> listaFilmes = LerFilmes();
        System.out.println("Lista de filmes atualizada:");
        visualizarFilmes(listaFilmes);
*/

/*
        Teste manipulação de salas

        Sala novaSala = criarSala();
        System.out.println("Sala criada: " + novaSala);

        List<Sala> listaSalas = LerSalas();
        System.out.println("Lista de salas atualizada:");
        visualizarSalas(listaSalas);
*/

        /*Teste manipulação de sessao

        Sessao novaSessao = criarSessao();
            System.out.println("Sessão criada: " + novaSessao);

        List<Sessao> listaSessoes = LerSessoes();
        System.out.println("Lista de sessões atualizada:");
        visualizarSessoes(listaSessoes);
*/
    }
}