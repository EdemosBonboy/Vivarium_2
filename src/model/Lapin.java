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
public class Lapin extends Proie{
   
    private String nom;
    
    public Lapin(int idProi, int x, int y, int dir) {
        super(idProi, x, y, dir,Constantes.TAILLE_LAPIN,Constantes.VITESSE_LAPIN,Constantes.WIDTH_VIVARIUM, Constantes.HEIGHT_VIVARIUM,Constantes.CONSOMAIR_LAPIN);
        nom = "Lapin"+idProi;
        this.circle.setRadius(Constantes.TAILLE_LAPIN);
        this.setImage(Constantes.IMAGE_LAPIN);

        //this.circle.setFill(Color.VIOLET);
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
