package com.mmsi.futoshiki;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

public class Jeu extends Scene {

    Parent parent;
    int longueur, largeur;

    int nombreCases = 4;
    int tailleCase;

    Case[][] cases;
    GridPane grille;
    Double padding = 150.0;

    public Jeu(Parent root, int width, int height){
        super(root, width, height);

        this.parent = root;
        this.largeur = width;
        this.longueur = height;
        cases = new Case[nombreCases][nombreCases];
        grille = new GridPane();

        initialiserCases();
        afficherGrille();
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
                cases[i][j] = new Case();
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

}
