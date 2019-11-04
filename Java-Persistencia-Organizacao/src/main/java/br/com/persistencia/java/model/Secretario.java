package br.com.persistencia.java.model;

import javax.persistence.Entity;

@Entity
public class Secretario extends Funcionario {

    private String grauEscolaridade;

    public String getGrauEscolaridade() {
        return grauEscolaridade;
    }

    public void setGrauEscolaridade(String grauEscolaridade) {
        this.grauEscolaridade = grauEscolaridade;
    }

    public Secretario() {
    }

    @Override
    public String toString() {
        return "Secretario{" +
                "grauEscolaridade='" + grauEscolaridade + '\'' +
                '}';
    }
}
