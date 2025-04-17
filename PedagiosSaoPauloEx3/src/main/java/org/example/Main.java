package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PracaPedagio praca = new PracaPedagio("Anhanguera - KM 110", 10.0);

        Veiculo carro = new Carro("ABC-1234");
        Veiculo moto = new Moto("XYZ-5678");
        Veiculo caminhao = new Caminhao("DEF-9999", 4);

        praca.registrarPassagem(carro);
        praca.registrarPassagem(moto);
        praca.registrarPassagem(caminhao);

        praca.emitirRelatorio();
    }
}