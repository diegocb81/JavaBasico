package main.java.aula3;

/*
Soma de N Números

Desenvolva um programa que:
Leia a quantidade de números a serem informados
Leia N números inteiros
Calcule a soma de todos os números
Calcule a média
Exiba soma e média
Entrada: Quantidade N, seguida de N números Saída: Soma e média dos números
 */


import java.util.Locale;
import java.util.Scanner;

public class Desafio2SomaDeNNumeros {

    public static void main(String[] args) {
        int quantidadeDeNumerosInformados;
        int soma = 0;
        double media;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de números: ");
        quantidadeDeNumerosInformados = sc.nextInt();

        for (int i = 0; i < quantidadeDeNumerosInformados; i++) {
            System.out.println("Digite o número " + (i + 1) + ": ");
            int  num = sc.nextInt();
            soma += num;
        }

        media = (double) soma / quantidadeDeNumerosInformados;

        System.out.println("\n --- Resultados ---");
        System.out.println("Soma: " + soma);
        System.out.printf("Média: %.2f%n", media);

        sc.close();
    }
}
