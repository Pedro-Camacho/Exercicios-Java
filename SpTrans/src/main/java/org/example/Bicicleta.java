package org.example;

public class Bicicleta extends TransporteUrbano{
    public Bicicleta(String nome, int capacidade) {
        super(nome, capacidade);
    }

    @Override
    public void mover() {
        System.out.println(nome + "esta pedalando até a ciclofaixa \n");
    }

    @Override
    public void calcularCusto() {

    }
}
