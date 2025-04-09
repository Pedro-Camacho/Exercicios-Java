package org.example;
import java.time.LocalDate;
public class Chamado {
    private int id;
    private String descricao;
    private String resposavel;
    private LocalDate dataAbertura;
    private LocalDate dataFechamento;


    /**
     *
     * @param id
     * @param descricao
     * @param resposavel
     * @param dataAbertura
     * @param dataFechamento
     */
    public Chamado(int id, String descricao, String resposavel, LocalDate dataAbertura, LocalDate dataFechamento) {
        this.id = id;
        this.descricao = descricao;
        this.resposavel = resposavel;
        this.dataAbertura = dataAbertura;
        this.dataFechamento = dataFechamento;
    }
    /*
    Fecha o chamado
     */
    public void fecharChamado(LocalDate dataFechamento){
        this.dataFechamento=dataFechamento;
    }

    /**
     *
     * @return dataFechamento retorna true se o chamado estiber aberto ou seja não ter data de fechamento
     */
    public boolean estaAberto(){
        return dataFechamento == null;
    }

    /**
     *
     * @return id getter
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return descricao getter
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     *
     * @return responsavel getter
     */
    public String getResposavel() {
        return resposavel;
    }

    /**
     *
     * @return Data abertura getter
     */
    public LocalDate getDataAbertura() {
        return dataAbertura;
    }

    /**
     *
     * @return Data fechamento getter
     */
    public LocalDate getDataFechamento() {
        return dataFechamento;
    }
}
