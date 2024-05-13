package com.cinema.manipularjson.cine;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.cinema.cine.Sala;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManipularJsonSala {

    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private static final String CAMINHO_ARQUIVO = "/home/joeum/Projetos GITHUB REPO/Cinema/src/ArquivosJson/cine/Sala.json";

    public static void EscreverSala(Sala sala) {
        List<Sala> salas = LerSalas(); // Ler as salas existentes

        try (FileWriter writer = new FileWriter(CAMINHO_ARQUIVO)) {
            salas.add(sala); // Adicionar a nova sala à lista de salas
            gson.toJson(salas, writer); // Escrever a lista atualizada no arquivo JSON
            System.out.println("A sala foi adicionada ao JSON e salva no arquivo.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Sala> LerSalas() {
        List<Sala> salas = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(CAMINHO_ARQUIVO))) {
            StringBuilder jsonBuilder = new StringBuilder();
            while (scanner.hasNextLine()) {
                jsonBuilder.append(scanner.nextLine());
            }
            String json = jsonBuilder.toString();
            if (!json.isEmpty()) {
                JsonArray jsonArray = gson.fromJson(json, JsonArray.class);
                for (JsonElement jsonElement : jsonArray) {
                    Sala sala = gson.fromJson(jsonElement, Sala.class);
                    salas.add(sala);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return salas;
    }

    public static Sala criarSala() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da sala:");
        int idSala = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após nextInt()

        System.out.println("Digite a capacidade máxima de assentos da sala:");
        int numPoltronas = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após nextInt()

        System.out.println("A sala está em operação? (true/false):");
        boolean status = scanner.nextBoolean();
        scanner.nextLine(); // Consumir a quebra de linha após nextBoolean()

        Sala novaSala = new Sala(idSala, numPoltronas, status);
        EscreverSala(novaSala); // Escreve a nova sala no arquivo JSON

        return novaSala; // Retorna a sala criada
    }

    public static void visualizarSalas(List<Sala> salas) {
        for (Sala sala : salas) {
            System.out.println(sala);
        }
    }

}
