package org.example;

import org.example.MAula01.Calculadora;
import org.example.MAula01.Emprestimo;
import org.example.MAula01.Mensagens;
import org.example.MAula02.Quadrilatero;
import org.example.MAula03.QuadrilateroComRetorno;

public class Main {
    public static void main(String[] args) {

        // Calculadora
        System.out.println("\nExercicio de Calculadora");
        Calculadora.soma(1,8);
        Calculadora.subtracao(9.0,1.8);
        Calculadora.multiplicacao(3,3);
        Calculadora.divisao(27,3);

        // Mesagens
        System.out.println("\nExercicio de Mensagens");
        Mensagens.obterMensagem(6);
        Mensagens.obterMensagem(14);
        Mensagens.obterMensagem(1);

        //Empréstimo
        System.out.println("\nExercicio de Empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

        // Quadrilátero
        System.out.println("\nExercicio Quadrilátero sem retorno");
        Quadrilatero.area(3);
        Quadrilatero.area(5d,5d);
        Quadrilatero.area(7,8,9);
        Quadrilatero.area(5f,5f);

        // Quadrilátero com return do tipo
        System.out.println("\nExercicio Quadrilátero com retorno");
        double areaQuadrado = QuadrilateroComRetorno.area(3);
        System.out.print("Area do quadrado: " + areaQuadrado);

        double areaRetangulo = QuadrilateroComRetorno.area(5,5);
        System.out.print("\nArea do retangulo: "+ areaRetangulo);

        double areaTrapezio = QuadrilateroComRetorno.area(7,8,9);
        System.out.print("\nArea do Trapézio: " + areaTrapezio);

        float areaLosango = QuadrilateroComRetorno.area(5,5);
        System.out.print("\nArea do Losango: " + areaLosango);


    }
}