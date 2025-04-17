package org.example;

import java.util.ArrayList;
import java.util.List;

public class PracaPedagio {
    private String localizacao;
    private double tarifaBase;
    private List<RegistroPassagem> registros = new ArrayList<>();

    public PracaPedagio(String localizacao, double tarifaBase) {
        this.localizacao = localizacao;
        this.tarifaBase = tarifaBase;
    }

    public void registrarPassagem(Veiculo veiculo) {
        double valor = veiculo.calcularPedagio(tarifaBase);
        registros.add(new RegistroPassagem(veiculo, valor));
    }

    public double getTotalArrecadado() {
        return registros.stream().mapToDouble(RegistroPassagem::getValor).sum();
    }

    public void emitirRelatorio() {
        System.out.println("🛣️ Praça: " + localizacao);
        for (RegistroPassagem reg : registros) {
            System.out.println("- " + reg.getVeiculo().getTipo() + " [" + reg.getVeiculo().getPlaca() + "] → R$ " + reg.getValor());
        }
        System.out.println("💰 Total arrecadado: R$ " + getTotalArrecadado());
    }
}
