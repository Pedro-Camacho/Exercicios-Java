package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PracaPedagioTest {

    @Test
    public void testCalculoCarro() {
        Veiculo carro = new Carro("AAA-1111");
        assertEquals(10.0, carro.calcularPedagio(10.0));
    }

    @Test
    public void testCalculoMoto() {
        Veiculo moto = new Moto("BBB-2222");
        assertEquals(5.0, moto.calcularPedagio(10.0));
    }

    @Test
    public void testCalculoCaminhao() {
        Veiculo caminhao = new Caminhao("CCC-3333", 3);
        assertEquals(30.0, caminhao.calcularPedagio(10.0));
    }

    @Test
    public void testRegistroDePassagem() {
        PracaPedagio praca = new PracaPedagio("SP-330", 10.0);
        praca.registrarPassagem(new Carro("AAA-1111"));
        praca.registrarPassagem(new Moto("BBB-2222"));
        praca.registrarPassagem(new Caminhao("CCC-3333", 2));

        assertEquals(10.0 + 5.0 + 20.0, praca.getTotalArrecadado());
    }
}
