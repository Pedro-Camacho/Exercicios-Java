import controller.DiagnosticoController;
import view.DiagnosticoView;

public class Main {
    public static void main(String[] args) {
        DiagnosticoView view  = new DiagnosticoView();
        DiagnosticoController controller = new DiagnosticoController(view);
        controller.cadastrarAnimalDiagnostico();
    }


}
