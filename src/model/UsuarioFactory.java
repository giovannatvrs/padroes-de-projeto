package model;

import java.util.Scanner;

public class UsuarioFactory {

    public static Usuario criarUsuario(String nome, String tipo) {
        Scanner scan = new Scanner(System.in);
        if(tipo.toLowerCase().equals("aluno")) {
            System.out.println("Matricula do aluno(a): ");
            int matricula = scan.nextInt();
            return new Aluno(nome, matricula);
        }
        else if(tipo.toLowerCase().equals("professor")) {
            System.out.println("E-mail do professor(a): ");
            String email = scan.next();
            return new Professor(nome, email);
        }
        else if(tipo.toLowerCase().equals("visitante")) {
            return new Visitante(nome);
        }
        else{
            throw new IllegalArgumentException("Tipo de usuário inválido: " + tipo);
        }

    }

}
