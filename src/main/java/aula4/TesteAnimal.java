package main.java.aula4;

public class TesteAnimal {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Lola", 7, "SRD");
        Gato gato = new Gato("Kiki", 7, "Persa");

        cachorro.fazerSom();
        gato.fazerSom();

    }
}
