package org.example;

import java.util.ArrayList;
import java.util.List;

public class Saopaulo {
    public static void main(String[] args) {
        TransporteUrbano lilas =  new Metro("lilas", 120);
        TransporteUrbano azul = new Onibus("6020", 60);
        TransporteUrbano bike = new Bicicleta("Caloi rosa", 1);

        List<TransporteUrbano> fluxo = new ArrayList<TransporteUrbano>();
        fluxo.add(lilas);
        fluxo.add(azul);
        fluxo.add(bike);

        fluxo.forEach(TransporteUrbano::exibirInfo);
        for(TransporteUrbano transposte : fluxo){
            transposte.exibirInfo();
            transposte.mover();
        }
    }
}
