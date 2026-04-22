package main.java.aula3;

public class Calculadora {

    public Calculadora(){

    }

    public double somar(double valor1, double valor2){
        return valor1+valor2;
    }

    public double subtrair(double valor1, double valor2){
        return valor1-valor2;
    }

    public double multiplicar(double valor1, double valor2){
        return valor1*valor2;
    }

    public double dividir(double valor1, double valor2){
        return valor1/valor2;
    }

    public double potencia(double valor1, double valor2){
        return Math.pow(valor1, valor2);
    }
}
