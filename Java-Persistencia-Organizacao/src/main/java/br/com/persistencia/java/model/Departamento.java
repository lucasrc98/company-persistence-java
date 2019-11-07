package br.com.persistencia.java.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;

@Entity
public class Departamento {
    

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long idDepartamento;

    private String nomeDepartamento;
    private int numeroDepartamento;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "projeto_fk")
    private Projeto projeto;
    
    
    public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

	  
     @OneToMany(mappedBy="departamento", orphanRemoval = true)
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

	@Override
    public String toString() {
        return "Departamento{" +
                "idDepartamento=" + idDepartamento +
                ", nomeDepartamento='" + nomeDepartamento + '\'' +
                ", numeroDepartamento=" + numeroDepartamento +
                '}';
    }
}
