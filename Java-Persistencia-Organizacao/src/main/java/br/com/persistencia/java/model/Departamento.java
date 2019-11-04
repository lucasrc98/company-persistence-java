package br.com.persistencia.java.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Departamento {
    @Id
    private long idDepartamento;

    private String nomeDepartamento;
    private int numeroDepartamento;

    public long getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(long idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getNomeDepartamento() {
        return nomeDepartamento;
    }

    public void setNomeDepartamento(String nomeDepartamento) {
        this.nomeDepartamento = nomeDepartamento;
    }

    public int getNumeroDepartamento() {
        return numeroDepartamento;
    }

    public void setNumeroDepartamento(int numeroDepartamento) {
        this.numeroDepartamento = numeroDepartamento;
    }

    public Departamento() {
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "idDepartamento=" + idDepartamento +
                ", nomeDepartamento='" + nomeDepartamento + '\'' +
                ", numeroDepartamento=" + numeroDepartamento +
                '}';
    }
}
