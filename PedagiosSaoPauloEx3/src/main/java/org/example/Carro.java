package org.example;

public class Carro implements Veiculo {
    private String placa;

    public Carro(String placa) {
        this.placa = placa;
    }

    @Override
    public String getPlaca() {
        return placa;
    }

    @Override
    public String getTipo() {
        return "Carro";
    }

    @Override
    public double calcularPedagio(double tarifaBase) {
        return tarifaBase;
    }
}
