package br.com.persistencia.java.service;

import br.com.persistencia.java.dao.FuncionarioDAO;
import br.com.persistencia.java.model.Funcionario;
import br.com.persistencia.java.util.Util;

import javax.persistence.EntityManager;
import java.util.List;

public class FuncionarioService implements FuncionarioDAO{



    public void save(Funcionario funcionario){
//        entityManagerFactory = Persistence.createEntityManagerFactory("hibernatejpa");
//        EntityManager em = entityManagerFactory.createEntityManager();

        Util.getEntityManager();

        try {
            beginTransaction();
            Util.getEntityManager().persist(funcionario);
            commit();
        }catch (Exception e){
            rollback();

            System.out.println("INSERT " + e.getMessage());
        }finally {

            close();
        }
    }

    @Override
    public void delete(Funcionario funcionario) {
        Util.getEntityManager();

        try {
            beginTransaction();
            Util.getEntityManager().remove(funcionario);
            commit();
        }catch (Exception e){
            rollback();

            System.out.println("REMOVE: " + e.getMessage());
        }finally {

            close();
        }
    }


    public void deleteById(long idFuncionarioDelete){

        EntityManager em = Util.getEntityManager();
        Funcionario funcionarioDelete = null;

        try {
            funcionarioDelete = em.find(Funcionario.class, idFuncionarioDelete);

            em.getTransaction().begin();
            em.remove(funcionarioDelete);
            em.getTransaction().commit();
        }catch (Exception e){

            rollback();
            System.out.println("DELETE: " + e.getMessage());
        }finally {
            close();
        }
    }
    public Funcionario findById(long idFuncionario){

        EntityManager em = Util.getEntityManager();
        Funcionario funcionario = null;

        try {

            funcionario = em.find(Funcionario.class, idFuncionario);

        }catch (Exception e){

            rollback();
            System.out.println("FIND BY ID: " + e.getMessage());
        }finally {
            close();
        }
        System.out.println(funcionario);
        return funcionario;
    }
    public List<Funcionario> findAll(){

        return null;
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
