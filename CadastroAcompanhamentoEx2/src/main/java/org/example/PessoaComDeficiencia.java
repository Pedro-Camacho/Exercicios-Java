package org.example;
import java.util.ArrayList;
import java.util.List;

public class PessoaComDeficiencia implements Pessoa {
    private String nome;
    private int idade;
    private String tipoDeficiencia;
    private String grauDeficiencia;
    private String endereco;
    private List<Atendimento> atendimentos = new ArrayList<>();

    public PessoaComDeficiencia(String nome, int idade, String tipoDeficiencia, String grauDeficiencia, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.tipoDeficiencia = tipoDeficiencia;
        this.grauDeficiencia = grauDeficiencia;
        this.endereco = endereco;
    }

    @Override public String getNome() { return nome; }
    @Override public int getIdade() { return idade; }
    @Override public String getTipoDeficiencia() { return tipoDeficiencia; }
    @Override public String getGrauDeficiencia() { return grauDeficiencia; }
    @Override public String getEndereco() { return endereco; }
    @Override public List<Atendimento> getAtendimentos() { return atendimentos; }
    @Override public void adicionarAtendimento(Atendimento atendimento) { atendimentos.add(atendimento); }
}
