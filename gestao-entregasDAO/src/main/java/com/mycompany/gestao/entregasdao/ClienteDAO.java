/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestao.entregasdao;

import com.mycompany.gestao.entregasentidades.Cliente;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Aluno
 */
public class ClienteDAO {
    
    public static void main(String args[]){
        ClienteDAO cd = new ClienteDAO();
        Cliente cliente = new Cliente();

        cliente.setNome("Teste");
        cliente.setSenha("test");
        cd.addCliente(cliente);

        //List<Cliente> lista = cd.getAllClientes();
        //for(int i =0; i<lista.size(); i++)
          //  System.out.println("Funcionou: " + lista.get(i).getNome());
    }

    private EntityManagerFactory emf;

    public ClienteDAO() {
        emf = Persistence.createEntityManagerFactory("com.mycompany_gestao-entregasDAO_jar_1.0-SNAPSHOTPU");
    }

    public void addCliente(Cliente cliente) {
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(cliente);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void deleteCliente(int id) {
         EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        Cliente cliente = entityManager.find(Cliente.class, id);
        if (cliente != null) {
            entityManager.remove(cliente);
        }
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void atualizaCliente(Cliente cliente) {
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(cliente);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public Cliente getCliente(int id) {
        EntityManager entityManager = emf.createEntityManager();
        Cliente cliente = entityManager.find(Cliente.class, id);
        entityManager.close();
        return cliente;
    }

    public List<Cliente> getAllClientes() {
        EntityManager entityManager = emf.createEntityManager();
        List<Cliente> clientes = entityManager.createQuery("SELECT c FROM Cliente c", Cliente.class).getResultList();
        entityManager.close();
        return clientes;
    }

}
