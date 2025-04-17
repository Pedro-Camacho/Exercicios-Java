package org.example;

public class Moto implements Veiculo {
    private String placa;

    public Moto(String placa) {
        this.placa = placa;
    }

    @Override
    public String getPlaca() {
        return placa;
    }

    @Override
    public String getTipo() {
        return "Moto";
    }

    @Override
    public double calcularPedagio(double tarifaBase) {
        return tarifaBase * 0.5;
    }
}
