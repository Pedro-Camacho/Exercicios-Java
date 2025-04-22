package org.example;

public abstract class Personagem {
    protected String nome;
    protected int vida;

    public Personagem(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public void mover(){
        System.out.println(nome + " está se movendo. . .");
    }

    public abstract void atacar();


}
