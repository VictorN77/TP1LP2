/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestao.entregascontroller;


import com.mycompany.gestao.entregasdao.ItemPedidoDAO;
import com.mycompany.gestao.entregasentidades.ItemPedido;
import java.util.List;

/**
 *
 * @author rigor
 */
public class ItemPedidoController {
    private ItemPedidoDAO itemPedidoDAO = new ItemPedidoDAO();

    public void addItemPedido(ItemPedido itemPedido) {
        itemPedidoDAO.addItemPedido(itemPedido);
    }
    public void deleteItemPedido(ItemPedido itemPedido){
        itemPedidoDAO.deleteItemPedido(itemPedido.getId());
    
    }
    public void atualizaItemPedido(ItemPedido itemPedido) {
        itemPedidoDAO.atualizaItemPedido(itemPedido);
    }
    
    public void getItemPedido(ItemPedido itemPedido) {
        itemPedidoDAO.getItemPedido(itemPedido.getId());
    }
    public List<ItemPedido> listarItensPedidos() {
        return itemPedidoDAO.getAllItensPedidos();
    }
}
