package main.java.aula3;

public class Coordenador extends Professor {
    private int quantidadeFuncionarios;

    public Coordenador(String nome, int idade, double altura, double salario, String disciplina, int quantidadeFuncionarios) {
        super(nome, idade, altura, salario, disciplina);
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }
}
