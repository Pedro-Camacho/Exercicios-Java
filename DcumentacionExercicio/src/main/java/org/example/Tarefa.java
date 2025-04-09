package org.example;

public class Tarefa {
    //Bem vindo a classe tarefa
    private String titulo;
    private String descricao;
    private boolean concluida;

    /**
     *
     * @param titulo titulo da tarefa
     * @param descricao descrição da tarefa
     * @param concluida estato da tarefa
     */
    public Tarefa(String titulo, String descricao, boolean concluida) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.concluida = concluida;
    }


    public void concluir(){
        // torna o estado de conclusão para true
        this.concluida = true;
    }


    public void reabrir(){
        // torna o estado de conclusão para false
        this.concluida=false;
    }

    public String getTitulo() {
        //getter do titulo
        return titulo;
    }

    public String getDescricao() {
        //getter da descrição
        return descricao;
    }
}
