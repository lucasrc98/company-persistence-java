package br.com.persistencia.java.dao;

import br.com.persistencia.java.model.Dependente;

import java.util.List;

public interface DependenteDAO {

    public void save(Dependente dependente);
    public void delete(Dependente dependente);
    public void deleteById(long id);
    public Dependente findById(long id);
    public List<Dependente> findAll();

    public void beginTransaction();
    public void commit();
    public void rollback();
    public void close();
}
