/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestao.entregasdao;

import com.mycompany.gestao.entregasentidades.Pedido;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Aluno
 */
public class PedidoDAO{
    
        private EntityManagerFactory emf;


    public PedidoDAO() {
        emf = Persistence.createEntityManagerFactory("persistence");

    }

    public void addPedido(Pedido pedido) {
         EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(pedido);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void deletePedido(int id) {
          EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        Pedido pedido = entityManager.find(Pedido.class, id);
        if (pedido != null) {
            entityManager.remove(pedido);
        }
        entityManager.getTransaction().commit();
        entityManager.close();

    }

    public void atualizaPedido(Pedido pedido) {
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(pedido);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public Pedido getpedido(int id) {
        EntityManager entityManager = emf.createEntityManager();
        Pedido pedido = entityManager.find(Pedido.class, id);
        entityManager.close();
        return pedido;
    }

    public List<Pedido> getAllPedidos() {
         EntityManager entityManager = emf.createEntityManager();
        List<Pedido> pedidos = entityManager.createQuery("SELECT p FROM Pedido p", Pedido.class).getResultList();
        entityManager.close();
        return pedidos;
    }

}
