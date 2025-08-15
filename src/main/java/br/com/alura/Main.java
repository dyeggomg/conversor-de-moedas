package br.com.alura;

import javax.swing.SwingUtilities;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Conversor de Moedas ===");
        System.out.println("Escolha o modo de execução:");
        System.out.println("1. Console");
        System.out.println("2. Interface Gráfica");
        System.out.print("Opção: ");
        int modo = scanner.nextInt();

        if (modo == 2) {
            SwingUtilities.invokeLater(() -> new ConversorComImagem());
            return;
        }

        CurrencyConverter converter = new CurrencyConverter();

        System.out.println("\nEscolha uma opção de conversão:");
        System.out.println("1. USD para BRL");
        System.out.println("2. BRL para USD");
        System.out.println("3. EUR para BRL");
        System.out.println("4. BRL para EUR");
        System.out.println("5. USD para EUR");
        System.out.println("6. EUR para USD");

        int option = scanner.nextInt();
        System.out.print("Digite o valor a ser convertido: ");
        double amount = scanner.nextDouble();

        String from = "", to = "";

        switch (option) {
            case 1 -> { from = "USD"; to = "BRL"; }
            case 2 -> { from = "BRL"; to = "USD"; }
            case 3 -> { from = "EUR"; to = "BRL"; }
            case 4 -> { from = "BRL"; to = "EUR"; }
            case 5 -> { from = "USD"; to = "EUR"; }
            case 6 -> { from = "EUR"; to = "USD"; }
            default -> {
                System.out.println("Opção inválida.");
                return;
            }
        }

        double result = converter.convert(from, to, amount);
        System.out.printf("Valor convertido: %.2f %s%n", result, to);
    }
}