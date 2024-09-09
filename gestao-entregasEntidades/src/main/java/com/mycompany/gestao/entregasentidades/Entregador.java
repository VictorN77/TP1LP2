/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestao.entregasentidades;

import javax.persistence.Table;

/**
 *
 * @author rigor
 */
@Table(name = "entregador")
public class Entregador extends Funcionario{
    public Entregador(String nome, String telefone, String senha) {
        super(nome, telefone, senha, Perfil.ENTREGADOR);
    }
    
}
