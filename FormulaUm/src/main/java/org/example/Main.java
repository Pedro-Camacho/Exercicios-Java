package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EquipeFormula1 equipe = new EquipeFormula1();

        EquipeF1 piloto = new Piloto("Hamilton");
        EquipeF1 engenheiro = new Engenheiro("Clarie");
        EquipeF1 mecanico = new Mecanico("Carlão");
        EquipeF1 chefe = new ChefeDeEquipe("Guther");

        equipe.adicionarMembro(piloto);
        equipe.adicionarMembro(engenheiro);
        equipe.adicionarMembro(mecanico);
        equipe.adicionarMembro(chefe);


        System.out.println("Operação da equipe: ");
        equipe.iniciarOperacao();

        System.out.println("\nStatus dos membros: ");
        equipe.statusGeral();
    }
}