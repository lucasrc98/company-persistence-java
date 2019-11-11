package br.com.persistencia.java.model;

import br.com.persistencia.java.util.HorasTrabId;

import javax.persistence.*;

@Entity
public class HorasTrabalhadas {

	@Id
	@EmbeddedId
	private HorasTrabId idHorasTrabalhadas;


	


    private double qtdHoras;





}
