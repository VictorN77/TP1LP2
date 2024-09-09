/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestao.entregascontroller;

import com.mycompany.gestao.entregasdao.FuncionarioDAO;
import com.mycompany.gestao.entregasentidades.Funcionario;
import java.util.List;

/**
 *
 * @author rigor
 */
public class FuncionarioController {
    private FuncionarioDAO funcionarioDAO = new FuncionarioDAO();

    public void addFuncionario(Funcionario funcionario) {
        funcionarioDAO.addFuncionario(funcionario);
    }
    public void deleteFuncionario(Funcionario funcionario){
        funcionarioDAO.deleteFuncionario(funcionario.getId());
    
    }
    public void atualizaFuncionario(Funcionario funcionario) {
        funcionarioDAO.atualizaFuncionario(funcionario);
    }
    
    public void getfuncionario(Funcionario funcionario) {
        funcionarioDAO.getFuncionario(funcionario.getId());
    }
    public List<Funcionario> listarFuncionarios() {
        return funcionarioDAO.getAllFuncionarios();
    }
}
