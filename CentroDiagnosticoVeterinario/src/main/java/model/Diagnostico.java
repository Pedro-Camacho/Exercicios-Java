package model;

public class Diagnostico {
    private String nomeAnimal;
    private String diagnostico;

    public Diagnostico(Animal animal, String diagnostico) {
        this.nomeAnimal = animal.getNome();
        this.diagnostico = diagnostico;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public String getDiagnostico() {
        return diagnostico;
    }
}
