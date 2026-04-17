package main.java.aula2;

public class EstruturaCondicionais {

    public static void main(String[] args) {
        int idade =20;

        //Estrutura condicional
        if (idade < 12){
            System.out.println("Você é uma criança");
        } else if (idade < 18) {
            System.out.println("Você é um adolescente");
        } else {
            System.out.println("Você é maior de idade");
        }

        // Operadores lógicos com IF

        // Operador && (And)
        boolean temCarteira = true;
        boolean temDocumento = true;
        if(temCarteira && idade >= 18){
            System.out.println("Pode dirigir, tem carteira E documento");
        }

        // Operador || (Or)
        boolean temCarro = false;
        boolean temMoto = true;
        if (temCarro || temMoto){
            System.out.println("Pode sair para rodar (tem carro OU moto)");
        }

        // Operador ! (NOT - Diferente)
        boolean estaChovendo = false;
        if (!estaChovendo){
            System.out.println("Está chovendo, não posso sair!");
        } else {
            System.out.println("Não está chovendo, posso sair!");
        }

        // Estrutura condicional switch-case
        int diaDaSemana = 3;
        switch (diaDaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }

    }

}
