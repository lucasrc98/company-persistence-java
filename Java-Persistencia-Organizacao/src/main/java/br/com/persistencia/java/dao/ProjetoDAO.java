package br.com.persistencia.java.dao;

import br.com.persistencia.java.model.Projeto;

import java.util.List;

public interface ProjetoDAO {
    
    public void save(Projeto projeto);
    public void delete(Projeto projeto);
    public void deleteById(long id);
    public Projeto findById(long id);
    public List<Projeto> findAll();

    public void beginTransaction();
    public void commit();
    public void rollback();
    public void close();
}
