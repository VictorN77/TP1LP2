/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.gestao.entregasview;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import com.mycompany.gestao.entregascontroller.*;
import com.mycompany.gestao.entregasentidades.*;

/**
 * FXML Controller class 
 *
 * @author Aluno
 */ 
public class CadastroClienteController implements Initializable {
    
    
    
    @FXML
    private TextField bairro;

    @FXML
    private TextField endereco;

    @FXML
    private TextField nome;

    @FXML
    private PasswordField senha;
    
    @FXML
    void cancelarCadastro() throws IOException{

    App.mudaTela("Login");
}
    
    @FXML
    void cadastrar() throws IOException{
    
       ClienteController clienteController = new ClienteController();
       Cliente c = new Cliente();
       Usuario userCliente = new Usuario();
       UsuarioController uc = new UsuarioController();
       
       //Setando os dados do cliente
       c.setBairro(bairro.getText());
       c.setLogradouro(endereco.getText());
       c.setNome(nome.getText());
       c.setSenha(senha.getText());
       
       //Cadastrando o cliente na tabela 'Cliente'
       clienteController.addCliente(c);
       
       //Setando os dados de usuario do cliente
       userCliente.setNome(nome.getText());
       userCliente.setSenha(senha.getText());
       userCliente.setTipo("cliente");
       
       //Cadastrando o cliente como usuario
       uc.addUsuario(userCliente);
       
       App.mudaTela("Login");
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
