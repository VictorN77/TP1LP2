package com.mycompany.gestao.entregasview;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    private static Stage stage;

    @Override
    public void start(Stage primaryStage) throws IOException {
        stage = primaryStage;
        stage.setResizable(false);
        scene = new Scene(loadFXML("TelaPrincipalGerente"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void mudaTela(String tela) throws IOException {
        Scene novaTela = new Scene(loadFXML(tela), 640, 480);
        stage.setScene(novaTela);
    }

    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
