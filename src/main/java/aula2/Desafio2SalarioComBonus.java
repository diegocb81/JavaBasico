package main.java.aula2;

import java.util.Locale;
import java.util.Scanner;

/*
Salário com Bônus

Um funcionário recebe um salário e um bônus. Escreva um programa que:
Leia o nome do funcionário
Leia o salário base
Leia a porcentagem do bônus
Calcule o valor do bônus (salário × porcentagem / 100)
Calcule o salário final (salário + bônus)
Exiba o nome, salário base, valor do bônus e salário final
Entrada: Nome, salário base, porcentagem de bônus Saída: Detalhamento do cálculo
*/

public class Desafio2SalarioComBonus {

    public static void main(String[] args) {
        String nomeFuncionario;
        double salarioBase;
        double porcentagemDoBonus;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nomeFuncionario = sc.nextLine();

        System.out.println("Digite seu salario base: ");
        salarioBase = sc.nextDouble();

        System.out.println("Digite seu porcentagem do bonus: ");
        porcentagemDoBonus = sc.nextDouble();

        double valorDoBonus = (salarioBase * porcentagemDoBonus / 100);

        double salarioFinal = (salarioBase + valorDoBonus);

        System.out.printf("Olá %s, o seu salário base é de R$ %.2f, com o bônus de %.2f%%, o seu salário final ficou no valor de R$ %.2f.",
                nomeFuncionario, salarioBase, porcentagemDoBonus, salarioFinal);

        sc.close();
    }
}
