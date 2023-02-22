package org.example.ExerciciosDeEstruturaDeRepeticao.Ex4_ParEImpar;

import java.util.Scanner;

public class Ex4_ParEImpar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int quantidadeNumeros;
        int n = 0;
        int par = 0;
        int impar = 0;
        int count = 0;
        int soma = 0;

        System.out.println("Quantidade de numeros: ");
        quantidadeNumeros = scan.nextInt();

        do {
            System.out.println("Digite o numero: ");
            n = scan.nextInt();

            if (n % 2 == 0) par++;
            else impar++;

            soma = n + n;

            count++;
        }while (count < quantidadeNumeros);

        System.out.println("Calculo: " + soma);
        System.out.println("Par: " + par);
        System.out.println("Impar: " + impar);
    }
}
