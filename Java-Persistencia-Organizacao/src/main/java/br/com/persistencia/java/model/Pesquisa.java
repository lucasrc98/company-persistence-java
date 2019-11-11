package br.com.persistencia.java.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Pesquisa {

    @Id
    private long idPesquisa;


    @ManyToOne
    @JoinColumn(name = "idProjeto")
    private Projeto projeto;

    @ManyToOne
    @JoinColumn(name = "idPesquisador")
    private Pesquisador pesquisador;

    private double horasTrabalhadas;


    public long getIdPesquisa() {
        return idPesquisa;
    }

    public void setIdPesquisa(long idPesquisa) {
        this.idPesquisa = idPesquisa;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    public Pesquisador getPesquisador() {
        return pesquisador;
    }

    public void setPesquisador(Pesquisador pesquisador) {
        this.pesquisador = pesquisador;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Pesquisa() {
    }

    public Pesquisa(Projeto projeto, Pesquisador pesquisador, double horasTrabalhadas) {
        this.projeto = projeto;
        this.pesquisador = pesquisador;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public String toString() {
        return "Pesquisa{" +
                "idPesquisa=" + idPesquisa +
                ", projeto=" + projeto +
                ", pesquisador=" + pesquisador +
                ", horasTrabalhadas=" + horasTrabalhadas +
                '}';
    }
}
