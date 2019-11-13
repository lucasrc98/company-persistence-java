package br.com.persistencia.java;

import br.com.persistencia.java.model.*;
import br.com.persistencia.java.service.*;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.List;

public class Main {

    //    Classe do JPA que permite a conexão com o Banco
    private static EntityManagerFactory entityManagerFactory;

    public static void main(String args[]) {

        FuncionarioService funService = new FuncionarioService();
        DepartamentoService depService = new DepartamentoService();
        DependenteService dependenteService = new DependenteService();
        ProjetoService projService = new ProjetoService();
        PesquisaService pesquisaService = new PesquisaService();

        FunLimpezaService funLimpezaService = new FunLimpezaService();
        SecretarioService secretarioService = new SecretarioService();


        /*  DEPARTAMENTOS   */

        Departamento departamento1 = new Departamento();
        Departamento departamento2 = new Departamento();

        departamento1.setNomeDepartamento("Departamento1");
        departamento1.setNumeroDepartamento(100);

        departamento2.setNomeDepartamento("Departamento gg");
        departamento2.setNumeroDepartamento(200);

//        depService.save(departamento1);
//        depService.save(departamento2);
//
//
        //    depService.findAll();
//      depService.findById(2);
//      depService.deleteById();


        /*  PROJETO */

        Projeto projeto1 = new Projeto();

        projeto1.setNomeProjeto("Projeto Piloto");
        projeto1.setTempoDesenvolvimento(40.30f);


        Projeto projeto2 = new Projeto();

        projeto2.setNomeProjeto("Porjeto Alfa");
        projeto2.setTempoDesenvolvimento(20f);


//      projService.save(projeto1, 1);
//        projService.save(projeto2, 2);
//
//        projService.findAll();
//       projService.findById(1);
//       projService.deleteById(0);






        /*  FUNCIONARIOS    */


        FuncionarioLimpeza funcionario1 = new FuncionarioLimpeza();
        FuncionarioLimpeza funcionario2 = new FuncionarioLimpeza();
        Pesquisador funcionario3 = new Pesquisador();
        Pesquisador funcionario4 = new Pesquisador();
        Secretario secretario1 = new Secretario();
        Secretario secretario2 = new Secretario();

        funcionario1.setNomeFuncionario("Abel");
        funcionario1.setEnderecoFuncionario("Basilio Pinto");
        funcionario1.setSexoFuncionario("Masculino");
        funcionario1.setDataAniversario("01/01/1995");
        funcionario1.setSalarioFuncionario(20000);
        funcionario1.setCargo("Chefe Da Limpeza");
        funcionario1.setJornadaTrabalho("30h");


        funcionario2.setNomeFuncionario("Juvenal");
        funcionario2.setEnderecoFuncionario("Basilio Pinto");
        funcionario2.setSexoFuncionario("Masculino");
        funcionario2.setDataAniversario("10/10/2000");
        funcionario2.setSalarioFuncionario(1900);
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


        secretario1.setNomeFuncionario("Pedro");
        secretario1.setEnderecoFuncionario("Basilio Pinto");
        secretario1.setSexoFuncionario("Masculino");
        secretario1.setDataAniversario("10/10/2000");
        secretario1.setSalarioFuncionario(1900);
        secretario1.setGrauEscolaridade("Ensino medio completo");
        secretario1.setDependente(null);

        secretario2.setNomeFuncionario("Maria");
        secretario2.setEnderecoFuncionario("Centro");
        secretario2.setSexoFuncionario("Feminino");
        secretario2.setDataAniversario("10/10/1995");
        secretario2.setSalarioFuncionario(1900);
        secretario2.setGrauEscolaridade("Ensino medio completo");
        secretario2.setDependente(null);



//       funService.save(secretario2, 1);
//       funService.save(funcionario4, 2);




//        funService.save(funcionario3, 1);
//      funService.save(funcionario4);
//      funService.deleteById();
//       funLimpezaService.findAll();



        /*  DEPENDENTES */

        Dependente dependente1 = new Dependente();
        Dependente dependente2 = new Dependente();

        dependente1.setNomeDependente("Fulando dependente");
        dependente1.setParentescoDependente("Filho");
        dependente1.setSexoDependente("Masculino");
        dependente1.setAniversarioDependente("30/06/2005");

        dependente2.setNomeDependente("Ciclano dependente");
        dependente2.setParentescoDependente("Neto");
        dependente2.setSexoDependente("Feminino");
        dependente2.setAniversarioDependente("7/08/2004");

//        dependenteService.save(dependente1, 4);
//        dependenteService.save(dependente2, 2);
//        dependenteService.findById(0);
//        dependenteService.findAll();
//        dependenteService.deleteById(0);


        /*  Pesquisas   */

        Pesquisa pesquisa1 = new Pesquisa();
        pesquisa1.setHorasTrabalhadas(20);

        pesquisaService.save(pesquisa1, 1,4);



        /*  HorasTrabalhadas    */

//        HorasTrabalhadas horasTrabalhadas1 = new HorasTrabalhadas();
//        horasTrabalhadas1.setQtdHoras(20);
//
//        horasTrabService.save(3,1, horasTrabalhadas1);
//        horasTrabService.findAll();
//        horasTrabService.findById();
//        horasTrabService.deleteById();


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



