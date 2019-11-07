package br.com.persistencia.java;

import br.com.persistencia.java.model.FuncionarioLimpeza;
import br.com.persistencia.java.model.Funcionario;
import br.com.persistencia.java.model.Pesquisador;
import br.com.persistencia.java.service.FuncionarioService;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.List;

public class Main {

    //    Classe do JPA que permite a conexão com o Banco
    private static EntityManagerFactory entityManagerFactory;

    public static void main(String args[]) {

        FuncionarioService funService = new FuncionarioService();

        FuncionarioLimpeza funcionario1 = new FuncionarioLimpeza();
        FuncionarioLimpeza funcionario2 = new FuncionarioLimpeza();
        Pesquisador funcionario3 = new Pesquisador();
        Pesquisador funcionario4 = new Pesquisador();

        funcionario1.setNomeFuncionario("Abel");
        funcionario1.setEnderecoFuncionario("Basilio Pinto");
        funcionario1.setSexoFuncionario("Masculino");
        funcionario1.setDataAniversario("01/01/1995");
        funcionario1.setSalarioFuncionario(20000);
        funcionario1.setIdResponsavel(0);
        funcionario1.setCargo("Chefe Da Limpeza");
        funcionario1.setJornadaTrabalho("30h");


        funcionario2.setNomeFuncionario("Juvenal");
        funcionario2.setEnderecoFuncionario("Basilio Pinto");
        funcionario2.setSexoFuncionario("Masculino");
        funcionario2.setDataAniversario("10/10/2000");
        funcionario2.setSalarioFuncionario(1900);
        funcionario2.setIdResponsavel(1);
        funcionario2.setCargo("Secretario de Limpeza");
        funcionario2.setJornadaTrabalho("40h");

        funcionario3.setNomeFuncionario("Adriana");
        funcionario3.setEnderecoFuncionario("Basilio Pinto");
        funcionario3.setSexoFuncionario("Feminino");
        funcionario3.setDataAniversario("10/10/2000");
        funcionario3.setSalarioFuncionario(1900);
        funcionario3.setAreaAtuacao("Pesquisa Quantica");

        funcionario4.setNomeFuncionario("Liva");
        funcionario4.setEnderecoFuncionario("Basilio Pinto");
        funcionario4.setSexoFuncionario("Feminino");
        funcionario4.setDataAniversario("10/10/2000");
        funcionario4.setSalarioFuncionario(3000);
        funcionario4.setAreaAtuacao("Banco de Dados");


//      funService.save(funcionario1);
//      funService.save(funcionario2);
//      funService.save(funcionario3);
//      funService.save(funcionario4);

//      funService.deleteById();
        funService.findAll();

    }

}












////    Classe do JPA que permite a conexão com o Banco
//        private static EntityManagerFactory entityManagerFactory;
//
//        public static void main (String args[]){
//
//            /*  Instanciando EntityManeger passando com parametro o nome do database */
//            entityManagerFactory = Persistence.createEntityManagerFactory("hibernatejpa");
//
//
//            Lembrete lembrete1 = new Lembrete();
//            lembrete1.setTitulo("Escrever artigo");
//            lembrete1.setDescricao("Hoje, 12:00");
//
//            Lembrete lembrete2 = new Lembrete();
//            lembrete2.setTitulo("Enviar trab persistencia");
//            lembrete2.setDescricao("Terça, 15:00");
//
//            Lembrete lembrete3 = new Lembrete();
//            lembrete3.setTitulo("Fazer matriz origem destino");
//            lembrete3.setDescricao("Quarta, 21:00");
//
////  Inserindo
////      criarLembrete(Lembrete lembrete);
//
////  Listando
////      listarLembretes();
//
////  Buscando por id de Lembrete
////      buscarLembrete(1L);
//
////  Buscando Lembretes por determinado texto no titulo
////      buscarLembretePorTitulo("entregar");
//
////  Atualizando Lembrete por Id
////      atualizarPorId(2);
//
////  Deletar Lembrete por Id
////      deleteLembrete(1);
//        }
//
//        public static void deleteLembrete(long idLembreteDelete){
//
//            EntityManager em = entityManagerFactory.createEntityManager();
//            Lembrete lembreteDelete = null;
//
//            try {
//                lembreteDelete = em.find(Lembrete.class, idLembreteDelete);
//
//                em.getTransaction().begin();
//                em.remove(lembreteDelete);
//                em.getTransaction().commit();
//            }catch (Exception e){
//
//                em.getTransaction().rollback();
//                System.out.println("DELETE: " + e.getMessage());
//            }finally {
//                em.close();
//            }
//        }
//
//        public static void atualizarPorId(long idLembreteAtualizar){
//
//            EntityManager em = entityManagerFactory.createEntityManager();
//            Lembrete lembreteAtualizar = null;
//
//            try {
//                lembreteAtualizar = em.find(Lembrete.class, idLembreteAtualizar);
//
//                lembreteAtualizar.setTitulo("Título alterado");
//                lembreteAtualizar.setDescricao("Descrição alterada");
//
//                em.getTransaction().begin();
//                em.merge(lembreteAtualizar);
//                em.getTransaction().commit();
//            }catch (Exception e){
//                em.getTransaction().rollback();
//                System.out.println("UPDATE: " + e.getMessage());
//            }finally {
//                em.close();
//            }
//        }
//
//        public static void buscarLembretePorTitulo(String contexto){
//
//            EntityManager em = entityManagerFactory.createEntityManager();
//            List<Lembrete> lembretesEncontrados = null;
//
//            try{
//
//                lembretesEncontrados = em.createQuery("from Lembrete l where l.titulo like '%"+contexto+"%'").getResultList();
//
//            }catch (Exception e){
//                System.out.println("FIND BY TITULO " + e.getMessage());
//            }finally {
//                em.close();
//            }
//
//            if (!lembretesEncontrados.isEmpty()){
//                lembretesEncontrados.forEach(System.out::println);
//            }else
//                System.out.println("Nenhum lembrete encontrado");
//        }
//
//        public static void buscarLembrete(Long idLembrete){
//
//            EntityManager em = entityManagerFactory.createEntityManager();
//            Lembrete lembreteEncontrado = null;
//
//            try{
//                lembreteEncontrado = em.find(Lembrete.class, idLembrete);
//                System.out.println(lembreteEncontrado);
//
//            }catch (Exception e){
//                System.out.println("FIND: " + e.getMessage());
//            }finally {
//                em.close();
//            }
//
//            if(lembreteEncontrado != null){
//                System.out.println(lembreteEncontrado);
//            }else
//                System.out.println("Nenhum lembrete encontrado");
//        }
//
//        public static void criarLembrete(Lembrete lembreteLocal){
//            EntityManager em = entityManagerFactory.createEntityManager();
//
//            try {
//                em.getTransaction().begin();
//                em.persist(lembreteLocal);
//                em.getTransaction().commit();
//            }catch (Exception e){
//                em.getTransaction().rollback();
//
//                System.out.println("INSERT " + e.getMessage());
//            }finally {
//
//                em.close();
//            }
//        }
//
//        public static void listarLembretes(){
//
//            EntityManager em = entityManagerFactory.createEntityManager();
//            List <Lembrete> lembretes = null;
//
//            try {
//                lembretes = em.createQuery("from Lembrete ") .getResultList();
//
//            }catch (Exception e){
//                System.out.println("List ALL: " + e.getMessage());
//            }finally {
//                em.close();
//            }
//
//            if(lembretes != null){
//                lembretes.forEach(System.out::println);
//            }else
//                System.out.println("Nenhum lembrete encontrado");
//        }



