package one.digitalinnovation.oo;

public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.setCor("Vermelha");
        carro.setModelo("Fiesta");
        carro.setCapacidadeDoTanque(60);
        carro.calularValorTotal(5.00);
        System.out.println(carro);

        System.out.println("----------------");

        Carro carro2 = new Carro();
        carro2.setCor(carro.getCor());
        carro2.setModelo("Fusion");
        carro2.setCapacidadeDoTanque(carro.capacidadeDoTanque);
        carro2.calularValorTotal(2.50);
        System.out.println(carro2);

        Carro carro3 = new Carro("Azul","Fiat",42);
        carro3.calularValorTotal(5.20);
        System.out.println(carro3);
    }
}