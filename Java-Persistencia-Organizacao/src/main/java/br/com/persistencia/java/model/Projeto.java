package br.com.persistencia.java.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Projeto {

    @Id
    private long idProjeto;

    private String nomeProjeto;
    private float tempoDesenvolvimento;

    public long getIdProjeto() {
        return idProjeto;
    }

    public void setIdProjeto(long idProjeto) {
        this.idProjeto = idProjeto;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public float getTempoDesenvolvimento() {
        return tempoDesenvolvimento;
    }

    public void setTempoDesenvolvimento(float tempoDesenvolvimento) {
        this.tempoDesenvolvimento = tempoDesenvolvimento;
    }

    public Projeto() {
    }

    @Override
    public String toString() {
        return "Projeto{" +
                "idProjeto=" + idProjeto +
                ", nomeProjeto='" + nomeProjeto + '\'' +
                ", tempoDesenvolvimento=" + tempoDesenvolvimento +
                '}';
    }
}
