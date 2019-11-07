package br.com.persistencia.java.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HorasTrabalhadas {

//      @Id
//      @GeneratedValue(strategy = GenerationType.IDENTITY)
//      @Column(name = "pesquisador_pk")
      private long idPesquisador;
    
    
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
 	 @Column(name = "projeto_pk")
     private long idProjeto;
}
