package br.com.persistencia.java.service;

import br.com.persistencia.java.dao.HorasTrabalhadasDAO;
import br.com.persistencia.java.model.HorasTrabalhadas;
import br.com.persistencia.java.util.Util;

import javax.persistence.EntityManager;
import java.util.List;

public class HorasTrabalhadasService implements HorasTrabalhadasDAO {


    @Override
    public void save(HorasTrabalhadas horasTrab){
        Util.getEntityManager();
        try {
            beginTransaction();
            Util.getEntityManager().persist(horasTrab);
            commit();
        }catch (Exception e){
            rollback();
            System.out.println("INSERT " + e.getMessage());
        }finally {

            close();
        }
    }

    @Override
    public void delete(HorasTrabalhadas horasTrab) {
        Util.getEntityManager();
        try {
            beginTransaction();
            Util.getEntityManager().remove(horasTrab);
            commit();
        }catch (Exception e){
            rollback();
            System.out.println("REMOVE: " + e.getMessage());
        }finally {
            close();
        }
    }

    @Override
    public void deleteById(long idHorasTrabalhadasDelete){

        EntityManager em = Util.getEntityManager();
        HorasTrabalhadas horasTrabDelete = null;

        try {
            horasTrabDelete = em.find(HorasTrabalhadas.class, idHorasTrabalhadasDelete);

            em.getTransaction().begin();
            em.remove(horasTrabDelete);
            em.getTransaction().commit();
        }catch (Exception e){

            rollback();
            System.out.println("DELETE: " + e.getMessage());
        }finally {
            close();
        }
    }

    @Override
    public HorasTrabalhadas findById(long idHorasTrabalhadas){

        EntityManager em = Util.getEntityManager();
        HorasTrabalhadas horasTrab = null;

        try {

            horasTrab = em.find(HorasTrabalhadas.class, idHorasTrabalhadas);

        }catch (Exception e){

            rollback();
            System.out.println("FIND BY ID: " + e.getMessage());
        }finally {
            close();
        }
        System.out.println(horasTrab);
        return horasTrab;
    }

    @Override
    public List<HorasTrabalhadas> findAll(){
        EntityManager em = Util.getEntityManager();

        List <HorasTrabalhadas> horasTrabs = null;

        try {
            horasTrabs = em.createQuery("from HorasTrabalhadas ") .getResultList();

        }catch (Exception e){
            System.out.println("List ALL: " + e.getMessage());
        }finally {
            close();
        }

        if(horasTrabs != null){
            horasTrabs.forEach(System.out::println);
        }else
            System.out.println("Nenhum horasTrab encontrado");
        return horasTrabs;
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
