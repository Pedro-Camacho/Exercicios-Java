package org.example;

public class Jogo {
    public static void main(String[] args) {
        Personagem p1 = new Mago("Salazar",20);
        Personagem p2 = new Guerreiro("Rodrigo", 35);

        p1.mover();
        p1.atacar();

        p2 .mover();
        p2.atacar();


    }

}
