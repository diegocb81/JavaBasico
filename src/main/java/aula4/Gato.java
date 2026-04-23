package main.java.aula4;

public class Gato extends Animal{
    private String miado;

    public Gato(String nome, int idade, String tipo){
        super(nome, idade, tipo);
        this.miado = "Miau!";
    }

    public String getMiado() {
        return miado;
    }

    public void setMiado(String miado) {
        this.miado = miado;
    }

    public void fazerSom(){
        System.out.println("Miau!");
    }
}
