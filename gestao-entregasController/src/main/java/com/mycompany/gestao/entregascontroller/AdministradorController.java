/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestao.entregascontroller;

import com.mycompany.gestao.entregasdao.AdministradorDAO;
import com.mycompany.gestao.entregasentidades.Administrador;
import java.util.List;

/**
 *
 * @author rigor
 */
public class AdministradorController {
    private AdministradorDAO administradorDAO = new AdministradorDAO();

    public void addAdministrador(Administrador administrador) {
        administradorDAO.add(administrador);
    }
    public void deleteAdministrador(Administrador administrador){
        administradorDAO.deletar(administrador.getId());
    
    }
    public void atualizaAdministrador(Administrador administrador) {
        administradorDAO.atualizar(administrador);
    }
    
    public void getAdministrador(Administrador administrador) {
        administradorDAO.get(administrador.getId());
    }
    public List<Administrador> listarAdministrador() {
        return administradorDAO.getAll();
    }
}
