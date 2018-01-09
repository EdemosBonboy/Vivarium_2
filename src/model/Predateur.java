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
 * @author bonbo
 */
//qui peut manger les proies
public class Predateur extends Animal {
    private String nom;
    
    public Predateur(int id, int x,int y,int dir, int taille, int vitesse, int longueur, int largeur, int consoAir) {
        super(id, x, y,dir,taille,vitesse,longueur,largeur,consoAir);  //4eme param est la taille, 5eme param est la vitesse
        nom = "Predateur"+id;
    }
    
    //manger une proie
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
