package org.example;

public class Onibus extends TransporteUrbano{
    public Onibus(String nome, int capacidade) {
        super(nome, capacidade);
    }

    @Override
    public void mover() {
        System.out.println(nome +" esta andando por santo amaro indo para seu proximo ponto \n");
    }

    @Override
    public void calcularCusto() {
        System.out.println("2,20 debitado!\n");
    }
}
