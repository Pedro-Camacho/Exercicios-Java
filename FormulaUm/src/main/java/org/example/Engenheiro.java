package org.example;

public class Engenheiro implements EquipeF1{
    private String nome;

    public Engenheiro(String nome) {
        this.nome = nome;
    }

    @Override
    public void trabalhar() {
        System.out.println(nome + "está analisando os daodos do carro");
    }

    @Override
    public void mostarStatus() {
        System.out.println(nome + " ");
    }
}
