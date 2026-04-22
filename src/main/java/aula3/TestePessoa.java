package main.java.aula3;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa fulano = new Pessoa();

        Pessoa pessoa1 = new Pessoa("Diego", 45, 1.83);
        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());
        System.out.println(pessoa1.getAltura());

        pessoa1.setNome("Tiago");

        System.out.println(pessoa1.getNome());

        Pessoa pessoa2 = new Pessoa("Tiago", 12, 1.61);
        Pessoa pessoa3 = new Pessoa("Sofia", 9, 1.40);

        Professor prof1 = new Professor("Zezinho", 32, 1.75, 2500, "Programação");
        System.out.println(prof1.getNome());
        System.out.println(prof1.getDisciplina());

        System.out.println("Salário antes do aumento: " +  prof1.getSalario());
        prof1.aumentarSalario(250);
        System.out.println("Salário pós aumento: " +   prof1.getSalario());

        Aluno aluno1 = new Aluno("Ana Laura", 47, 1.65, "123456");
        System.out.println(aluno1.getNome());
        System.out.println(aluno1.getMatricula());

        Coordenador coordenador1 = new Coordenador("Rogério", 45, 1.78, 3500, "Programação", 15);
        System.out.println(coordenador1.getQuantidadeFuncionarios());
        System.out.println(coordenador1.getSalario());
        System.out.println(coordenador1.getAltura());

        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.somar(6,7));
        System.out.println(calculadora.subtrair(10,7));
        System.out.println(calculadora.multiplicar(2,4));
        System.out.println(calculadora.dividir(16,4));
        System.out.println(calculadora.potencia(2,5));

    }
}
