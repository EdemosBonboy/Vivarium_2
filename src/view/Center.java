/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import vivariumview.Constantes;

/**
 *
 * @author bonbo
 */
public class Center extends Pane {
    
    private double largeur, hauteur;
    
    public Center() {
        try {
            setWidth(Constantes.CENTER_WIDTH);
            setHeight(Constantes.CENTER_HEIGHT);
            InputStream inputStream = Files.newInputStream(Paths.get("res/images/herbes_2.jpg"));
            Image backgroundImage = new Image(inputStream);
            inputStream.close();
            
            ImageView backgroundView = new ImageView(backgroundImage);
            backgroundView.setFitWidth(getWidth());
            backgroundView.setFitHeight(getHeight());
            getChildren().addAll(backgroundView);
        } catch (Exception e) {}
    }
}
