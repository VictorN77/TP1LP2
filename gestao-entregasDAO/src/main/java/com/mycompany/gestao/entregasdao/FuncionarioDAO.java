/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestao.entregasdao;

/**
 *
 * @author Aluno
 */
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;
import com.mycompany.gestao.entregasentidades.Funcionario;

public class FuncionarioDAO{

    private EntityManagerFactory emf;

    public FuncionarioDAO() {

        emf = Persistence.createEntityManagerFactory("persistence");
    }

    public void addFuncionario(Funcionario funcionario) {

        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(funcionario);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void atualizaFuncionario(Funcionario funcionario) {

        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(funcionario);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void deleteFuncionario(int id) {

        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        Funcionario funcionario = entityManager.find(Funcionario.class, id);
        if (funcionario != null) {
            entityManager.remove(funcionario);
        }
        entityManager.getTransaction().commit();
        entityManager.close();

    }

    public Funcionario getFuncionario(int id) {
        EntityManager entityManager = emf.createEntityManager();
        Funcionario funcionario = entityManager.find(Funcionario.class, id);
        entityManager.close();
        return funcionario;
    }

    public List<Funcionario> getAllFuncionarios() {
        EntityManager entityManager = emf.createEntityManager();
        List<Funcionario> funcionarios = entityManager.createQuery("SELECT f FROM Funcionario f", Funcionario.class).getResultList();
        entityManager.close();
        return funcionarios;
    }
}
