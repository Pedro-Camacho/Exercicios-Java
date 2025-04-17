package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SistemaCadastro {
    private List<Pessoa> pessoas = new ArrayList<>();

    public void cadastrarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public void registrarAtendimento(Pessoa pessoa, Atendimento atendimento) {
        pessoa.adicionarAtendimento(atendimento);
    }

    public List<Pessoa> filtrarPorTipoDeficiencia(String tipo) {
        return pessoas.stream()
                .filter(p -> p.getTipoDeficiencia().equalsIgnoreCase(tipo))
                .collect(Collectors.toList());
    }

    public List<Pessoa> filtrarPorGrau(String grau) {
        return pessoas.stream()
                .filter(p -> p.getGrauDeficiencia().equalsIgnoreCase(grau))
                .collect(Collectors.toList());
    }

    public void gerarRelatorioAtendimentos() {
        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome());
            for (Atendimento a : pessoa.getAtendimentos()) {
                System.out.println("  - " + a.getData() + " | " + a.getTipo() + " com " + a.getProfissional());
            }
        }
    }
}
