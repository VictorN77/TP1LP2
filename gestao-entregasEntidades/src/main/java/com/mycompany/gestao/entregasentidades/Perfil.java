/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestao.entregasentidades;


public enum Perfil{
    ADMINISTRADOR("administrador"),
    ATENDENTE("atendente"),
    ENTREGADOR("entregador");
    
     private String descricao;

    Perfil(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
    
    }
/**
 *
 * @author Aluno
 */

