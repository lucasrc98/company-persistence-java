package br.com.persistencia.java.model;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Embeddable
public class Pesquisador extends Funcionario {

    private String areaAtuacao;
    
//  @OneToOne(cascade = CascadeType.ALL)
//  @JoinColumn(name = "horasTrabalhadas_fk_pedquisador")
//  private HorasTrabalhadas horasTrabalhadas;

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
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
