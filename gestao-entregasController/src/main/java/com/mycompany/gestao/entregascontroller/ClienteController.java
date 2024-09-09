/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestao.entregascontroller;

import com.mycompany.gestao.entregasdao.ClienteDAO;
import com.mycompany.gestao.entregasentidades.Cliente;
import java.util.List;

/**
 *
 * @author rigor
 */
public class ClienteController {
    private ClienteDAO clienteDAO = new ClienteDAO();

    public void addCliente(Cliente cliente) {
        clienteDAO.addCliente(cliente);
    }
    public void deleteCliente(Cliente cliente){
        clienteDAO.deleteCliente(cliente.getId());
    
    }
    public void atualizaCliente(Cliente cliente) {
        clienteDAO.atualizaCliente(cliente);
    }
    
    public void getcliente(Cliente cliente) {
        clienteDAO.getCliente(cliente.getId());
    }
    public List<Cliente> listarClientes() {
        return clienteDAO.getAllClientes();
    }
}
