package org.example;
import java.time.LocalDate;

public class Fisioterapia implements Atendimento {
    private LocalDate data;
    private String profissional;

    public Fisioterapia(LocalDate data, String profissional) {
        this.data = data;
        this.profissional = profissional;
    }

    @Override
    public LocalDate getData() {
        return data;
    }

    @Override
    public String getTipo() {
        return "Fisioterapia";
    }

    @Override
    public String getProfissional() {
        return profissional;
    }
}
