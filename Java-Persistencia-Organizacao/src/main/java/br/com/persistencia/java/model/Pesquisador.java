package br.com.persistencia.java.model;

import javax.persistence.Entity;

@Entity
public class Pesquisador extends Funcionario {

    private String areaAtuacao;

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public Pesquisador() {
    }

    @Override
    public String toString() {
        return "Pesquisador{" +
                "areaAtuacao='" + areaAtuacao + '\'' +
                '}';
    }
}