package org.example;

public class Main {
    public static void main(String[] args) {
            Time corinthians = new Time("Corinthians", "São Paulo");
            Time palmeiras = new Time("Palmeiras", "São Paulo");

            Jogadora rafaela = new Jogadora("Rafaela",22, "Zagueira", 7);
            Jogadora manuela = new Jogadora("Manuela",22, "Atacante", 10);

            Campeonato paulistao = new Paulista("Paulisão");


            paulistao.cadastrarTime(corinthians);
            paulistao.cadastrarTime(palmeiras);

            paulistao.cadastrarJogadora(corinthians, rafaela);
            paulistao.cadastrarJogadora(palmeiras, manuela);

            paulistao.registrarPartida(corinthians, palmeiras, 3,1);
            paulistao.vizualizarTabelaClassificacao();
    }
}