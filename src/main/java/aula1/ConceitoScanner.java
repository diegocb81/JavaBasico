package main.java.aula1;

import java.util.Scanner;

public class ConceitoScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite seu idade:");
        int idade = scanner.nextInt();

        System.out.println("Olá, " +  nome + "! Você tem " + idade + " anos.");

        scanner.close();
    }
}
