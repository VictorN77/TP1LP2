/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestao.entregasdao;

import com.mycompany.gestao.entregasentidades.Empresa;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Aluno
 */
public class EmpresaDAO {

    private EntityManagerFactory emf;

    public EmpresaDAO() {

        emf = Persistence.createEntityManagerFactory("com.mycompany_gestao-entregasDAO_jar_1.0-SNAPSHOTPU");

    }

    public void addEmpresa(Empresa empresa) {
         EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(empresa);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void deleteEmpresa(int id) {
          EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        Empresa empresa = entityManager.find(Empresa.class, id);
        if (empresa != null) {
            entityManager.remove(empresa);
        }
        entityManager.getTransaction().commit();
        entityManager.close();

    }

    public void atualizaEmpresa(int id, Empresa empresa) {
         EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(empresa);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public Empresa getEmpresa(int id) {
         EntityManager entityManager = emf.createEntityManager();
        Empresa empresa = entityManager.find(Empresa.class, id);
        entityManager.close();
        return empresa;
    }

    public List<Empresa> getAllEmpresas() {
        EntityManager entityManager = emf.createEntityManager();
        List<Empresa> empresas = entityManager.createQuery("SELECT e FROM empresa e", Empresa.class).getResultList();
        entityManager.close();
        return empresas;
    }

}
