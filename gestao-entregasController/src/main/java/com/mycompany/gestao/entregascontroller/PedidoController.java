/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestao.entregascontroller;

import com.mycompany.gestao.entregasdao.PedidoDAO;
import com.mycompany.gestao.entregasentidades.Pedido;
import java.util.List;

/**
 *
 * @author rigor
 */
public class PedidoController {
    private PedidoDAO pedidoDAO = new PedidoDAO();

    public void addPedido(Pedido pedido) {
        pedidoDAO.addPedido(pedido);
    }
    public void deletePedido(Pedido pedido){
        pedidoDAO.deletePedido(pedido.getId());
    
    }
    public void atualizaPedido(Pedido pedido) {
        pedidoDAO.atualizaPedido(pedido);
    }
    
    public void getpedido(Pedido pedido) {
        pedidoDAO.getpedido(pedido.getId());
    }
    public List<Pedido> listarPedidos() {
        return pedidoDAO.getAllPedidos();
    }
}
