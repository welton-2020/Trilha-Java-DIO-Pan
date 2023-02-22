package org.example.ExerciciosDeEstruturaDeRepeticao.Ex2_Nota;

import java.util.Scanner;

public class Ex2_Nota {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nota;

        System.out.println("Digite uma nota de 0 a 10:");
        nota = scan.nextInt();
        while (nota < 0 || nota > 10) {
            System.out.println("Nota invalida ! Digite novamente");
            nota = scan.nextInt();
        }

    }

}


