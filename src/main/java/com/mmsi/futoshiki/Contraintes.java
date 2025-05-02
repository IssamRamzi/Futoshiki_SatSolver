package com.mmsi.futoshiki;

public class Contraintes {
    
    public boolean verifierH(){
        for ( int i =0 ; i < nombre.cases; i++;){
            for (int j =0; j< nombre.cases; j++; ){
              for(int k = j+1; k< nombre.cases; k++;){
                if( case[i][j].value ==case[i][k].value) {
                    return false ;
                }
              }
            }
        }  
        return true;
    }

    public boolean verifierV(){
        return false;
    }

    public boolean verifierI(){
        
        return false;
    }


}
