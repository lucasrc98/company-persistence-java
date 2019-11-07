package br.com.persistencia.java.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HorasTrabalhadas {


//	@Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "pesquisador_pk", columnDefinition = "2")
    private long idPesquisador;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "projeto_pk", columnDefinition = "2")
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
