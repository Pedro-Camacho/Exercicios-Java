package org.example;

import java.util.ArrayList;
import java.util.List;

public class Time {
    private String nome;
    private String cidade;
    private List<Jogadora> jogadoras = new ArrayList<Jogadora>();
    private int pontos;

    public Time(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }
    public int getPontos(){
        return pontos;
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public List<Jogadora> getJogadoras() {
        return jogadoras;
    }

    public void setPontos(int pontos){
        this.pontos+=pontos;
    }


    public void adicionarJogadora(Jogadora jogadora){
        jogadoras.add(jogadora);
    }


}
