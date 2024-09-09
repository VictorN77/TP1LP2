/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestao.entregascontroller;

import com.mycompany.gestao.entregasdao.EmpresaDAO;
import com.mycompany.gestao.entregasentidades.Empresa;
import java.util.List;

/**
 *
 * @author rigor
 */
public class EmpresaController {
    private EmpresaDAO empresaDAO = new EmpresaDAO();

    public void addEmpresa(Empresa empresa) {
        empresaDAO.addEmpresa(empresa);
    }
    public void deleteEmpresa(Empresa empresa){
        empresaDAO.deleteEmpresa(empresa.getId());
    
    }
    public void atualizaEmpresa(Empresa empresa) {
        empresaDAO.atualizaEmpresa(empresa.getId(),empresa);
    }
    
    public void getempresa(Empresa empresa) {
        empresaDAO.getEmpresa(empresa.getId());
    }
    public List<Empresa> listarEmpresas() {
        return empresaDAO.getAllEmpresas();
    }
}
