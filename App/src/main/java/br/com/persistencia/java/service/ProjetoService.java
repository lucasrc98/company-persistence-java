package br.com.persistencia.java.service;

import br.com.persistencia.java.dao.ProjetoDAO;
import br.com.persistencia.java.model.Projeto;
import br.com.persistencia.java.util.Util;

import javax.persistence.EntityManager;
import java.util.List;

public class ProjetoService implements ProjetoDAO {


    @Override
    public void save(Projeto projeto, long idDepartamento){
        Util.getEntityManager();
        DepartamentoService departamentoService = new DepartamentoService();
        projeto.setDepartamento(departamentoService.findById(idDepartamento));
        try {
            beginTransaction();
            Util.getEntityManager().persist(projeto);
            commit();
        }catch (Exception e){
            rollback();
            System.out.println("INSERT " + e.getMessage());
        }finally {

            close();
        }
    }

    @Override
    public void delete(Projeto projeto) {
        Util.getEntityManager();
        try {
            beginTransaction();
            Util.getEntityManager().remove(projeto);
            commit();
        }catch (Exception e){
            rollback();
            System.out.println("REMOVE: " + e.getMessage());
        }finally {
            close();
        }
    }

    @Override
    public void deleteById(long idProjetoDelete){

        EntityManager em = Util.getEntityManager();
        Projeto projetoDelete = null;

        try {
            projetoDelete = em.find(Projeto.class, idProjetoDelete);

            em.getTransaction().begin();
            em.remove(projetoDelete);
            em.getTransaction().commit();
        }catch (Exception e){

            rollback();
            System.out.println("DELETE: " + e.getMessage());
        }finally {
            close();
        }
    }

    @Override
    public Projeto findById(long idProjeto){

        EntityManager em = Util.getEntityManager();
        Projeto projeto = null;

        try {

            projeto = em.find(Projeto.class, idProjeto);

        }catch (Exception e){

            rollback();
            System.out.println("FIND BY ID: " + e.getMessage());
        }finally {
            close();
        }
        System.out.println(projeto);
        return projeto;
    }

    @Override
    public List<Projeto> findAll(){
        EntityManager em = Util.getEntityManager();

        List <Projeto> projetos = null;

        try {
            projetos = em.createQuery("from Projeto ") .getResultList();

        }catch (Exception e){
            System.out.println("List ALL: " + e.getMessage());
        }finally {
            close();
        }

        if(projetos != null){
            projetos.forEach(System.out::println);
        }else
            System.out.println("Nenhum projeto encontrado");
        return projetos;
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
