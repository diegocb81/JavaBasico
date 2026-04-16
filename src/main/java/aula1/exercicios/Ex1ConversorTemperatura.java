package main.java.aula1.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex1ConversorTemperatura {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        double farenheit = (celsius * 9/5) + 32;

        System.out.println(celsius + "ºC equivale a " + farenheit + "ºF");

        scanner.close();
    }
}
