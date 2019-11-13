package br.com.persistencia.java.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ForeignKey;


@Entity
public class Dependente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDependente;

    private String nomeDependente;
    private String sexoDependente;
    private String aniversarioDependente;
    private String parentescoDependente;

    @ManyToOne
    @JoinColumn(name = "idFuncionario")
    private Funcionario funcionario;

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
    
    public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
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
