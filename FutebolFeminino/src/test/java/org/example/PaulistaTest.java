package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class PaulistaTest {
    private Paulista campeonato;
    private Time timeA;
    private Time timeB;

    @BeforeEach
    void setUp() {
        campeonato = new Paulista("paulsita");
        timeA = new Time("Time A", "São Paulo");
        timeB = new Time("Time B", "Campinas");

        campeonato.cadastrarTime(timeA);
        campeonato.cadastrarTime(timeB);
    }

    @Test
    void testCadastrarJogadora() {
        Jogadora jogadora = new Jogadora("Maria", 22, "Atacante", 10);
        campeonato.cadastrarJogadora(timeA, jogadora);

        assertEquals(1, timeA.getJogadoras().size());
        assertEquals("Maria", timeA.getJogadoras().get(0).getNome());
    }

    @Test
    void testRegistrarPartidaVitoriaTimeA() {
        campeonato.registrarPartida(timeA, timeB, 2, 1);
        assertEquals(3, timeA.getPontos());
        assertEquals(0, timeB.getPontos());
    }

    @Test
    void testRegistrarPartidaVitoriaTimeB() {
        campeonato.registrarPartida(timeA, timeB, 0, 1);
        assertEquals(0, timeA.getPontos());
        assertEquals(3, timeB.getPontos());
    }

    @Test
    void testRegistrarPartidaEmpate() {
        campeonato.registrarPartida(timeA, timeB, 1, 1);
        assertEquals(0, timeA.getPontos());
        assertEquals(0, timeB.getPontos());
    }

    @Test
    void testVisualizarTabelaClassificacao() {
        campeonato.registrarPartida(timeA, timeB, 2, 0); // timeA ganha

        // Captura a saída do console
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        campeonato.vizualizarTabelaClassificacao();

        String resultado = output.toString();
        assertTrue(resultado.contains("1º - Time A | Pontos: 3"));
        assertTrue(resultado.contains("2º - Time B | Pontos: 0"));
    }
}
