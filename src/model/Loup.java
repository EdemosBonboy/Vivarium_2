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
public class Loup extends Predateur{
    
    private final String nom;
    public Loup(int id, int x, int y, int dir) {
        super(id, x, y, dir,Constantes.TAILLE_LOUP,Constantes.VITESSE_LOUP, Constantes.WIDTH_VIVARIUM, Constantes.HEIGHT_VIVARIUM, Constantes.CONSOMAIR_LOUP);
        nom = "Loup"+id;
        this.circle.setRadius(Constantes.TAILLE_LOUP);
        this.setImage(Constantes.IMAGE_LOUP);
        //this.circle.setFill(Color.YELLOW);
    }
    
    @Override
    public String getType(){
        return "Predateur";
    }
    
   @Override
    public String toString(){
        return nom;
    }
    
}
