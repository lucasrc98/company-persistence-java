package br.com.persistencia.java.util;


import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class HorasTrabId implements Serializable {

    @Column(name = "projeto_id", nullable = false, insertable = false, updatable = false)
    private long idProjeto;

    @Column(name = "pesquisador_id", nullable = false, insertable = false, updatable = false)
    private long idPesquisador;

    public long getIdProjeto() {
        return idProjeto;
    }

    public void setIdProjeto(long idProjeto) {
        this.idProjeto = idProjeto;
    }

    public long getIdPesquisador() {
        return idPesquisador;
    }

    public void setIdPesquisador(long idPesquisador) {
        this.idPesquisador = idPesquisador;
    }

    public HorasTrabId() {
    }
}
