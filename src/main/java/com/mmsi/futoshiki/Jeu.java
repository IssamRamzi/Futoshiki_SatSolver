package com.mmsi.futoshiki;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

import javax.swing.*;

public class Jeu extends Scene {

    Parent parent;
    int longueur, largeur;

    int nombreCases = 4;
    int tailleCase;

    Case[][] cases;
    GridPane grille;
    ChoiceBox<Integer> choiceBox = new ChoiceBox<>();
    Double padding = 150.0;
    Integer choiceBoxValues[] = {4, 5, 6, 7, 8, 9};

    public Jeu(Parent root, int width, int height){
        super(root, width, height);

        this.parent = root;
        this.largeur = width;
        this.longueur = height;
        cases = new Case[nombreCases][nombreCases];
        grille = new GridPane();
        initAll();
    }

    void initAll(){

        grille.getChildren().removeAll();
        choiceBox.getItems().removeAll();
        initialiserCases();
        afficherGrille();
        initChoiceBox();
        ((AnchorPane) parent).getChildren().add(grille);

        AnchorPane.setTopAnchor(grille, padding);
        AnchorPane.setLeftAnchor(grille, padding);
        AnchorPane.setRightAnchor(grille, padding);
        AnchorPane.setBottomAnchor(grille, padding);
    }

    private void initialiserCases() {
        tailleCase = (Utils.tailleFenetre - padding.intValue()*2) / nombreCases;
        Case.setTaille(tailleCase);

        for (int i = 0; i < nombreCases; i++) {
            for (int j = 0; j < nombreCases; j++) {
                cases[i][j] = new Case(nombreCases);
            }
        }
    }

    public void afficherGrille(){

        for (int i = 0; i < nombreCases; i++) {
            for (int j = 0; j < nombreCases; j++) {
                grille.add(cases[i][j], j, i);
            }
        }
    }

    public void initChoiceBox(){
        Label label = new Label("Nombre de cases ");
        choiceBox.getItems().addAll(choiceBoxValues);
        choiceBox.setLayoutY(20);
        ((AnchorPane)parent).getChildren().add(label);
        ((AnchorPane)parent).getChildren().add(choiceBox);
        choiceBox.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number newValue) {
//                System.out.println((int)newValue);
//                nombreCases = choiceBoxValues[(int)newValue];
                initAll();
            }
        });
    }

    public void changeOptionsValue(EventHandler<ActionEvent> event){

    }

}
