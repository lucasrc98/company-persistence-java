package br.com.persistencia.java.model;

import br.com.persistencia.java.util.HorasTrabId;

import javax.persistence.*;

@Entity
public class HorasTrabalhadas {

	@EmbeddedId
	private HorasTrabId idHorasTrabalhadas;

    @MapsId("Projeto")
	@ManyToOne
    @JoinColumn(name = "projeto_pk", nullable = false, insertable = false, updatable = false)
	private Projeto projeto;

    @MapsId("Pesquisador")
	@ManyToOne
    @JoinColumn(name = "idPesquisador", nullable = false, insertable = false, updatable = false)
	private Pesquisador pesquisador;

    private double qtdHoras;

    public HorasTrabId getIdHorasTrabalhadas() {
        return idHorasTrabalhadas;
    }

    public void setIdHorasTrabalhadas(HorasTrabId idHorasTrabalhadas) {
        this.idHorasTrabalhadas = idHorasTrabalhadas;
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

    public double getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(double qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    public HorasTrabalhadas() {
    }

    @Override
    public String toString() {
        return "HorasTrabalhadas{" +
                "idHorasTrabalhadas=" + idHorasTrabalhadas +
                ", projeto=" + projeto +
                ", pesquisador=" + pesquisador +
                ", qtdHoras=" + qtdHoras +
                '}';
    }
}
