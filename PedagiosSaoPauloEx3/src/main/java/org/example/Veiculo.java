package org.example;

public interface Veiculo {
    String getPlaca();
    String getTipo();
    double calcularPedagio(double tarifaBase);
}
