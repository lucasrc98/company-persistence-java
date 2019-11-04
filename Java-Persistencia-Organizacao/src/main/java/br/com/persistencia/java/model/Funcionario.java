package br.com.persistencia.java.model;

import javax.persistence.*;

@Entity
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFuncionario;

    private String nomeFuncionario;
    private String enderecoFuncionario;
    private String sexoFuncionario;
    private String dataAniversario;
    private double salarioFuncionario;

    public long getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(long idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getEnderecoFuncionario() {
        return enderecoFuncionario;
    }

    public void setEnderecoFuncionario(String enderecoFuncionario) {
        this.enderecoFuncionario = enderecoFuncionario;
    }

    public String getSexoFuncionario() {
        return sexoFuncionario;
    }

    public void setSexoFuncionario(String sexoFuncionario) {
        this.sexoFuncionario = sexoFuncionario;
    }

    public String getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(String dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    public double getSalarioFuncionario() {
        return salarioFuncionario;
    }

    public void setSalarioFuncionario(double salarioFuncionario) {
        this.salarioFuncionario = salarioFuncionario;
    }

    public Funcionario() {
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "idFuncionario=" + idFuncionario +
                ", nomeFuncionario='" + nomeFuncionario + '\'' +
                ", enderecoFuncionario='" + enderecoFuncionario + '\'' +
                ", sexoFuncionario='" + sexoFuncionario + '\'' +
                ", dataAniversario='" + dataAniversario + '\'' +
                ", salarioFuncionario=" + salarioFuncionario +
                '}';
    }
}
