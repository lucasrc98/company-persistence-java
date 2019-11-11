package br.com.persistencia.java.service;

import br.com.persistencia.java.dao.PesquisaDAO;
import br.com.persistencia.java.model.Pesquisa;
import br.com.persistencia.java.model.Pesquisador;
import br.com.persistencia.java.util.Util;

import javax.persistence.EntityManager;
import java.util.List;

public class PesquisaService implements PesquisaDAO {

    @Override
    public void save(Pesquisa pesquisa, long idProjeto, long idPesquisador){

        ProjetoService projeto = new ProjetoService();
        FuncionarioService pesquisador = new FuncionarioService();

        Util.getEntityManager();

        try {
            beginTransaction();

            pesquisa.setProjeto(projeto.findById(idProjeto));
            pesquisa.setPesquisador((Pesquisador) pesquisador.findById(idPesquisador));

            Util.getEntityManager().persist(pesquisa);
            commit();
        }catch (Exception e){
            rollback();

            System.out.println("INSERT " + e.getMessage());
        }finally {

            close();
        }
    }

    @Override
    public void delete(Pesquisa pesquisa) {
        Util.getEntityManager();

        try {
            beginTransaction();
            Util.getEntityManager().remove(pesquisa);
            commit();
        }catch (Exception e){
            rollback();

            System.out.println("REMOVE: " + e.getMessage());
        }finally {

            close();
        }
    }

    @Override
    public void deleteById(long idPesquisaDelete){

        EntityManager em = Util.getEntityManager();
        Pesquisa pesquisaDelete = null;

        try {
            pesquisaDelete = em.find(Pesquisa.class, idPesquisaDelete);

            em.getTransaction().begin();
            em.remove(pesquisaDelete);
            em.getTransaction().commit();
        }catch (Exception e){

            rollback();
            System.out.println("DELETE: " + e.getMessage());
        }finally {
            close();
        }
    }

    @Override
    public Pesquisa findById(long idPesquisa){

        EntityManager em = Util.getEntityManager();
        Pesquisa pesquisa = null;

        try {

            pesquisa = em.find(Pesquisa.class, idPesquisa);

        }catch (Exception e){

            rollback();
            System.out.println("FIND BY ID: " + e.getMessage());
        }finally {
            close();
        }
        System.out.println(pesquisa);
        return pesquisa;
    }

    @Override
    public List<Pesquisa> findAll(){
        EntityManager em = Util.getEntityManager();

        List <Pesquisa> pesquisas = null;

        try {
            pesquisas = em.createQuery("from Pesquisa ") .getResultList();

        }catch (Exception e){
            System.out.println("List ALL: " + e.getMessage());
        }finally {
            close();
        }

        if(pesquisas != null){
            pesquisas.forEach(System.out::println);
        }else
            System.out.println("Nenhum pesquisa encontrado");
        return pesquisas;
    }



    @Override
    public void beginTransaction() {
        Util.beginTransaction();
    }

    @Override
    public void commit() {
        Util.commit();
    }

    @Override
    public void rollback() {
        Util.rollback();
    }

    @Override
    public void close() {
        Util.closeEntityManager();
    }
}
