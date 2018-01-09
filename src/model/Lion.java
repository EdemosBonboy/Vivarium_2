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
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import vivariumview.Constantes;

/**
 *
 * @author ornei
 */
public class Lion extends Predateur {
  
     private String nom;
     
    public Lion(int id, int x, int y, int dir) {
       super(id, x, y, dir, Constantes.TAILLE_LION,Constantes.VITESSE_LION, Constantes.WIDTH_VIVARIUM, Constantes.HEIGHT_VIVARIUM, Constantes.CONSOMAIR_LION);
       nom = "Lion"+id;
       this.circle.setRadius(Constantes.TAILLE_LION);
       this.setImage(Constantes.IMAGE_LION);
       //this.circle.setFill(Color.RED);
       
       /*try {
            InputStream inputStream = Files.newInputStream(Paths.get("res/images/lion.png"));
            Image backgroundImage = new Image(inputStream);
            inputStream.close();
            
            circle.setFill(new ImagePattern(backgroundImage));
        } catch (Exception e) {}*/
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
