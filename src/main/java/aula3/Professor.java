package main.java.aula3;

public class Professor extends Pessoa {
    private double salario;
    private String disciplina;

    public Professor(String nome, int idade, double altura, double salario, String disciplina) {
        super(nome, idade, altura);
        this.salario = salario;
        this.disciplina = disciplina;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void aumentarSalario(double valor) {
        this.salario += valor;
        System.out.println("Salário aumentado em R$ " + valor);
    }
}
