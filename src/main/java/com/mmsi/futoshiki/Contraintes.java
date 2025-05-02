package com.mmsi.futoshiki;

public class Contraintes {

    Jeu jeu;

    public Contraintes(Jeu jeu){
        this.jeu = jeu;
    }

    public boolean verifierH(){
        for ( int i =0 ; i < jeu.nombreCases; i++){
            for (int j =0; j< jeu.nombreCases; j++){
              for(int k = j+1; k< jeu.nombreCases; k++){
                if( jeu.cases[i][j].value == jeu.cases[i][k].value) {
                    return false ;
                }
              }
            }
        }  
        return true;
    }

    public boolean verifierV(){
//        for(int i =0; i < )
        return false;
    }

    public boolean verifierI(){
        
        return false;
    }


}
