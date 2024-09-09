/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.gestao.entregasview;

import com.mycompany.gestao.entregascontroller.*;
import com.mycompany.gestao.entregasentidades.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

/**
 * FXML Controller class
 *
 * @author Aluno
 */
public class ListarEntregasController implements Initializable {

    @FXML
    private Button botaoVoltar;

    @FXML
    private ListView<String> listaEntregas;
    
    private static PedidoController pedidoController = new PedidoController();
    Pedido selecionado;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        List<Pedido> entregas = pedidoController.listarPedidos();
        ArrayList<String> nomePedidos = new ArrayList<>();

        for (Pedido p : entregas) {

            nomePedidos.add(p.getCliente().getNome());
        }
        listaEntregas.getItems().addAll(nomePedidos);

        //
        listaEntregas.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

            @Override
            public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {

                for (Pedido p : entregas) {

                    if (p.getCliente().getNome().equals(listaEntregas.getSelectionModel().getSelectedItem())) {
                        selecionado = p;
                    }
                    
                }
                //labelCliente.setText(selecionado.getCliente().getNome();
                //labelStatus.setText(selecionado.getStatus());

            }
        });
    }   
    
}
