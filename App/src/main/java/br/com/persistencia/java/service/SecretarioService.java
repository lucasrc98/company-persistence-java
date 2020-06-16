package br.com.persistencia.java.service;

import br.com.persistencia.java.dao.SecretarioDAO;
import br.com.persistencia.java.model.Secretario;
import br.com.persistencia.java.util.Util;

import javax.persistence.EntityManager;
import java.util.List;

public class SecretarioService implements SecretarioDAO {


    @Override
    public void save(Secretario secretario, long idDepartamento){

        DepartamentoService departamentoService = new DepartamentoService();
        Util.getEntityManager();

        try {
            beginTransaction();
            secretario.setDepartamento(departamentoService.findById(idDepartamento));
            Util.getEntityManager().persist(secretario);
            commit();
        }catch (Exception e){
            rollback();

            System.out.println("INSERT " + e.getMessage());
        }finally {

            close();
        }
    }

    @Override
    public void delete(Secretario secretario) {
        Util.getEntityManager();

        try {
            beginTransaction();
            Util.getEntityManager().remove(secretario);
            commit();
        }catch (Exception e){
            rollback();

            System.out.println("REMOVE: " + e.getMessage());
        }finally {

            close();
        }
    }

    @Override
    public void deleteById(long idSecretarioDelete){

        EntityManager em = Util.getEntityManager();
        Secretario secretarioDelete = null;

        try {
            secretarioDelete = em.find(Secretario.class, idSecretarioDelete);

            em.getTransaction().begin();
            em.remove(secretarioDelete);
            em.getTransaction().commit();
        }catch (Exception e){

            rollback();
            System.out.println("DELETE: " + e.getMessage());
        }finally {
            close();
        }
    }

    @Override
    public Secretario findById(long idSecretario){

        EntityManager em = Util.getEntityManager();
        Secretario secretario = null;

        try {

            secretario = em.find(Secretario.class, idSecretario);

        }catch (Exception e){

            rollback();
            System.out.println("FIND BY ID: " + e.getMessage());
        }finally {
            close();
        }
        System.out.println(secretario);
        return secretario;
    }

    @Override
    public List<Secretario> findAll(){
        EntityManager em = Util.getEntityManager();

        List <Secretario> secretarios = null;

        try {
            secretarios = em.createQuery("from Secretario ") .getResultList();

        }catch (Exception e){
            System.out.println("List ALL: " + e.getMessage());
        }finally {
            close();
        }

        if(secretarios != null){
            secretarios.forEach(System.out::println);
        }else
            System.out.println("Nenhum secretario encontrado");
        return secretarios;
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
