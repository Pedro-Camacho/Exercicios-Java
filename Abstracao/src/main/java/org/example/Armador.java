package org.example;

public class Armador extends Jogador {
    public Armador(String nome, int numeroCamisa) {
        super(nome, numeroCamisa);
    }

    @Override
    public void  executarPapel(){
        System.out.println(nome + "organiza o aqtaque e a defesa do time");
    }
}

