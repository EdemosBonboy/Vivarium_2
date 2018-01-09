/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javafx.scene.paint.Color;
import vivariumview.Constantes;

/**
 *
 * @author ornei
 */
public class Poule extends Proie {
     
    private String nom;
    public Poule(int idProi, int x, int y, int dir) {
        super(idProi, x, y, dir,Constantes.TAILLE_POULE,Constantes.VITESSE_POULE, Constantes.WIDTH_VIVARIUM, Constantes.HEIGHT_VIVARIUM,Constantes.CONSOMAIR_POULE);
        nom = "Poule"+idProi;
        this.circle.setRadius(Constantes.TAILLE_POULE);
        this.setImage(Constantes.IMAGE_POULE);
        //this.circle.setFill(Color.BLUE);
    }
    
   
    
    @Override
    public String getType(){
        return "Proie";
    }
    
   @Override
    public String toString(){
        return nom;
    }
   
}
