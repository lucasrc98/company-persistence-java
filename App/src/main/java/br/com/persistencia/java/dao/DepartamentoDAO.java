package br.com.persistencia.java.dao;


import br.com.persistencia.java.model.Departamento;

import java.util.List;

public interface DepartamentoDAO {

    public void save(Departamento departamento);
    public void delete(Departamento departamento);
    public void deleteById(long id);
    public Departamento findById(long id);
    public List<Departamento> findAll();

    public void beginTransaction();
    public void commit();
    public void rollback();
    public void close();
}
