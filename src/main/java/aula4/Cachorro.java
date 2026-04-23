package main.java.aula4;

public class Cachorro extends Animal {
    private String latido;

    public Cachorro(String nome, int idade, String tipo){
        super(nome, idade, tipo);
        this.latido = "Au au!";
    }

    public String getLatido() {
        return latido;
    }

    public void setLatido(String latido) {
        this.latido = latido;
    }

    public void fazerSom(){
        System.out.println("Au au!");
    }
}
