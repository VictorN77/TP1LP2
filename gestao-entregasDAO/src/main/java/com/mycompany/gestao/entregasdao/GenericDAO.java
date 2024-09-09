/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestao.entregasdao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;
/**
 *
 * @author rigor
 */


public class GenericDAO<T> {

    private EntityManagerFactory emf;
    private Class<T> entityClass;

    public GenericDAO(Class<T> entityClass) {
        this.emf = Persistence.createEntityManagerFactory("com.mycompany_gestao-entregasDAO_jar_1.0-SNAPSHOTPU");
        this.entityClass = entityClass;
    }

    public void add(T entity) {
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void atualizar(T entity) {
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(entity);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void deletar(int id) {
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        T entity = entityManager.find(entityClass, id);
        if (entity != null) {
            entityManager.remove(entity);
        }
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public T get(int id) {
        EntityManager entityManager = emf.createEntityManager();
        T entity = entityManager.find(entityClass, id);
        entityManager.close();
        return entity;
    }

    public List<T> getAll() {
        EntityManager entityManager = emf.createEntityManager();
        List<T> entities = entityManager.createQuery("SELECT e FROM " + entityClass.getSimpleName() + " e", entityClass).getResultList();
        entityManager.close();
        return entities;
    }
}
