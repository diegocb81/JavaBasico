package main.java.aula3;

/*
Validação de Login

Crie um programa que simule um login. O programa deve:
Ler um nome de usuário e uma senha
Verificar se o usuário é "admin" E a senha é "1234"
Se ambos estiverem corretos, exiba "Login realizado!"
Caso contrário, exiba "Usuário ou senha incorretos"
Entrada: Usuário e senha Saída: Mensagem de sucesso ou erro
 */


import java.util.Scanner;

public class Desafio1ValidacaoDeLogin {

    public static void main(String[] args) {
        String usuario;
        int senha;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        usuario = sc.nextLine();

        System.out.print("Digite seu senha: ");
        senha = sc.nextInt();

        if (usuario.equals("admin") && senha == 1234){
            System.out.println("Login realizado!");
        } else {
            System.out.println("Usuário ou senha incorretos!");
        }

        sc.close();
    }
}
