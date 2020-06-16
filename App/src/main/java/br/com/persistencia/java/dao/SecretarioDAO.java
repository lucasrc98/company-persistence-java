package br.com.persistencia.java.dao;

import br.com.persistencia.java.model.Secretario;

import java.util.List;

public interface SecretarioDAO {

    public void save(Secretario secretario, long idDepartamento);
    public void delete(Secretario secretario);
    public void deleteById(long id);
    public Secretario findById(long id);
    public List<Secretario> findAll();

    public void beginTransaction();
    public void commit();
    public void rollback();
    public void close();
}
