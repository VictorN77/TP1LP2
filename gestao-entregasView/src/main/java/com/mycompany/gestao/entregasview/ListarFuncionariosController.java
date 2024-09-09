package com.mycompany.gestao.entregasview;

import com.mycompany.gestao.entregascontroller.FuncionarioController;
import com.mycompany.gestao.entregasentidades.Funcionario;
import com.mycompany.gestao.entregasview.App;
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
import javafx.scene.layout.GridPane;

public class ListarFuncionariosController implements Initializable {

    @FXML
    private Button botaoVoltar;

    @FXML
    private GridPane dadosFuncionario;

    @FXML
    private Label labelNome;

    @FXML
    private Label labelInfo;

    @FXML
    private Label labelFuncoes;

    @FXML
    private ListView<String> listaFuncionarios;
    
    private static FuncionarioController funcionarioController = new FuncionarioController();
    Funcionario selecionado;
    
    @FXML
    void voltar() throws IOException {
        App.mudaTela("TelaPrincipalGerente");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        List<Funcionario> funcionarios = funcionarioController.listarFuncionarios();
        ArrayList<String> nomeFuncionarios = new ArrayList<>();

        for (Funcionario f : funcionarios) {
            nomeFuncionarios.add(f.getNome());
        }
        listaFuncionarios.getItems().addAll(nomeFuncionarios);

        listaFuncionarios.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
                for (Funcionario f : funcionarios) {
                    if (f.getNome().equals(listaFuncionarios.getSelectionModel().getSelectedItem())) {
                        selecionado = f;
                    }
                }
                labelNome.setText(selecionado.getNome());
            }
        });
    }
}
