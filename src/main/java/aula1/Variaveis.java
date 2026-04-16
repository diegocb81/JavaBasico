package main.java.aula1;

public class Variaveis {

    public static void main(String[] args) {

        System.out.println("Hello, World!");
        //variável
        int idade = 28;
        System.out.println("Sua idade é " + idade);

        //variável do tipo String
        String nome = "Fulano";
        System.out.println("Meu nome é " + nome);

        //variável do tipo float
        float altura = 1.8f;
        System.out.println("Minha altura é " + altura + " metros");

        //variável do tipo char
        char genero = 'M';
        System.out.println("Meu gênero é " + genero);

        //exemplo de Array (vetor)
        int[] notas = {7, 8, 9, 10};
        String[] nomes = {"Tiago", "Sofia", "Ana Laura", "Diego"};
        System.out.println("Primeira nota: " + notas[0]);
        System.out.println("Quantidade de notas: " + notas.length);


    }
}