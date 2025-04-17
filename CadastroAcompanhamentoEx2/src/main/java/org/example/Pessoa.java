package org.example;
import java.util.List;

public interface Pessoa {
    String getNome();
    int getIdade();
    String getTipoDeficiencia();
    String getGrauDeficiencia();
    String getEndereco();
    List<Atendimento> getAtendimentos();
    void adicionarAtendimento(Atendimento atendimento);
}
