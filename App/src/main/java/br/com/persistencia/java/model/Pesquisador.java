package br.com.persistencia.java.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import java.util.List;


@Entity
public class Pesquisador extends Funcionario {

    private String areaAtuacao;

    @OneToMany(mappedBy = "pesquisador", fetch = FetchType.LAZY)
    private List<Pesquisa> pesquisas;

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public List<Pesquisa> getPesquisas() {
        return pesquisas;
    }

    public void setPesquisas(List<Pesquisa> pesquisas) {
        this.pesquisas = pesquisas;
    }

    public Pesquisador() {
    }

    @Override
    public String toString() {
        return "Pesquisador{" +
                "areaAtuacao='" + areaAtuacao + '\'' +
                '}';
    }

}
