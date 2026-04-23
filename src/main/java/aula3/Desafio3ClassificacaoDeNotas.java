package main.java.aula3;

import java.util.Locale;
import java.util.Scanner;

/*
Classificação de Notas

Faça um programa que leia uma nota (0 a 10) de um aluno e classifique-a conforme:
9-10: Excelente
7-8.9: Bom
5-6.9: Satisfatório
0-4.9: Insuficiente
Entrada: Uma nota em decimal Saída: Classificação da nota
 */

public class Desafio3ClassificacaoDeNotas {

    public static void main(String[] args) {
        double nota;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua nota: ");
        nota = sc.nextDouble();

        if(nota >= 9 && nota <= 10){
            System.out.println("Excelente");
        } else if (nota >= 7 && nota < 9) {
            System.out.println("Bom");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Satisfatório");
        } else if (nota >= 0 && nota < 5) {
            System.out.println("Insuficiente");
        } else {
            System.out.println("Digite sua nota entre 0 e 10");
        }

        sc.close();
    }
}
