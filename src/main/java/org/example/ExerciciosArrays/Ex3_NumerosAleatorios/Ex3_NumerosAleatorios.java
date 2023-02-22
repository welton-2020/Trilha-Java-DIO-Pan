package org.example.ExerciciosArrays.Ex3_NumerosAleatorios;

import java.util.Random;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {

        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        for (int numeros : numerosAleatorios) {
            System.out.print("\n Numeros Aleatorios: " + numeros + " ");
        }

        for (int numeros : numerosAleatorios) {
            System.out.print("\n Sucessor dos Numeros Aleatorios: " + (numeros +1) + " ");
        }
    }
}
