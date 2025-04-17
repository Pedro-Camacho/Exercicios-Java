package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SistemaCadastroTest {

    private SistemaCadastro sistema;
    private Pessoa pessoa1;
    private Pessoa pessoa2;

    @BeforeEach
    public void setup() {
        sistema = new SistemaCadastro();

        pessoa1 = new PessoaComDeficiencia("Ana", 40, "Visual", "moderado", "Rua X");
        pessoa2 = new PessoaComDeficiencia("Carlos", 35, "Auditiva", "leve", "Rua Y");

        sistema.cadastrarPessoa(pessoa1);
        sistema.cadastrarPessoa(pessoa2);
    }

    @Test
    public void testCadastroDePessoa() {
        List<Pessoa> filtrado = sistema.filtrarPorTipoDeficiencia("Visual");
        assertEquals(1, filtrado.size());
        assertEquals("Ana", filtrado.get(0).getNome());
    }

    @Test
    public void testRegistrarAtendimentoFisioterapia() {
        Atendimento fisio = new Fisioterapia(LocalDate.of(2025, 4, 17), "Dr. João");
        sistema.registrarAtendimento(pessoa1, fisio);

        List<Atendimento> atendimentos = pessoa1.getAtendimentos();
        assertEquals(1, atendimentos.size());
        assertEquals("Fisioterapia", atendimentos.get(0).getTipo());
        assertEquals("Dr. João", atendimentos.get(0).getProfissional());
    }

    @Test
    public void testRegistrarAtendimentoPsicologia() {
        Atendimento psico = new Psicologia(LocalDate.of(2025, 4, 18), "Dra. Beatriz");
        sistema.registrarAtendimento(pessoa2, psico);

        List<Atendimento> atendimentos = pessoa2.getAtendimentos();
        assertEquals(1, atendimentos.size());
        assertEquals("Psicologia", atendimentos.get(0).getTipo());
    }

    @Test
    public void testFiltrarPorGrauDeficiencia() {
        List<Pessoa> resultado = sistema.filtrarPorGrau("leve");
        assertEquals(1, resultado.size());
        assertEquals("Carlos", resultado.get(0).getNome());
    }

    @Test
    public void testRelatorioDeAtendimentos() {
        Atendimento at1 = new Fisioterapia(LocalDate.of(2025, 4, 10), "Dr. A");
        Atendimento at2 = new Psicologia(LocalDate.of(2025, 4, 11), "Dra. B");

        sistema.registrarAtendimento(pessoa1, at1);
        sistema.registrarAtendimento(pessoa1, at2);

        List<Atendimento> atendimentos = pessoa1.getAtendimentos();
        assertEquals(2, atendimentos.size());
        assertTrue(atendimentos.stream().anyMatch(a -> a.getTipo().equals("Fisioterapia")));
        assertTrue(atendimentos.stream().anyMatch(a -> a.getTipo().equals("Psicologia")));
    }
}
