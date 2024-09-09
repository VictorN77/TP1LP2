/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package br.cefetmg.gestaoentregasview;

import static br.cefetmg.gestaoentregasview.App.mudaTela;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author Aluno
 */
public class TelaPrincipalClienteController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private Button botaoFazerPedido;

    @FXML
    private Button botaoSair;
    // TODO

    @FXML
    void fazerPedido() {

        try {
            mudaTela("FazerPedido");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    void listarPedido() throws IOException {

        mudaTela("ListarPedido");
    }

    @FXML
    void sair() throws IOException {

        mudaTela("Login");

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
