package com.mmsi.futoshiki;

import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class Case extends AnchorPane {
    public int value;
    private static int taille;
    public Case() {
        setPrefSize(taille, taille);
        setStyle("-fx-border-color: black; -fx-background-color: lightgray;");
    }

    public static void setTaille(int taille){
        Case.taille = taille;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
