package br.com.persistencia.java.service;

import br.com.persistencia.java.dao.DepartamentoDAO;
import br.com.persistencia.java.model.Departamento;
import br.com.persistencia.java.util.Util;

import javax.persistence.EntityManager;
import java.util.List;

public class DepartamentoService implements DepartamentoDAO {


    @Override
    public void save(Departamento departamento) {
        Util.getEntityManager();
        try {
            beginTransaction();
            Util.getEntityManager().persist(departamento);
            commit();
        }catch (Exception e){
            rollback();
            System.out.println("INSERT: " + e.getMessage());
        }finally {
            close();
        }
    }

    @Override
    public void delete(Departamento departamento) {
        Util.getEntityManager();

        try {
            beginTransaction();
            Util.getEntityManager().remove(departamento);
            commit();
        }catch (Exception e){
            rollback();
            System.out.println("REMOVE: " + e.getMessage());
        }finally {
            close();
        }
    }

    public void deleteById(long idDepartamento){

        EntityManager em = Util.getEntityManager();
        Departamento departamentoDelete = null;

        try {
            departamentoDelete = em.find(Departamento.class, idDepartamento);

            em.getTransaction().begin();
            em.remove(departamentoDelete);
            em.getTransaction().commit();
        }catch (Exception e){

            rollback();
            System.out.println("DELETE: " + e.getMessage());
        }finally {
            close();
        }
    }

    public Departamento findById(long idDepartamento){

        EntityManager em = Util.getEntityManager();
        Departamento departamento = null;
        try {
            departamento = em.find(Departamento.class, idDepartamento);
        }catch (Exception e){

            rollback();
            System.out.println("FIND BY ID: " + e.getMessage());
        }finally {
            close();
        }
        System.out.println(departamento);
        return departamento;
    }

    public List<Departamento> findAll(){
        EntityManager em = Util.getEntityManager();
        List <Departamento> departamentos = null;

            try {
                departamentos = em.createQuery("from Departamento ") .getResultList();

            }catch (Exception e){
                System.out.println("List ALL: " + e.getMessage());
            }finally {
                close();
            }

            if(departamentos != null){
                departamentos.forEach(System.out::println);
            }else
                System.out.println("Nenhum funcionario encontrado");
        return departamentos;
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
