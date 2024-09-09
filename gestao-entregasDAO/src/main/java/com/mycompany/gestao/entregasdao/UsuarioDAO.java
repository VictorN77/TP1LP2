/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestao.entregasdao;

import com.mycompany.gestao.entregasentidades.Cliente;
import br.cefetmg.gestaoentregasentidades.entities.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author rigor
 */
public class UsuarioDAO{
    private EntityManagerFactory emf;
    private UsuarioDAO usuarioDAO;
    public UsuarioDAO() {
        emf = Persistence.createEntityManagerFactory("persistence");
    }

    public void addUsuario(Usuario usuario) {
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(usuario);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void deleteUsuario(int id) {
         EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        Cliente cliente = entityManager.find(Cliente.class, id);
        if (cliente != null) {
            entityManager.remove(cliente);
        }
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void atualizaUsuario(Usuario usuario) {
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(usuario);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public Usuario getUsuario(String nome) {
        ArrayList<Usuario> users = (ArrayList) usuarioDAO.getAllUsuarios();
        for(int i = 0; i<users.size(); i++){
            if(users.get(i).getNome().equals(nome))
                return users.get(i);
        }
        return null;
    }

    public List<Usuario> getAllUsuarios() {
        EntityManager entityManager = emf.createEntityManager();
        List<Usuario> usuarios = entityManager.createQuery("SELECT u FROM Usuario u", Usuario.class).getResultList();
        entityManager.close();
        return usuarios;
    }
}
