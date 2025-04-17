package org.example;

import java.util.ArrayList;
import java.util.List;

public class Paulista implements Campeonato{
    private String nomeCampeonato;
    private List<Time> times = new ArrayList<Time>();


    public Paulista(String nomeCampeonato) {
        this.nomeCampeonato = nomeCampeonato;
    }

    @Override
    public void cadastrarTime(Time time) {
        times.add(time);
    }

    @Override
    public void cadastrarJogadora(Time time, Jogadora jogadora) {
        time.adicionarJogadora(jogadora);
    }

    @Override
    public void registrarPartida(Time timeUm, Time timeDois, int golUm, int golDois) {
        if(golUm>golDois){
            timeUm.setPontos(3);
        }else if(golUm<golDois) {
            timeDois.setPontos(3);
        }
        System.out.println("Partida registrada entre "+ timeUm.getNome() + " e "+timeDois.getNome()+" resultado ("+golUm+", "+golDois+")");
    }

    @Override
    public void vizualizarTabelaClassificacao() {
        // Cria uma cópia da lista de times para ordenar
        List<Time> timesOrdenados = new ArrayList<>(times);

        // Ordena os times com base nos pontos (ordem decrescente)
        timesOrdenados.sort((t1, t2) -> Integer.compare(t2.getPontos(), t1.getPontos()));

        // Exibe a tabela
        System.out.println("=== Tabela de Classificação ===");
        int posicao = 1;
        for (Time time : timesOrdenados) {
            System.out.println(posicao + "º - " + time.getNome() + " | Pontos: " + time.getPontos());
            posicao++;
        }
    }
}
