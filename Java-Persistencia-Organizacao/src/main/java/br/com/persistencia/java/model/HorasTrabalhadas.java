package br.com.persistencia.java.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class HorasTrabalhadas {

    @Id
    private long idPesquisador;
    private long idProjeto;

    private double qtdHoras;

    public long getIdPesquisador() {
        return idPesquisador;
    }

    public void setIdPesquisador(long idPesquisador) {
        this.idPesquisador = idPesquisador;
    }

    public long getIdProjeto() {
        return idProjeto;
    }

    public void setIdProjeto(long idProjeto) {
        this.idProjeto = idProjeto;
    }

    public double getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(double qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    public HorasTrabalhadas() {
    }

    public HorasTrabalhadas(long idPesquisador, long idProjeto, double qtdHoras) {
        this.idPesquisador = idPesquisador;
        this.idProjeto = idProjeto;
        this.qtdHoras = qtdHoras;
    }

    @Override
    public String toString() {
        return "HorasTrabalhadas{" +
                "idPesquisador=" + idPesquisador +
                ", idProjeto=" + idProjeto +
                ", qtdHoras=" + qtdHoras +
                '}';
    }
}
