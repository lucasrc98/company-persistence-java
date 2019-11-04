package br.com.persistencia.java.model;

import javax.persistence.Entity;

@Entity
public class FuncionarioLimpeza extends Funcionario {

    private long idResponsavel;
    private String cargo;
    private String jornadaTrabalho;

    public long getIdResponsavel() {
        return idResponsavel;
    }

    public void setIdResponsavel(long idResponsavel) {
        this.idResponsavel = idResponsavel;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getJornadaTrabalho() {
        return jornadaTrabalho;
    }

    public void setJornadaTrabalho(String jornadaTrabalho) {
        this.jornadaTrabalho = jornadaTrabalho;
    }

    public FuncionarioLimpeza() {
    }

    @Override
    public String toString() {
        return "FuncionarioLimpeza{" +
                "idResponsavel=" + idResponsavel +
                ", cargo='" + cargo + '\'' +
                ", jornadaTrabalho='" + jornadaTrabalho + '\'' +
                '}';
    }
}
