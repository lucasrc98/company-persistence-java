package br.com.persistencia.java.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dependente {

    @Id
    private long idDependente;

    private  String nomeDependente;
    private String sexoDependente;
    private String aniversarioDependente;
    private String parentescoDependente;

    public long getIdDependente() {
        return idDependente;
    }

    public void setIdDependente(long idDependente) {
        this.idDependente = idDependente;
    }

    public String getNomeDependente() {
        return nomeDependente;
    }

    public void setNomeDependente(String nomeDependente) {
        this.nomeDependente = nomeDependente;
    }

    public String getSexoDependente() {
        return sexoDependente;
    }

    public void setSexoDependente(String sexoDependente) {
        this.sexoDependente = sexoDependente;
    }

    public String getAniversarioDependente() {
        return aniversarioDependente;
    }

    public void setAniversarioDependente(String aniversarioDependente) {
        this.aniversarioDependente = aniversarioDependente;
    }

    public String getParentescoDependente() {
        return parentescoDependente;
    }

    public void setParentescoDependente(String parentescoDependente) {
        this.parentescoDependente = parentescoDependente;
    }

    public Dependente() {
    }

    @Override
    public String toString() {
        return "Dependente{" +
                "idDependente=" + idDependente +
                ", nomeDependente='" + nomeDependente + '\'' +
                ", sexoDependente='" + sexoDependente + '\'' +
                ", aniversarioDependente='" + aniversarioDependente + '\'' +
                ", parentescoDependente='" + parentescoDependente + '\'' +
                '}';
    }
}
