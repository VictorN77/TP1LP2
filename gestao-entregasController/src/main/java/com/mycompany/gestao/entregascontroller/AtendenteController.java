/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestao.entregascontroller;

import com.mycompany.gestao.entregasdao.AtendenteDAO;
import com.mycompany.gestao.entregasentidades.Atendente;
import java.util.List;

/**
 *
 * @author rigor
 */
public class AtendenteController {
    private AtendenteDAO atendenteDAO = new AtendenteDAO();

    public void addAtendente(Atendente atendente) {
        atendenteDAO.add(atendente);
    }
    public void deleteAtendente(Atendente atendente){
        atendenteDAO.deletar(atendente.getId());
    
    }
    public void atualizaAtendente(Atendente atendente) {
        atendenteDAO.atualizar(atendente);
    }
    
    public void getAtendente(Atendente atendente) {
        atendenteDAO.get(atendente.getId());
    }
    public List<Atendente> listarAtendente() {
        return atendenteDAO.getAll();
    }
}
