package com.cinema;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {

            Sistema sistema = new Sistema();
            Cliente cliente = new Cliente();
            Ingresso ingresso = new Ingresso();
            String cadastrarteste = cliente.cadastrarCliente(cliente);
            System.out.println(cadastrarteste);
    }
}