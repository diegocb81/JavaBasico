package main.java.aula2;

import java.util.Locale;
import java.util.Scanner;

/*
Cálculo do IMC

Desenvolva um programa que calcule o Índice de Massa Corporal (IMC) de uma pessoa. O programa deve:
Ler o nome, peso (em kg) e altura (em metros)
Calcular o IMC usando a fórmula: IMC = peso / (altura²)
Exibir o nome da pessoa e seu IMC
Entrada: Nome (String), peso (double), altura (double) Saída: Mensagem com nome e IMC
 */

public class Desafio1CalculoImc {

    public static void main(String[] args) {
        String nome;
        double peso;
        double altura;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();

        System.out.println("Digite seu peso: ");
        peso = sc.nextDouble();

        System.out.println("Digite sua altura: ");
        altura = sc.nextDouble();

        double imc = (peso / (altura * altura));

        System.out.printf("Olá " + nome + " o seu IMC é: %.2f%n", imc);

        sc.close();
    }

}
