package br.com.persistencia.java.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class HorasTrabalhadas {

    @Id
    private long idPesquisador;
    private long idProjeto;
}
