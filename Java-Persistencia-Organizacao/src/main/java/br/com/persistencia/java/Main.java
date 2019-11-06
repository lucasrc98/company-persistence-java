package br.com.persistencia.java;

import br.com.persistencia.java.model.Funcionario;
import br.com.persistencia.java.model.FuncionarioLimpeza;
import br.com.persistencia.java.model.Pesquisador;

import br.com.persistencia.java.daoImplements.FuncionarioDaoImpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class Main {

//    Classe do JPA que permite a conexão com o Banco
    private static EntityManagerFactory entityManagerFactory;

    public static void main (String args[]){

        FuncionarioDaoImpl daoImpl = new FuncionarioDaoImpl();







        Funcionario funcionario1 = new FuncionarioLimpeza();

        funcionario1.setDataAniversario("10/10/2000");
        funcionario1.setEnderecoFuncionario("Basilio Pinto");
        funcionario1.setNomeFuncionario("Juvenal");
        funcionario1.setSalarioFuncionario(20000);

        daoImpl.save(funcionario1);





















/*  Instanciando EntityManeger passando com parametro o nome do database */
//        entityManagerFactory = Persistence.createEntityManagerFactory("companhia");


//        Lembrete lembrete1 = new Lembrete();
//        lembrete1.setTitulo("Escrever artigo");
//        lembrete1.setDescricao("Hoje, 12:00");
//
//        Lembrete lembrete2 = new Lembrete();
//        lembrete2.setTitulo("Enviar trab persistencia");
//        lembrete2.setDescricao("Terça, 15:00");
//
//        Lembrete lembrete3 = new Lembrete();
//        lembrete3.setTitulo("Fazer matriz origem destino");
//        lembrete3.setDescricao("Quarta, 21:00");
//
////        Inserindo
//        criarLembrete(lembrete3);
//
//
////        Listando
//
//        listarLembretes();

    }

//    public static void criarLembrete(Lembrete lembreteLocal){
//        EntityManager em = entityManagerFactory.createEntityManager();
//
//        try {
//            em.getTransaction().begin();
//            em.persist(lembreteLocal);
//            em.getTransaction().commit();
//        }catch (Exception e){
//            em.getTransaction().rollback();
//
//            System.out.println("INSERT " + e.getMessage());
//        }finally {
//
//            em.close();
//        }
//    }
//
//    public static void listarLembretes(){
//        List <Lembrete> lembretes = null;
//
//        EntityManager em = entityManagerFactory.createEntityManager();
//
//        try {
//            lembretes = em.createQuery("from Lembrete ") .getResultList();
//
//        }catch (Exception e){
//            System.out.println("List ALL: " + e.getMessage());
//        }finally {
//            em.close();
//        }
//
//        if(lembretes != null){
//            lembretes.forEach(System.out::println);
//        }
//    }

}
