package org.example;

public class Robo implements Movimentando, Reciclando{
    @Override
    public void mover() {
        System.out.println("O robó está se movendo");
    }

    @Override
    public void reciclar() {
        System.out.println("O robó está recicalndo materiais");
    }
}
