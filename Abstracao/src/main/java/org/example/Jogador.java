package org.example;

public abstract class Jogador {
    protected String nome;
    protected int numeroCamisa;


    public Jogador(String nome, int numeroCamisa) {
        this.nome = nome;
        this.numeroCamisa = numeroCamisa;
    }

    public void aquecer(){
        System.out.println(nome + "esta aquecendo");
    }

    public abstract void executarPapel(); // cada posição executa de forma diferente

}
