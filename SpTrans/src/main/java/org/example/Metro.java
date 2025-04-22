package org.example;

public class Metro extends TransporteUrbano{
    public Metro(String nome, int capacidade) {
        super(nome, capacidade);
    }

    @Override
    public void mover() {
        System.out.println(nome + " esta a correndo para proxima estação \n ");
    }

    @Override
    public void calcularCusto() {
        System.out.println("3,20 debitado\n");
    }
}
