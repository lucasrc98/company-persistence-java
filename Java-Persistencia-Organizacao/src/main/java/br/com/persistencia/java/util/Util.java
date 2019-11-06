package br.com.persistencia.java.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Util {

    private static final EntityManagerFactory emFac = Persistence.
            createEntityManagerFactory("companhia");

    private static ThreadLocal<EntityManager> emT =
            new ThreadLocal<EntityManager>();


    public static EntityManager getEntityManager() {
        EntityManager em = emT.get();
        if(em == null) {
            em = emFac.createEntityManager();
            emT.set(em);
        }
        return em;
    }

    public static void closeEntityManager() {
        EntityManager em = emT.get();
        if(em != null) {
            EntityTransaction tx = em.getTransaction();
            if(tx.isActive()) {
                tx.commit();
            }
            em.close();
            emT.set(null);
        }
    }

    public static void beginTransaction() {
        getEntityManager().getTransaction().begin();
    }

    public static void commit() {
        EntityTransaction tx = getEntityManager().getTransaction();
        if(tx.isActive()) tx.commit();
    }

    public static void rollback() {
        EntityTransaction tx = getEntityManager().getTransaction();
        if(tx.isActive()) tx.rollback();
    }
}
