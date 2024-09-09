/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestao.entregascontroller;

import com.mycompany.gestao.entregasdao.ProdutoDAO;
import com.mycompany.gestao.entregasentidades.Produto;
import java.util.List;

/**
 *
 * @author rigor
 */
public class ProdutoController {
    private ProdutoDAO produtoDAO = new ProdutoDAO();

    public void addProduto(Produto produto) {
        produtoDAO.addProduto(produto);
    }
    public void deleteProduto(Produto produto){
        produtoDAO.deleteProduto(produto.getId());
    
    }
    public void atualizaProduto(Produto produto) {
        produtoDAO.atualizaProduto(produto);
    }
    
    public void getProduto(Produto produto) {
        produtoDAO.getProduto(produto.getId());
    }
    public List<Produto> listarProdutos() {
        return produtoDAO.getAllProdutos();
    }
}
