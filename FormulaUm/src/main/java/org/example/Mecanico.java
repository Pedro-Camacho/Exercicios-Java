package org.example;

public class Mecanico implements EquipeF1{
    private String nome;

    public Mecanico(String nome) {
        this.nome = nome;
    }

    @Override
    public void trabalhar() {
        System.out.printf(nome + "é o mecanico da equipe");
    }

    @Override
    public void mostarStatus() {
        System.out.printf(nome + "está monitorando a telimetria do carro");
    }
}
