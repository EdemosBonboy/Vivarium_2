/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import vivariumview.Constantes;

/**
 *
 * @author bonbo
 */
public abstract class Animal {
    
    protected Circle circle;
    Random r = new Random();
    
    //Vecteur position;
    int id;
    int x,y,dir,vitesse,taille,longueur,largeur;    //(x,y) - position de l'animal, (longueur,largeur) - espece de vivarium
    int consomAir;
    int niveauFaim;
    String image;
    
    
    public Animal(int id, int x,int y,int dir,int taille,int vitesse,int longueurVivarium,int largeurVivarium,int consomAir) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.dir = dir;
        this.taille = taille;
        this.vitesse = vitesse;
        this.longueur = longueurVivarium;
        this.largeur = largeurVivarium;
        this.consomAir = consomAir;
        this.niveauFaim = 0;
        circle = new Circle(x, y, 0);
    }
    
    public void move(){                      //deplacement
        switch (this.dir) {
            case Constantes.left_up:
                x-=vitesse;y-=vitesse;
                if(x<=0)dir=Constantes.right_up;
                else if(y<=0)dir=Constantes.left_down;
                System.out.println("Je bouge left_up");
                break;
            case Constantes.right_up:
                x+=vitesse;y-=vitesse;
                if(x>=largeur-taille)dir=Constantes.left_up;
                else if(y<=0)dir=Constantes.right_down;
                System.out.println("Je bouge right_up");
                break;
            case Constantes.left_down:  
                x-=vitesse;y+=vitesse;
                if(x<=0)dir=Constantes.right_down;
                else if(y>=longueur-taille)dir=Constantes.left_up;
                System.out.println("Je bouge left_down");
                break;
            case Constantes.right_down:
                x+=vitesse;y+=vitesse;
                if(x>=largeur-taille)dir=Constantes.left_down;
                else if(y>=longueur-taille)dir=Constantes.right_up;
                System.out.println("Je bouge right_down");
                break;
            default:
                x+=vitesse;y+=vitesse;
                if(x>=largeur-taille)dir=Constantes.left_down;
                else if(y>=longueur-taille)dir=Constantes.right_up;
                System.out.println("Je bouge right_down");
                break;
        }
        //randomMoveNoise();
        circle.setCenterX(x);
        circle.setCenterY(y);
    }
    
    private void randomMoveNoise() {
        //make slight turns while moving to create a more live like motion
	double noise = randomNegative(r.nextDouble());
			
	dir += noise;
    }
    
    private double randomNegative(double number) {
	//randomly make a number its negative value
	switch(r.nextInt(2)) {
            case 1:
                number = -number;
		break;
	}
		
        return number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNiveauFaim() {
        return niveauFaim;
    }

    public void setNiveauFaim(int niveauFaim) {
        this.niveauFaim = niveauFaim;
    }
    
    public abstract String getType();
    
    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public int getConsomAir() {
        return consomAir;
    }

    public void setConsomAir(int consomAir) {
        this.consomAir = consomAir;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    /**
     * @return the dir
     */
    public int getDir() {
        return dir;
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
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @param dir the dir to set
     */
    public void setDir(int dir) {
        this.dir = dir;
    }

    public Circle getCircle() {
        return circle;
    }
    
    public void setImage(String url) {
        try {
            InputStream inputStream = Files.newInputStream(Paths.get(url));
            Image backgroundImage = new Image(inputStream);
            inputStream.close();
            
            circle.setFill(new ImagePattern(backgroundImage));
        } catch (Exception e) {}
    }
}
