package one.digitalinnovation.oo;

public class Carro {

    String cor;
    String modelo;
    int capacidadeDoTanque;

    public Carro() {
    }

    public Carro(String cor, String modelo, int capacidadeDoTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeDoTanque = capacidadeDoTanque;
    }

    public void calularValorTotal(double valorCombustivel){
        int res = (int) (capacidadeDoTanque * valorCombustivel);
        System.out.print("Valor total para encher o tanque é de: R$ " + res);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadeDoTanque() {
        return capacidadeDoTanque;
    }

    public void setCapacidadeDoTanque(int capacidadeDoTanque) {
        this.capacidadeDoTanque = capacidadeDoTanque;
    }

    @Override
    public String toString() {
        return "\n Dados do Carro{" +
                "\n cor='" + cor + '\'' +
                ", \n modelo='" + modelo + '\'' +
                ", \n capacidadeDoTanque=" + capacidadeDoTanque + "\n" +
                '}';
    }
}
