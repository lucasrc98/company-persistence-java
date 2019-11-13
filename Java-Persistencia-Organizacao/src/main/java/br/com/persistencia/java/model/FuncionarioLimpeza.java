package br.com.persistencia.java.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class FuncionarioLimpeza extends Funcionario {

    private String cargo;
    private String jornadaTrabalho;

    @OneToOne
    FuncionarioLimpeza funcionarioSuperior;



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

    public FuncionarioLimpeza getFuncionarioSuperior() {
        return funcionarioSuperior;
    }

    public void setFuncionarioSuperior(FuncionarioLimpeza funcionarioSuperior) {
        this.funcionarioSuperior = funcionarioSuperior;
    }

    @Override
    public String toString() {
        return "FuncionarioLimpeza{" +
                "cargo='" + cargo + '\'' +
                ", jornadaTrabalho='" + jornadaTrabalho + '\'' +
                ", funcionarioSuperior=" + funcionarioSuperior +
                '}';
    }
}
