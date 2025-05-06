package org.main;

import org.controller.UsuarioController;
import org.view.UsuarioView;

public class Main {
    public static void main(String[] args) {
        UsuarioView view = new UsuarioView();
        UsuarioController controller = new UsuarioController(view);

        controller.cadastrarUsuario();
    }
}
