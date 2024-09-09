/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.gestao.entregasview;

import com.mycompany.gestao.entregascontroller.*;
import com.mycompany.gestao.entregasentidades.*;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

/**
 * FXML Controller class
 *
 * @author Aluno
 */
public class ListarPedidoController implements Initializable {

    @FXML
    private ListView<String> listaPedidos;

    @FXML
    private Button botaoVoltar;

    @FXML
    private Label labelCliente;

    @FXML
    private Label labelEntregador;

    @FXML
    private Label labelPedido;

    @FXML
    private Label labelStatus;

    private static PedidoController pedidoController = new PedidoController();
    Pedido selecionado;

    /**
     * Initializes the controller class.
     */
    @FXML
    void voltar() throws IOException {

        App.mudaTela("TelaInicialCliente");
    }

    void adicionarPedido() {

        //PedidoController pedidoController = new PedidoController();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        List<Pedido> pedidos = pedidoController.listarPedidos();
        ArrayList<String> nomePedidos = new ArrayList<>();

        for (Pedido p : pedidos) {

            nomePedidos.add(p.getCliente().getNome());
        }
        listaPedidos.getItems().addAll(nomePedidos);

        //
        listaPedidos.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

            @Override
            public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {

                for (Pedido p : pedidos) {

                    if (p.getCliente().getNome().equals(listaPedidos.getSelectionModel().getSelectedItem())) {
                        selecionado = p;
                    }
                    
                }
                labelCliente.setText(selecionado.getCliente().getNome());
                //labelStatus.setText(selecionado.getStatus());

            }
        });
    }

}
