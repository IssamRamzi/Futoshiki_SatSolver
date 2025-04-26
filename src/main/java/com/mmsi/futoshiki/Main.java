package com.mmsi.futoshiki;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Futoshiki");
        AnchorPane root = new AnchorPane();
        Jeu jeu = new Jeu(root, Utils.tailleFenetre, Utils.tailleFenetre);
        stage.setScene(jeu);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}