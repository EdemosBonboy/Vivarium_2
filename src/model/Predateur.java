/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javafx.scene.paint.Color;
import vivariumview.Utils;

/**
 *
 * @author bonbo
 */
//qui peut manger les proies
public class Predateur extends Animal {
    private String nom;
    
    public Predateur(int id, int x,int y,int dir,int longueur, int largeur) {
        super(x,y,dir,Utils.TAILLE_PROIE,Utils.VITESSE_PROIE,longueur,largeur,Utils.CONSOMAIR_PROIE);  //4eme param est la taille, 5eme param est la vitesse
        nom = "Predateur"+id;
        this.circle.setRadius(Utils.TAILLE_PREDATEUR);
        this.circle.setFill(Color.RED);
    }
    
    //manger un proie
    void manger(Proie pr){
        pr.remove();
    }
    
    @Override
    public String getType(){
        return "Predateur";
    }
    
    @Override
    public String toString(){
        return nom;
    }
    
     /*public int getNiveauFaim() {
        return niveauFaim;  
    }
    public void setNiveauFaim(int niveauFaim) {
        this.niveauFaim = niveauFaim;
    }*/
    
    
    
    /*public void augmenterFaim(){
    // s'il mange
    
    }
    
    public void diminuerFaim(){
        // au bout d'une minute faim diminue
    
    }
    */
}
