/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestao.entregasentidades;

import java.util.ArrayList;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Aluno
 */
@Entity
@Table(name="empresa")
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    
        @Column(name = "nome")

    private String nome;
            @Column(name = "cnpj")

    private String cnpj;
                @Column(name = "cpf")

    private String cpf;
                    @Column(name = "porcentagem_entregador")

    private double porcentagemComissaoEntregador;
                    
                    @OneToMany(fetch = FetchType.EAGER, cascade = 
            CascadeType.ALL, mappedBy = "empresa")
    private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
    
    @OneToMany(fetch = FetchType.EAGER, cascade = 
            CascadeType.ALL, mappedBy = "empresa")
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    @OneToMany(fetch = FetchType.EAGER, cascade = 
            CascadeType.ALL, mappedBy = "empresa")
    private ArrayList<Produto> produtos = new ArrayList<Produto>();
    
    
    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void addProduto(Produto produto) {
        this.produtos.add(produto);
    }
    
    
    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void addFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void addCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }
    
    
    public double getPorcentagemComissaoEntregador() {
        return porcentagemComissaoEntregador;
    }

    public void setPorcentagemComissaoEntregador(double porcentagemComissaoEntregador) {
        this.porcentagemComissaoEntregador = porcentagemComissaoEntregador;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
   
}
