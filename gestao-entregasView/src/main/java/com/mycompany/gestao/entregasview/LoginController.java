/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package br.cefetmg.gestaoentregasview;

import br.cefetmg.gestaoentregascontroller.UsuarioController;
import br.cefetmg.gestaoentregasentidades.entities.Atendente;
import br.cefetmg.gestaoentregasentidades.entities.Cliente;
import br.cefetmg.gestaoentregasentidades.entities.Entregador;
import br.cefetmg.gestaoentregasentidades.entities.Funcionario;
import br.cefetmg.gestaoentregasentidades.entities.Usuario;
import static br.cefetmg.gestaoentregasview.App.mudaTela;
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
        mudaTela("CadastroCliente");
    }

    private static Usuario verificaCadastro(String nome, String senha) {
        UsuarioController uc = new UsuarioController();
        Usuario user = new Usuario();
        
        user.setNome(nome);
        user.setSenha(senha);
        
        Usuario u = uc.logar(user);
        return u;
    }

    @FXML
    private void entrar() throws IOException {
        Usuario u = verificaCadastro(nome.getText(), senha.getText());
        if (u != null) {
            if(u.getTipo().equalsIgnoreCase("administrador"))
                mudaTela("TelaPrincipalGerente");
            else if(u.getTipo().equalsIgnoreCase("atendente"))
                //-----------------MUDAR DEPOIS------------------
                mudaTela("ListarEntregas");
            else if(u.getTipo().equalsIgnoreCase("entregador"))
                //-----------------MUDAR DEPOIS------------------
                mudaTela("ListarEntregas");
            else
                mudaTela("TelaPrincipalCliente");
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
