package br.com.persistencia.java.service;

import br.com.persistencia.java.dao.FunLimpezaDAO;
import br.com.persistencia.java.model.FuncionarioLimpeza;
import br.com.persistencia.java.util.Util;

import javax.persistence.EntityManager;
import java.util.List;

public class FunLimpezaService implements FunLimpezaDAO {


    @Override
    public void save(FuncionarioLimpeza funcionario, long idDepartamento, long idSuperior){

        DepartamentoService departamentoService = new DepartamentoService();
        FunLimpezaService limpezaService = new FunLimpezaService();

        Util.getEntityManager();

        try {
            beginTransaction();
            funcionario.setDepartamento(departamentoService.findById(idDepartamento));
            funcionario.setFuncionarioSuperior(limpezaService.findById(idSuperior));
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
    public void delete(FuncionarioLimpeza funcionario) {
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

    @Override
    public void deleteById(long idFuncionarioLimpezaDelete){

        EntityManager em = Util.getEntityManager();
        FuncionarioLimpeza funcionarioDelete = null;

        try {
            funcionarioDelete = em.find(FuncionarioLimpeza.class, idFuncionarioLimpezaDelete);

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

    @Override
    public FuncionarioLimpeza findById(long idFuncionarioLimpeza){

        EntityManager em = Util.getEntityManager();
        FuncionarioLimpeza funcionario = null;

        try {

            funcionario = em.find(FuncionarioLimpeza.class, idFuncionarioLimpeza);

        }catch (Exception e){

            rollback();
            System.out.println("FIND BY ID: " + e.getMessage());
        }finally {
            close();
        }
        System.out.println(funcionario);
        return funcionario;
    }

    @Override
    public List<FuncionarioLimpeza> findAll(){
        EntityManager em = Util.getEntityManager();

        List <FuncionarioLimpeza> funcionarios = null;

        try {
            funcionarios = em.createQuery("from FuncionarioLimpeza ") .getResultList();

        }catch (Exception e){
            System.out.println("List ALL: " + e.getMessage());
        }finally {
            close();
        }

        if(funcionarios != null){
            funcionarios.forEach(System.out::println);
        }else
            System.out.println("Nenhum funcionario encontrado");
        return funcionarios;
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