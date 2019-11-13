package br.com.persistencia.java.dao;

import br.com.persistencia.java.model.Pesquisador;

import java.util.List;

public interface PesquisadorDAO {

    public void save(Pesquisador pesquisador, long idDepartamento);
    public void delete(Pesquisador pesquisador);
    public void deleteById(long id);
    public Pesquisador findById(long id);
    public List<Pesquisador> findAll();

    public void beginTransaction();
    public void commit();
    public void rollback();
    public void close();
}
