/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestao.entregascontroller;

import com.mycompany.gestao.entregasdao.UsuarioDAO;
import com.mycompany.gestao.entregasentidades.Usuario;
import java.util.List;

/**
 *
 * @author rigor
 */
public class UsuarioController {
    private UsuarioDAO usuarioDAO = new UsuarioDAO();

    public Usuario logar(Usuario user){
        Usuario verificaUsuario = usuarioDAO.getUsuario(user.getNome());
        
        if(verificaUsuario.getNome().equals(user.getNome())){
            if(verificaUsuario.getSenha().equals(user.getSenha()))
                return verificaUsuario;
        
        }
    
        return null;
    }
    
    
    
    
    public void addUsuario(Usuario usuario) {
        usuarioDAO.addUsuario(usuario);
    }
    public void deleteUsuario(Usuario usuario){
        usuarioDAO.deleteUsuario(usuario.getId());
    
    }
    public void atualizaUsuario(Usuario usuario) {
        usuarioDAO.atualizaUsuario(usuario);
    }
    
    public void getUsuario(Usuario usuario) {
        usuarioDAO.getUsuario(usuario.getNome());
    }
    public List<Usuario> listarUsuarios() {
        return usuarioDAO.getAllUsuarios();
    }
}
