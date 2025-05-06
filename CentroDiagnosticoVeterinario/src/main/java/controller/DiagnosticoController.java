package controller;

import model.Animal;
import model.Diagnostico;
import view.DiagnosticoView;

import java.util.ArrayList;
import java.util.List;


public class DiagnosticoController {

    private List<Diagnostico> diagnosticoLista = new ArrayList<>();
    private Animal animal;
    private DiagnosticoView diagnosticoView;

    public DiagnosticoController(DiagnosticoView diagnosticoView) {
        this.diagnosticoView = diagnosticoView;
    }
    public void cadastrarAnimalDiagnostico(){
        String nomeAnimal = diagnosticoView.solicitarNomeAnimal();
        String especieAnimal = diagnosticoView.solicitarEspecie();
        int idadeAnimal = diagnosticoView.solicitarIdade();

        animal = new Animal(nomeAnimal, especieAnimal, idadeAnimal);

        diagnosticoView.mostrarMensagem("Animal cadastrado:");
        diagnosticoView.mostrarMensagem("Nome animal: "+ animal.getNome());
        diagnosticoView.mostrarMensagem("Especie: "+animal.getEspecie());
        diagnosticoView.mostrarMensagem("Idade: "+ animal.getIdade());

        String diagnostico = diagnosticoView.solicitarDiagnostico();
        Diagnostico diagnosticoRegistrar = new Diagnostico(animal, diagnostico);
        diagnosticoLista.add(diagnosticoRegistrar);
    }

    public void listarDiagnostico(){
        for(Diagnostico dia : diagnosticoLista){
            System.out.println(dia.getNomeAnimal());
            System.out.println(dia.getDiagnostico());
        }
    }


}
