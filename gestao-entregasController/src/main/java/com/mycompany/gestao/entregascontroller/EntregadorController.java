/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestao.entregascontroller;

import com.mycompany.gestao.entregasdao.EntregadorDAO;
import com.mycompany.gestao.entregasentidades.Entregador;
import java.util.List;

/**
 *
 * @author rigor
 */
public class EntregadorController {
    private EntregadorDAO entregadorDAO = new EntregadorDAO();

    public void addEntregador(Entregador entregador) {
        entregadorDAO.add(entregador);
    }
    public void deleteEntregador(Entregador entregador){
        entregadorDAO.deletar(entregador.getId());
    
    }
    public void atualizaEntregador(Entregador entregador) {
        entregadorDAO.atualizar(entregador);
    }
    
    public void getEntregador(Entregador entregador) {
        entregadorDAO.get(entregador.getId());
    }
    public List<Entregador> listarEntregador() {
        return entregadorDAO.getAll();
    }
}
