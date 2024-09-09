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
 * @author Aluno
 */
public class FazerPedidoController implements Initializable {

    @FXML
    private Button botaoAdicionarPedido;

    @FXML
    private Button botaoVoltar;

    /**
     * Initializes the controller class.
     */
    
    @FXML
    void voltar() throws IOException{
    
        App.mudaTela("TelaPrincipalCliente");
    }
    @FXML
    void fazerPedido(){
    
        //fazer depois
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
