package org.example.ExerciciosDeEstruturaDeRepeticao.Ex3_MaioeEMedia;

import java.util.Scanner;

public class Ex3_MaiorEMedia {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numero;
        int maior = 0;
        int media;
        int soma = 0;
        int count = 0;

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero > maior) maior = numero;

            count = count + 1;
            soma += numero;
        } while (count < 5);
        media = soma / 5;

        System.out.println("Maior numero: " + maior);
        System.out.println("Média: " + media);
    }
}
