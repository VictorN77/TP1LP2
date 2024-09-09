/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.gestao.entregasview;

import com.mycompany.gestao.entregascontroller.*;
import com.mycompany.gestao.entregasentidades.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author Windows 10
 */
public class TelaPrincipalGerenteController implements Initializable {

    @FXML
    private Button botaoSair;

    @FXML
    private Button botaoVerFuncionarios;

    @FXML
    private Button botaoAdicionarFuncionario;
        
    @FXML
    private Button botaoCadastrarProduto;

    @FXML
    void sair() throws IOException {

        App.mudaTela("Login");

    }
    
    @FXML
    void verProdutos() throws IOException {
    
        App.mudaTela("Produtos");
    }
    @FXML
    void verFuncionarios() throws IOException {

        App.mudaTela("ListarFuncionarios");
    }
    @FXML
    void verPedidos() throws IOException {
    
        App.mudaTela("ListarPedido");
    }

    @FXML
    void cadastrarFuncionario() throws IOException {

        App.mudaTela("CadastroFuncionario");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
