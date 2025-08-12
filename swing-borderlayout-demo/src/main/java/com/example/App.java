package com.example;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            com.example.ui.MainFrame frame = new com.example.ui.MainFrame();
            frame.setVisible(true);
        });
    }

}
