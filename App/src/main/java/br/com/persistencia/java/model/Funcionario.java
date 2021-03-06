package br.com.persistencia.java.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.ForeignKey;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idFuncionario;

    private String nomeFuncionario;
    private String enderecoFuncionario;
    private String sexoFuncionario;
    private String dataAniversario;
    private double salarioFuncionario;
    
    @OneToMany(mappedBy="funcionario", orphanRemoval = true, fetch = FetchType.LAZY)
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private List<Dependente> dependente = new ArrayList<Dependente>();
    
    @ManyToOne
//	@JoinColumn(name="departamento_id", referencedColumnName = "idDepartamento", nullable = false)
    private Departamento departamento;

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
    
    public List<Dependente> getDependente() {
		return dependente;
	}

	public void setDependente(List<Dependente> dependente) {
		this.dependente = dependente;
	}
	
	

    public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
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
