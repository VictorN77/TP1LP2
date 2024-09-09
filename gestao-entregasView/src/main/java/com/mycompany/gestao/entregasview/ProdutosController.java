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
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;

/**
 * FXML Controller class
 *
 * @author Windows 10
 */
public class ProdutosController implements Initializable {

    @FXML
    private Button adicionarPedido;

    @FXML
    private Button botaoVoltar;

    @FXML
    private GridPane dadosPedido;

    @FXML
    private Label labelStatus;

    @FXML
    private ListView<ItemPedido> listaProdutos;

    @FXML
    private Label nomeProduto;

    @FXML
    void voltar() throws IOException {

        App.mudaTela("TelaPrincipalGerenteController");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
