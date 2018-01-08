/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.RencontreCtrl;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.shape.Circle;

/**
 *
 * @author bonbo
 */
public class Vivarium {
    private int longueur, largeur, nbPred, nbProi, nbObst;
    private int quantAir;
    
    public Vivarium(int longueur, int largeur){
        //taille de vivarium - a modifier (taille de la fenetre)
        this.longueur = longueur;
        this.largeur = largeur;
        nbPred = 0;
        nbProi = 0;
    }
    
   
     //ajouter aleatoirement les nourritures - quand jeu est lance
    
    /*Timeline loop = new Timeline(new KeyFrame(Duration.millis(40), new EventHandler<ActionEvent>() {
           
                    @Override
                    public void handle(ActionEvent actionEvent) {
                       
                        
                    }
                })
        );
        loop.setCycleCount(Timeline.INDEFINITE);
        loop.play(); */        

    /**
     * @return the longueur
     */
    public int getLongueur() {
        return longueur;
    }

    /**
     * @param longueur the longueur to set
     */
    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    /**
     * @return the largeur
     */
    public int getLargeur() {
        return largeur;
    }

    /**
     * @param largeur the largeur to set
     */
    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    /**
     * @return the nbPred
     */
    public int getNbPred() {
        return nbPred;
    }

    /**
     * @return the nbProi
     */
    public int getNbProi() {
        return nbProi;
    }

    /**
     * @return the nbObst
     */
    public int getNbObst() {
        return nbObst;
    }

    /**
     * @return the quantAir
     */
    public int getQuantAir() {
        return quantAir;
    }

    /**
     * @param nbPred the nbPred to set
     */
    public void setNbPred(int nbPred) {
        this.nbPred = nbPred;
    }

    /**
     * @param nbProi the nbProi to set
     */
    public void setNbProi(int nbProi) {
        this.nbProi = nbProi;
    }

    /**
     * @param nbObst the nbObst to set
     */
    public void setNbObst(int nbObst) {
        this.nbObst = nbObst;
    }

    /**
     * @param quantAir the quantAir to set
     */
    public void setQuantAir(int quantAir) {
        this.quantAir = quantAir;
    }
}
