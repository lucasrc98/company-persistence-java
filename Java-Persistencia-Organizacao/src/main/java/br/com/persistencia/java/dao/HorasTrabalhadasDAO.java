package br.com.persistencia.java.dao;

import br.com.persistencia.java.model.HorasTrabalhadas;

import java.util.List;

public interface HorasTrabalhadasDAO {
    
    public void save(long idPesquisador, long idProjeto, HorasTrabalhadas horasTrab);
    public void delete(HorasTrabalhadas horasTrab);
    public void deleteById(long id);
    public HorasTrabalhadas findById(long id);
    public List<HorasTrabalhadas> findAll();

    public void beginTransaction();
    public void commit();
    public void rollback();
    public void close();
}
