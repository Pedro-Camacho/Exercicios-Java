package org.example;

public class ChefeDeEquipe implements EquipeF1{
    private String nome;

    public ChefeDeEquipe(String nome) {
        this.nome = nome;
    }

    @Override
    public void trabalhar() {
        System.out.println(nome + "fica no paddock");
    }

    @Override
    public void mostarStatus() {
        System.out.println(nome + "está no paddocke comendo!");
    }
}
