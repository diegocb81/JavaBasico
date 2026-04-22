package main.java.aula3;

public class Funcoes {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int c = 10;
        int d = 3;

        int soma = a +b;
        System.out.println("Resultado: " + somar(a,d));
        System.out.println("Resultado: " + somar(10,5));

        dizerOi();

    }

    public static int somar(int num1, int num2){
        int resultado =  num1 + num2;
        return resultado;
    }
    
    public static void dizerOi(){
        System.out.println("Oi");
    }
}
