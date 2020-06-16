package br.com.persistencia.java.service;

import br.com.persistencia.java.dao.DependenteDAO;
import br.com.persistencia.java.model.Dependente;
import br.com.persistencia.java.util.Util;

import javax.persistence.EntityManager;
import java.util.List;

public class DependenteService implements DependenteDAO{


    @Override
    public void save(Dependente dependente, long idFuncionario){
    	FuncionarioService funcionarioService = new FuncionarioService();
    	dependente.setFuncionario(funcionarioService.findById(idFuncionario));
        Util.getEntityManager();
        try {
            beginTransaction();
            Util.getEntityManager().persist(dependente);
            commit();
        }catch (Exception e){
            rollback();
            System.out.println("INSERT " + e.getMessage());
        }finally {

            close();
        }
    }

    @Override
    public void delete(Dependente dependente) {
        Util.getEntityManager();
        try {
            beginTransaction();
            Util.getEntityManager().remove(dependente);
            commit();
        }catch (Exception e){
            rollback();
            System.out.println("REMOVE: " + e.getMessage());
        }finally {
            close();
        }
    }

    @Override
    public void deleteById(long idDependenteDelete){

        EntityManager em = Util.getEntityManager();
        Dependente dependenteDelete = null;

        try {
            dependenteDelete = em.find(Dependente.class, idDependenteDelete);

            em.getTransaction().begin();
            em.remove(dependenteDelete);
            em.getTransaction().commit();
        }catch (Exception e){

            rollback();
            System.out.println("DELETE: " + e.getMessage());
        }finally {
            close();
        }
    }

    @Override
    public Dependente findById(long idDependente){

        EntityManager em = Util.getEntityManager();
        Dependente dependente = null;

        try {

            dependente = em.find(Dependente.class, idDependente);

        }catch (Exception e){

            rollback();
            System.out.println("FIND BY ID: " + e.getMessage());
        }finally {
            close();
        }
        System.out.println(dependente);
        return dependente;
    }

    @Override
    public List<Dependente> findAll(){
        EntityManager em = Util.getEntityManager();

        List <Dependente> dependentes = null;

            try {
                dependentes = em.createQuery("from Dependente ") .getResultList();

            }catch (Exception e){
                System.out.println("List ALL: " + e.getMessage());
            }finally {
                close();
            }

            if(dependentes != null){
                dependentes.forEach(System.out::println);
            }else
                System.out.println("Nenhum dependente encontrado");
        return dependentes;
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
