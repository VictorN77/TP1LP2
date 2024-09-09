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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Aluno
 */
public class LoginController implements Initializable {

    @FXML
    private Button botaoCriarConta;
    @FXML
    private Button botaoEntrar;

    @FXML
    private TextField nome;

    @FXML
    private PasswordField senha;

    @FXML
    private void criarConta() throws IOException {
        App.mudaTela("CadastroCliente");
    }

    private static Usuario verificaCadastro(String nome, String senha) {
        UsuarioController uc = new UsuarioController();
        Usuario user = new Usuario();
        
        user.setNome(nome);
        user.setSenha(senha);
        
        Usuario u = (Usuario) uc.logar(user);
        return u;
    }

    @FXML
    private void entrar() throws IOException {
        Usuario u = verificaCadastro(nome.getText(), senha.getText());
        if (u != null) {
            if(u.getTipo().equalsIgnoreCase("administrador"))
                App.mudaTela("TelaPrincipalGerente");
            else if(u.getTipo().equalsIgnoreCase("atendente"))
                //-----------------MUDAR DEPOIS------------------
                App.mudaTela("ListarEntregas");
            else if(u.getTipo().equalsIgnoreCase("entregador"))
                //-----------------MUDAR DEPOIS------------------
                App.mudaTela("ListarEntregas");
            else
                App.mudaTela("TelaPrincipalCliente");
        }
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
