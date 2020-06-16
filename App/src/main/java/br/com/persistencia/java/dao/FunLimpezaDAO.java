package br.com.persistencia.java.dao;

import br.com.persistencia.java.model.FuncionarioLimpeza;

import java.util.List;

public interface FunLimpezaDAO {

    public void save(FuncionarioLimpeza funLimpeza, long idDepartamento, long idSuperior);
    public void delete(FuncionarioLimpeza funLimpeza);
    public void deleteById(long id);
    public FuncionarioLimpeza findById(long id);
    public List<FuncionarioLimpeza> findAll();

    public void beginTransaction();
    public void commit();
    public void rollback();
    public void close();
}
