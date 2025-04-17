package org.example;

public class Jogadora {

    private String nome;
    private int idade;
    private String posicao;
    private int numCamisa;

    public Jogadora(String nome, int idade, String posicao, int numCamisa) {
        this.nome = nome;
        this.idade = idade;
        this.posicao = posicao;
        this.numCamisa = numCamisa;
    }


    public String getNome() {
        return this.nome;
    }
}
