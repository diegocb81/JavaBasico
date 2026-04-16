package main.java.aula1;

public class Operacoes {

    public static void main(String[] args) {

        System.out.println("Hello, World!");

        //operações matemáticas
        int a = 10;
        int b = 5;

        //adição
        int adicao = a + b;
        System.out.println("Adição " + adicao);

        //subtração
        int subtracao  = a - b;
        System.out.println("Subtração " + subtracao);

        //multiplicação
        int multiplicacao = a * b;
        System.out.println("Multiplicação " + multiplicacao);

        //divisão
        int divisao = a/b;
        System.out.println("Divisão " + divisao);

        //resto da divisão
        int resto = a % b;
        System.out.println("Resto " + resto);

        String nome1 = "Fulano";
        String nome2 = " da Silva";

        //concatenação de strings
        String nomeCompleto = nome1 + nome2;
        System.out.println("Nome completo " + nomeCompleto);


    }

}
