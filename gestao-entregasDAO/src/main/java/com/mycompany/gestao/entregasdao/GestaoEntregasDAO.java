/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestao.entregasdao;

import com.mycompany.gestao.entregasentidades.Produto;
import java.util.List;

/**
 *
 * @author Windows 10
 */
public class GestaoEntregasDAO {

public static void main(String args[]){
        ProdutoDAO dao = new ProdutoDAO();
        Produto p = new Produto();
        p.setLocalizacao("vskdfgosa");
        p.setNome("nome");
        dao.addProduto(p);
    }
}