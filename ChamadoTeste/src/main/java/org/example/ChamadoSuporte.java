package org.example;

public class ChamadoSuporte implements OperacoesChamados{
    private String titulo;
    private String descricao;
    private boolean emAtendimento = false;
    private boolean fechado = false;

    @Override
    public void criarChamado(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
        System.out.printf("chamado de suporte criado: "+titulo);
    }

    @Override
    public void atenderChamado() {
        if(!fechado){
            emAtendimento =  true;
            System.out.println("Atendendo chamado de Suporte: "+titulo);
        }else{
            System.out.println("Chamado já fechado!");
        }
    }

    @Override
    public void fecharChamado() {
        if(emAtendimento){
            fechado = true;
            System.out.println("Chamado de Suporte fechado: "+ titulo);
        }else{
            System.out.println("Chamado precisa estar em atendimento antes de ser fechado.");
        }
    }
}
