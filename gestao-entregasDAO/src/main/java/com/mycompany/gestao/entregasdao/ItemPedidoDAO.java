/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestao.entregasdao;

import com.mycompany.gestao.entregasentidades.ItemPedido;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Aluno
 */
public class ItemPedidoDAO {

    private EntityManagerFactory emf;

    public ItemPedidoDAO() {
        emf = Persistence.createEntityManagerFactory("persistence");

    }

    public void addItemPedido(ItemPedido itemPedido) {
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(itemPedido);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void deleteItemPedido(int id) {
       EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        ItemPedido itemPedido = entityManager.find(ItemPedido.class, id);
        if (itemPedido != null) {
            entityManager.remove(itemPedido);
        }
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void atualizaItemPedido(ItemPedido itemPedido) {
         EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(itemPedido);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public ItemPedido getItemPedido(int id) {
         EntityManager entityManager = emf.createEntityManager();
        ItemPedido itemPedido = entityManager.find(ItemPedido.class, id);
        entityManager.close();
        return itemPedido;
    }

    public List<ItemPedido> getAllItensPedidos() {
         EntityManager entityManager = emf.createEntityManager();
        List<ItemPedido> itensPedido = entityManager.createQuery("SELECT i FROM item_pedido i", ItemPedido.class).getResultList();
        entityManager.close();
        return itensPedido;
    }

}
