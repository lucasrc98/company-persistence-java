package br.com.persistencia.java.daoImplements;

import br.com.persistencia.java.dao.FuncionarioDAO;
import br.com.persistencia.java.model.Funcionario;
import br.com.persistencia.java.util.Util;

import java.util.List;

public class FuncionarioDaoImpl implements FuncionarioDAO {



    public void save(Funcionario funcionario){
//        entityManagerFactory = Persistence.createEntityManagerFactory("hibernatejpa");
//
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
    public void delete(Funcionario funcionario){

    }
    public void deleteById(long id){

    }
    public Funcionario find(long id){

        return null;
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
