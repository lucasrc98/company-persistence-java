package br.com.persistencia.java.service;

import br.com.persistencia.java.dao.PesquisaDAO;
import br.com.persistencia.java.dao.PesquisadorDAO;
import br.com.persistencia.java.model.Pesquisador;
import br.com.persistencia.java.util.Util;

import javax.persistence.EntityManager;
import java.util.List;

public class PesquisadorService implements PesquisadorDAO {
    @Override
    public void save(Pesquisador pesquisador, long idDepartamento){

        DepartamentoService departamentoService = new DepartamentoService();
        Util.getEntityManager();

        try {
            beginTransaction();
            pesquisador.setDepartamento(departamentoService.findById(idDepartamento));
            Util.getEntityManager().persist(pesquisador);
            commit();
        }catch (Exception e){
            rollback();

            System.out.println("INSERT " + e.getMessage());
        }finally {

            close();
        }
    }

    @Override
    public void delete(Pesquisador pesquisador) {
        Util.getEntityManager();

        try {
            beginTransaction();
            Util.getEntityManager().remove(pesquisador);
            commit();
        }catch (Exception e){
            rollback();

            System.out.println("REMOVE: " + e.getMessage());
        }finally {

            close();
        }
    }

    @Override
    public void deleteById(long idPesquisadorDelete){

        EntityManager em = Util.getEntityManager();
        Pesquisador pesquisadorDelete = null;

        try {
            pesquisadorDelete = em.find(Pesquisador.class, idPesquisadorDelete);

            em.getTransaction().begin();
            em.remove(pesquisadorDelete);
            em.getTransaction().commit();
        }catch (Exception e){

            rollback();
            System.out.println("DELETE: " + e.getMessage());
        }finally {
            close();
        }
    }

    @Override
    public Pesquisador findById(long idPesquisador){

        EntityManager em = Util.getEntityManager();
        Pesquisador pesquisador = null;

        try {

            pesquisador = em.find(Pesquisador.class, idPesquisador);

        }catch (Exception e){

            rollback();
            System.out.println("FIND BY ID: " + e.getMessage());
        }finally {
            close();
        }
        System.out.println(pesquisador);
        return pesquisador;
    }

    @Override
    public List<Pesquisador> findAll(){
        EntityManager em = Util.getEntityManager();

        List <Pesquisador> pesquisadors = null;

        try {
            pesquisadors = em.createQuery("from Pesquisador ") .getResultList();

        }catch (Exception e){
            System.out.println("List ALL: " + e.getMessage());
        }finally {
            close();
        }

        if(pesquisadors != null){
            pesquisadors.forEach(System.out::println);
        }else
            System.out.println("Nenhum pesquisador encontrado");
        return pesquisadors;
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
