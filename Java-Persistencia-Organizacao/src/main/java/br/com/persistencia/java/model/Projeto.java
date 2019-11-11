package br.com.persistencia.java.model;



import javax.persistence.*;
import java.util.List;


@Entity
public class Projeto { 

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idProjeto;	

    private String nomeProjeto;
    private float tempoDesenvolvimento;
    
    @ManyToOne
    @JoinColumn(name = "idDepartamento")
    private Departamento departamento;

    @OneToMany(mappedBy = "projeto")
    private  List<Pesquisa> pesquisas;
    
   
    public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public long getIdProjeto() {
        return idProjeto;
    }

    public void setIdProjeto(long idProjeto) {
        this.idProjeto = idProjeto;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public float getTempoDesenvolvimento() {
        return tempoDesenvolvimento;
    }

    public void setTempoDesenvolvimento(float tempoDesenvolvimento) {
        this.tempoDesenvolvimento = tempoDesenvolvimento;
    }

    public List<Pesquisa> getPesquisas() {
        return pesquisas;
    }

    public void setPesquisas(List<Pesquisa> pesquisas) {
        this.pesquisas = pesquisas;
    }

    public Projeto() {
    }

    @Override
    public String toString() {
        return "Projeto{" +
                "idProjeto=" + idProjeto +
                ", nomeProjeto='" + nomeProjeto + '\'' +
                ", tempoDesenvolvimento=" + tempoDesenvolvimento +
                '}';
    }

}
