package br.com.persistencia.java.util;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class HorasTrabId implements Serializable {

    @Column(name = "projeto_id")
    private long idProjeto;

    @Column(name = "pesquisador_id")
    private long idPesquisador;
}
