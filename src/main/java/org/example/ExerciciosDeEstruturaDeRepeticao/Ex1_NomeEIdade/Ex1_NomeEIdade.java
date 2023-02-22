package org.example.ExerciciosDeEstruturaDeRepeticao.Ex1_NomeEIdade;

import java.util.Scanner;

public class Ex1_NomeEIdade {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String nomeAluno;
        int idadeAluno;
        String zero = "0";

        while (true){
            System.out.println("Nome: ");
            nomeAluno = scan.next();
            if (nomeAluno.equalsIgnoreCase("0")){
                System.out.println("Digitou 0 no nome");
                break;
            }
            System.out.println("Idade: ");
            idadeAluno = scan.nextInt();

        }
    }
}
