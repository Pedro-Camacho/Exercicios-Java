package org.example;

import java.time.LocalDate;

public class Psicologia implements Atendimento {
    private LocalDate data;
    private String profissional;

    public Psicologia(LocalDate data, String profissional) {
        this.data = data;
        this.profissional = profissional;
    }

    @Override
    public LocalDate getData() {
        return data;
    }

    @Override
    public String getTipo() {
        return "Psicologia";
    }

    @Override
    public String getProfissional() {
        return profissional;
    }
}

