package org.example;

public class Piloto implements EquipeF1{
    private String nome;


    public Piloto(String nome) {
        this.nome = nome;
    }

    @Override
    public void trabalhar() {
        System.out.println(nome + "está pilotando na pista");
    }

    @Override
    public void mostarStatus() {
        System.out.println(nome + "está focado na pista!");
    }
}
