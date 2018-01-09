/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import vivariumview.Constantes;

/**
 *
 * @author bonbo
 */
public class Obstacle extends Circle {
    private int idObst,x,y,tailleO,longueur,largeur;
    
    public Obstacle(int idObst,int x,int y,int longueur,int largeur){
        this.idObst = idObst;
        this.x = x;
        this.y = y;
        this.tailleO = Constantes.TAILLE_OBSTACLE;
        this.longueur = longueur;
        this.largeur = largeur;
        setCenterX(x);
        setCenterY(y);
        setRadius(tailleO);
        
        try {
            InputStream inputStream = Files.newInputStream(Paths.get(Constantes.IMAGE_OBSTACLE));
            Image backgroundImage = new Image(inputStream);
            inputStream.close();
            
            setFill(new ImagePattern(backgroundImage));
        } catch (Exception e) {}
    }
    
    @Override
    public String toString(){
        return "Obstacle"+idObst;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @return the longueur
     */
    public int getLongueur() {
        return longueur;
    }

    /**
     * @return the largeur
     */
    public int getLargeur() {
        return largeur;
    }

    /**
     * @return the tailleO
     */
    public int getTailleO() {
        return tailleO;
    }

    /**
     * @param tailleO the tailleO to set
     */
    public void setTailleO(int tailleO) {
        this.tailleO = tailleO;
    }
}
