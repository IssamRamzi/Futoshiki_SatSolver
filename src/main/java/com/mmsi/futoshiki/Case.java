package com.mmsi.futoshiki;

import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.geometry.Pos;

public class Case extends AnchorPane {
    public int value;
    private static int taille;
    private Label label;
    private int max;


    public Case(int max) {
        this.max = max;
        setPrefSize(taille, taille);
        setStyle("-fx-border-color: black; -fx-background-color: lightgray;");

        // Create the label
        label = new Label("");
        label.setStyle("-fx-font-size: 50px;");
        label.setAlignment(Pos.CENTER); // ! marche pas
        getChildren().add(label);


        this.setOnMouseClicked(this::handleMouseClick);
        this.setOnKeyTyped(this::handleKeyPress);
    }

    public static void setTaille(int taille){
        Case.taille = taille;
    }

    public void setValue(int value) {
        this.value = value;
        if(value == 0 || value > max) label.setText("");
        else label.setText(String.valueOf(value));
    }

    private void handleMouseClick(MouseEvent event) {
        this.requestFocus();
    }

    private void handleKeyPress(KeyEvent event){
        String character = event.getCharacter();

        try {
            int number = Integer.parseInt(character);
            setValue(number);
        } catch (NumberFormatException e) {

        }
    }
}
