package br.com.persistencia.java.dao;

import br.com.persistencia.java.model.Funcionario;

import java.util.List;

public interface FuncionarioDAO {

    public void save(Funcionario funcionario);
    public void delete(Funcionario funcionario);
    public void deleteById(long id);
    public Funcionario findById(long id);
    public List<Funcionario> findAll();

    public void beginTransaction();
    public void commit();
    public void rollback();
    public void close();
}
