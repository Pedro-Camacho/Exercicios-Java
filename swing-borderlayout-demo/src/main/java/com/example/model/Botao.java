package com.example.model;

public class Botao {
    public String texto;
    public String iconPath;
    public String toolTipHtml;
    public char menemoc;

    public Botao(String texto, String iconPath, String toolTipHtml, char menemoc) {
        this.texto = texto;
        this.iconPath = iconPath;
        this.toolTipHtml = toolTipHtml;
        this.menemoc = menemoc;
    }

    public String getTexto() {
        return texto;
    }

    public String getIconPath() {
        return iconPath;
    }

    public String getToolTipHtml() {
        return toolTipHtml;
    }

    public char getMenemoc() {
        return menemoc;
    }
}
