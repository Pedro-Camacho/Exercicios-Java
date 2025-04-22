package org.example;

public class Pivo extends Jogador{
    public Pivo(String nome, int numeroCamisa) {
        super(nome, numeroCamisa);
    }

    @Override
    public void executarPapel() {
        System.out.println(nome + "fica no garrafão e pega rebote");
    }
    protected  double altura;

    public void mostrarInfo(){
        System.out.println(nome + "- Camisa "+ numeroCamisa + " -Altura:" + altura + "m");
    }
}
