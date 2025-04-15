package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        OperacoesChamados chamado1 = new ChamadoSuporte();
        chamado1.criarChamado("Problema no email", "Não consigo acessar meu e-mail.");
        chamado1.atenderChamado();
        chamado1.fecharChamado();

        System.out.println("----------------------");

        OperacoesChamados chamado2 = new ChamadoTI();
        chamado2.criarChamado("Computador travanado", "O PC está muito lento.");
        chamado2.atenderChamado();
        chamado2.fecharChamado();
    }
}