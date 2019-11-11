package br.com.persistencia.java.dao;

import br.com.persistencia.java.model.Pesquisa;

import java.util.List;

public interface PesquisaDAO {

    public void save(Pesquisa pesquisa, long idProjeto, long idPesquisador);
    public void delete(Pesquisa pesquisa);
    public void deleteById(long id);
    public Pesquisa findById(long id);
    public List<Pesquisa> findAll();

    public void beginTransaction();
    public void commit();
    public void rollback();
    public void close();
}
