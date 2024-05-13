package com.cinema.manipularjson.cine;

import com.cinema.cine.Filme;
import com.cinema.cine.Sala;
import com.cinema.cine.Sessao;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManipularJsonSessao {

    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private static final String CAMINHO_ARQUIVO_SESSAO = "/home/joeum/Projetos GITHUB REPO/Cinema/src/ArquivosJson/cine/Sessao.json";
    private static final String CAMINHO_ARQUIVO_FILMES = "/home/joeum/Projetos GITHUB REPO/Cinema/src/ArquivosJson/cine/Filmes.json";
    private static final String CAMINHO_ARQUIVO_SALAS = "/home/joeum/Projetos GITHUB REPO/Cinema/src/ArquivosJson/cine/Salas.json";

    public static void EscreverSessao(Sessao sessao) {
        List<Sessao> sessoes = LerSessoes(); // Ler as sessões existentes

        try (FileWriter writer = new FileWriter(CAMINHO_ARQUIVO_SESSAO)) {
            sessoes.add(sessao); // Adicionar a nova sessão à lista de sessões
            gson.toJson(sessoes, writer); // Escrever a lista atualizada no arquivo JSON
            System.out.println("A sessão foi adicionada ao JSON e salva no arquivo.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Sessao> LerSessoes() {
        List<Sessao> sessoes = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(CAMINHO_ARQUIVO_SESSAO))) {
            StringBuilder jsonBuilder = new StringBuilder();
            while (scanner.hasNextLine()) {
                jsonBuilder.append(scanner.nextLine());
            }
            String json = jsonBuilder.toString();
            if (!json.isEmpty()) {
                JsonArray jsonArray = gson.fromJson(json, JsonArray.class);
                for (JsonElement jsonElement : jsonArray) {
                    Sessao sessao = gson.fromJson(jsonElement, Sessao.class);
                    sessoes.add(sessao);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sessoes;
    }


    public static Sessao criarSessao() {
        Scanner scanner = new Scanner(System.in);

        // Buscar lista de filmes e de salas
        List<Filme> filmes = ManipularJsonFilme.LerFilmes();
        List<Sala> salas = ManipularJsonSala.LerSalas();

        System.out.println("Selecione um filme:");
        for (Filme filme : filmes) {
            System.out.println(filme.getId() + ": " + filme.getTitulo());
        }
        int idFilme = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        Filme filmeSelecionado = buscarFilmePorId(idFilme, filmes);
        if (filmeSelecionado == null) {
            System.out.println("Filme não encontrado.");
            return null;
        }

        System.out.println("Selecione uma sala:");
        for (Sala sala : salas) {
            if (sala.isStatus()) { // Verifica se a sala está disponível (status true)
                System.out.println(sala.getIdsala());
            }
        }

        // Solicitar ao usuário que selecione uma sala disponível
        int idSala = -1;
        do {
            idSala = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            Sala salaSelecionada = buscarSalaPorId(idSala, salas);
            if (salaSelecionada == null || !salaSelecionada.isStatus()) {
                System.out.println("Sala não encontrada ou não disponível. Selecione outra sala:");
            } else {
                System.out.println("Sessão criada com sucesso.");
                System.out.println("Digite a data e hora da sessão (formato dd/MM/yyyy HH'h'): ");
                String dataHora = scanner.nextLine();

                Sessao novaSessao = new Sessao(filmeSelecionado, salaSelecionada, dataHora);
                EscreverSessao(novaSessao); // Escreve a nova sessão no arquivo JSON
                return novaSessao; // Retorna a sessão criada
            }
        } while (true);
    }


    private static Filme buscarFilmePorId(int id, List<Filme> filmes) {
        for (Filme filme : filmes) {
            if (filme.getId() == id) {
                return filme;
            }
        }
        return null;
    }

    private static Sala buscarSalaPorId(int id, List<Sala> salas) {
        for (Sala sala : salas) {
            if (sala.getIdsala() == id) {
                return sala;
            }
        }
        return null;
    }


    public static void visualizarSessoes(List<Sessao> sessoes) {
        System.out.println("Lista de sessões:");
        for (Sessao sessao : sessoes) {
            System.out.println(sessao);
        }
    }


}
