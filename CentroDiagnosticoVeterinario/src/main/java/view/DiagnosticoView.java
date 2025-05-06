package view;

import java.util.Scanner;

public class DiagnosticoView {
    private Scanner scanner;
    public DiagnosticoView(){
        scanner = new Scanner(System.in);
    }

    public String solicitarNomeAnimal(){
        System.out.println("Digite o nome do animal para diagnostico: ");
        return scanner.nextLine();
    };
    public String solicitarEspecie(){
        System.out.println("Digite o nome da especie do animal: ");
        return scanner.nextLine();
    };
    public int solicitarIdade(){
        System.out.println("Digite a idade do animal");
        return Integer.parseInt(scanner.nextLine());
    };

    public String solicitarDiagnostico(){
        System.out.println("Digite o diagnostico do animal");
        return scanner.nextLine();
    }
    public void mostrarMensagem(String mensagem){
        System.out.println(mensagem);
    }
}
