package org.example;

public  abstract class  TransporteUrbano {

    protected String nome;
    protected int capacidade;

    public TransporteUrbano(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public void exibirInfo(){
        System.out.printf(nome+" tem "+capacidade+ "\n");
    };
    public abstract void mover();
    public abstract void calcularCusto();
}
