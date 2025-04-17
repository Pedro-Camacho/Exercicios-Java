package org.example;

public class Caminhao implements Veiculo {
    private String placa;
    private int eixos;

    public Caminhao(String placa, int eixos) {
        this.placa = placa;
        this.eixos = eixos;
    }

    @Override
    public String getPlaca() {
        return placa;
    }

    @Override
    public String getTipo() {
        return "Caminhão";
    }

    public int getEixos() {
        return eixos;
    }

    @Override
    public double calcularPedagio(double tarifaBase) {
        return tarifaBase * eixos;
    }
}
