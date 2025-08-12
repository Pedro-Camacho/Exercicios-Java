package com.example.ui;

import com.example.model.Botao;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class MainFrame extends JFrame {
    public MainFrame() {
        super("Main Demo");
        initialize();
    }

    private void initialize() {
        configureLookAndFeel();
        configureFrame();
        addComponents();
    }
    private void configureLookAndFeel() {
        // Tenta ativar o tema Nimbus para um visual mais moderno (opcional)
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ignored) { /* Fallback para o L&F padrão */ }
    }
    private void configureFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(8, 8));
        setSize(420, 300);
        setLocationRelativeTo(null); // centraliza

        // Ícone da janela (opcional, se existir)
        ImageIcon appIcon = loadIcon("/icons/app.png", 32);
        if (appIcon != null) {
            setIconImage(appIcon.getImage());
        }
    }


    private void addComponents() {
        List<JButton> listaBotoes = new ArrayList<>();

        Botao norte = new Botao("NORTE","/icons/north.png","<html><b>Ir para o Norte</b><br/>Atalho: Alt+N</html>",'N');
        Botao sul = new Botao("SUL", "/icons/south.png", "<html><b>Ir para o Sul</b><br/>Atalho: Alt+S</html>", 'S');
        Botao oeste = new Botao("OESTE", "/icons/west.png", "<html><b>Ir para o Oeste</b><br/>Atalho: Alt+O</html>", 'O');
        Botao leste = new Botao("LESTE", "/icons/east.png", "<html><b>Ir para o Leste</b><br/>Atalho: Alt+L</html>", 'L');
        Botao centro = new Botao("CENTRO", "/icons/center.png", "<html><b>Ação do Centro</b><br/>Atalho: Alt+C</html>", 'C');

        JButton btnNorte  = createButton(
                norte.getTexto(),
                norte.getIconPath(),
                norte.getToolTipHtml(),
                norte.getMenemoc());
        listaBotoes.add(btnNorte);
        JButton btnSul    = createButton(
                sul.getTexto(),
                sul.getIconPath(),
                sul.getToolTipHtml(),
                sul.getMenemoc());
        listaBotoes.add(btnSul);

        JButton btnOeste  = createButton(
                oeste.getTexto(),
                oeste.getIconPath(),
                oeste.getToolTipHtml(),
                oeste.getMenemoc());
        listaBotoes.add(btnOeste);

        JButton btnLeste  = createButton(
                leste.getTexto(),
                leste.getIconPath(),
                leste.getToolTipHtml(),
                leste.getMenemoc());
        listaBotoes.add(btnLeste);

        JButton btnCentro = createButton(
                centro.getTexto(),
                centro.getIconPath(),
                centro.getToolTipHtml(),
                centro.getMenemoc());
        listaBotoes.add(btnCentro);

        // Ações simples de demonstração
        for(JButton btn :listaBotoes){
            btn.addActionListener(e ->
                    JOptionPane.showMessageDialog(this, "Clique em "+btn.getName(), "Ação", JOptionPane.INFORMATION_MESSAGE));
        }
        add(btnNorte,  BorderLayout.NORTH);
        add(btnSul,    BorderLayout.SOUTH);
        add(btnOeste,  BorderLayout.WEST);
        add(btnLeste,  BorderLayout.EAST);
        add(btnCentro, BorderLayout.CENTER);
    }

    /** Cria botão estilizado com ícone (se existir), tooltip, mnemonic e cursor de mão. */
    private JButton createButton(String text, String iconPath, String tooltipHtml, int mnemonic) {
        JButton b = new JButton(text);
        ImageIcon icon = loadIcon(iconPath, 18);
        if (icon != null) {
            b.setIcon(icon);
        }
        b.setToolTipText(tooltipHtml);
        b.setMnemonic(mnemonic);
        b.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        b.setFocusPainted(false);
        b.setBorder(new javax.swing.border.EmptyBorder(8, 12, 8, 12)); // mais área clicável
        return b;
    }


    /** Carrega e escala um PNG do classpath; retorna null se não encontrado. */
    private ImageIcon loadIcon(String path, int size) {
        URL url = getClass().getResource(path);
        if (url == null) return null;
        Image img = new ImageIcon(url).getImage().getScaledInstance(size, size, Image.SCALE_SMOOTH);
        return new ImageIcon(img);
    }

}
