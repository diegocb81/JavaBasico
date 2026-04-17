package main.java.aula2;

import java.util.ArrayList;

public class EstruturaDeRepeticao {

    public static void main(String[] args) {
        // Estrutura de repetição for
        System.out.println("Estrutura de repetição FOR:");

        for (int i = 0; i < 5; i++) {
            System.out.println("Contagem: " + i);
        }

        // Estrutura de repetição while
        System.out.println("\nEstrutura de repetição WHILE:");
        int j = 0;
        boolean flag = true;
        while (flag) {
            System.out.println("Contagem: " + j);
            j++;

            if (j > 10) {
                flag = false;
            }
        }

        // Estrutura de repetição do-while
        System.out.println("\nEstrutura de repetição DO-WHILE:");
        int k = 0;
        do {
            System.out.println("Contagem: " + k);
            k++;

        } while (k < 5);

        // Estrutura de repetição interagindo com um ArrayList
        System.out.println("\nEstrutura de repetição interagindo com um ArrayList");
        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("Fulano");
        nomes.add("Ciclano");
        nomes.add("Beltrano");

        for(int i = 0; i < nomes.size(); i++){
            System.out.println("Nome: " + nomes.get(i));
        }
    }
}
