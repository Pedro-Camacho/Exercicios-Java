package org.example;

public interface Campeonato {
    void cadastrarTime(Time time);
    void cadastrarJogadora(Time time, Jogadora jogadora);
    void registrarPartida(Time timeUm, Time timeDois, int golUm, int golDois);
    void vizualizarTabelaClassificacao();
}
