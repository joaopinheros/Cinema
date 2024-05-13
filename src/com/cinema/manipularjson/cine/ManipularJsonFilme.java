package com.cinema.manipularjson.cine;

import com.cinema.cine.Filme;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManipularJsonFilme {

    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private static final String CAMINHO_ARQUIVO = "/home/joeum/Projetos GITHUB REPO/Cinema/src/ArquivosJson/cine/Filme.json";
    private static int proximoId = 9; // Próxima ID a ser atribuída a gente comecou com 8 no arquivo json

    public static void EscreverFilme(Filme filme) {
        List<Filme> filmes = LerFilmes(); // Ler os filmes existentes

        // Atribuir a próxima ID ao filme
        filme.setId(proximoId++);

        try (FileWriter writer = new FileWriter(CAMINHO_ARQUIVO)) {
            filmes.add(filme); // Adicionar o novo filme à lista de filmes
            gson.toJson(filmes, writer); // Escrever a lista atualizada no arquivo JSON
            System.out.println("O objeto Filme foi adicionado ao JSON e salvo no arquivo.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Filme> LerFilmes() {
        List<Filme> filmes = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(CAMINHO_ARQUIVO))) {
            StringBuilder jsonBuilder = new StringBuilder();
            while (scanner.hasNextLine()) {
                jsonBuilder.append(scanner.nextLine());
            }
            String json = jsonBuilder.toString();
            if (!json.isEmpty()) {
                JsonArray jsonArray = gson.fromJson(json, JsonArray.class);
                for (JsonElement jsonElement : jsonArray) {
                    Filme filme = gson.fromJson(jsonElement, Filme.class);
                    filmes.add(filme);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return filmes;
    }

    public static Filme criarFilme() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o título do filme:");
        String titulo = scanner.nextLine();

        System.out.println("Digite o gênero do filme:");
        String genero = scanner.nextLine();

        System.out.println("Digite o nome do diretor do filme:");
        String diretor = scanner.nextLine();

        System.out.println("Digite a descrição do filme:");
        String descricao = scanner.nextLine();

        System.out.println("Digite a duração do filme em minutos:");
        int duracao = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após nextInt()

        Filme novoFilme = new Filme(titulo, genero, diretor, descricao, duracao);
        EscreverFilme(novoFilme); // Escreve o novo filme no arquivo JSON

        return novoFilme; // Retorna o filme criado
    }

    public static void visualizarFilmes(List<Filme> filmes) {
        for (Filme filme : filmes) {
            System.out.println(filme);
        }
    }


}
