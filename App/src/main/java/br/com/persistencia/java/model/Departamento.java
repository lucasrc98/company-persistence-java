package br.com.persistencia.java.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.Cascade;

@Entity
public class Departamento {
    

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long idDepartamento;

    private String nomeDepartamento;
    private int numeroDepartamento;
    
    @OneToMany(mappedBy="departamento", orphanRemoval = true, fetch = FetchType.LAZY)
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private List<Projeto> projeto = new ArrayList<Projeto>();
	
	
	  
     @OneToMany(mappedBy="departamento", orphanRemoval = true, fetch = FetchType.LAZY)
     @Cascade(org.hibernate.annotations.CascadeType.ALL)
     private List<Funcionario> funcionario = new ArrayList<Funcionario>();

    
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

	public List<Funcionario> getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(List<Funcionario> funcionario) {
		this.funcionario = funcionario;
	}

    public List<Projeto> getProjeto() {
        return projeto;
    }

    public void setProjeto(List<Projeto> projeto) {
        this.projeto = projeto;
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
