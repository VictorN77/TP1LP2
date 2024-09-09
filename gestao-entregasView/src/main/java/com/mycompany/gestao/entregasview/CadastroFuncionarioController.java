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
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Aluno
 */
public class CadastroFuncionarioController implements Initializable {
    
  @FXML
    private Button cadastrar;

    @FXML
    private Button cancelar;

    @FXML
    private CheckBox checkboxAdministrador;

    @FXML
    private CheckBox checkboxAtendente;

    @FXML
    private CheckBox checkboxEntregador;

    @FXML
    private TextField nome;

    @FXML
    private PasswordField senha;

    @FXML
    private TextField telefone;
    
    @FXML
    void voltar() throws IOException{
    
        App.mudaTela("TelaPrincipalGerente");
    }
    
    @FXML
    void cadastraFuncionario() throws IOException {
        Perfil perfil;
        String tipo;
        if(checkboxAtendente.getText().equals("Atendente")){
            perfil = Perfil.ATENDENTE;
            tipo = "atendente";
            AtendenteController ac = new AtendenteController();
            Atendente a = new Atendente(nome.getText(), telefone.getText(), senha.getText());
            ac.addAtendente(a);
        }
        else if(checkboxAdministrador.getText().equals("Administrador")){
            AdministradorController aa = new AdministradorController();
            perfil = Perfil.ADMINISTRADOR;
            tipo = "administrador";
            Administrador adm = new Administrador(nome.getText(), telefone.getText(), senha.getText());
            aa.addAdministrador(adm);
        }
        else{
            EntregadorController ec = new EntregadorController();
            perfil = Perfil.ENTREGADOR;
            tipo = "entregador";
            Entregador e = new Entregador(nome.getText(), telefone.getText(), senha.getText());
            ec.addEntregador(e);
        }
        
        Usuario userFuncionario = new Usuario();
        UsuarioController uc = new UsuarioController();
        FuncionarioController fc = new FuncionarioController();
        
        Funcionario f = new Funcionario(nome.getText(), telefone.getText(), senha.getText(), perfil);
        
        userFuncionario.setNome(nome.getText());
        userFuncionario.setSenha(senha.getText());
        userFuncionario.setTipo(tipo);
       
       //Cadastrando o funcionário como usuario
        uc.addUsuario(userFuncionario);
        fc.addFuncionario(f);
        
        App.mudaTela("Login");
        
    }
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
