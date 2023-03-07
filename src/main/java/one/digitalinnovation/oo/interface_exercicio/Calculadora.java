package one.digitalinnovation.oo.interface_exercicio;

public class Calculadora implements OperacaoMatematica{

    public static void main(String[] args) {


    }

    @Override
    public void soma(double operador1, double operador2) {
     double soma = operador1 + operador2;
        System.out.println("Soma: "+ soma);
    }

    @Override
    public void subtracao(double operador1, double operador2) {
        double subtracao = operador1 - operador2;
        System.out.println("Subtracao: "+ subtracao);
    }

    @Override
    public void multiplicacao(double operador1, double operador2) {
        double multiplicacao = operador1 * operador2;
        System.out.println("Multiplicacao: "+ multiplicacao);
    }

    @Override
    public void divisao(double operador1, double operador2) {
        double divisao = operador1 / operador2;
        System.out.println("Divisão: "+ divisao);
    }
}
