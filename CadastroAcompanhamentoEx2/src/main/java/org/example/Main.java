package org.example;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        SistemaCadastro sistema = new SistemaCadastro();

        Pessoa pessoa1 = new PessoaComDeficiencia("João", 28, "Visual", "moderado", "Rua A");
        Pessoa pessoa2 = new PessoaComDeficiencia("Maria", 32, "Motora", "severo", "Rua B");

        sistema.cadastrarPessoa(pessoa1);
        sistema.cadastrarPessoa(pessoa2);

        Atendimento at1 = new Fisioterapia(LocalDate.of(2024, 4, 10), "Dr. Silva");
        Atendimento at2 = new Psicologia(LocalDate.of(2024, 4, 11), "Dra. Clara");

        sistema.registrarAtendimento(pessoa1, at1);
        sistema.registrarAtendimento(pessoa1, at2);

        sistema.gerarRelatorioAtendimentos();
    }
}
