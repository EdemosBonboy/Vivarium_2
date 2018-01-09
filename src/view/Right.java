/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import vivariumview.Constantes;

/**
 *
 * @author bonbo
 */
public class Right extends VBox {
    private RightGridPane gridPane;
    private Button btnObstacle, btnLancer, btnVider;
    private Label lbNbPredateurs, lbNbProies;
    
    public Right() {
        gridPane = new RightGridPane();
        btnObstacle = new Button(Constantes.BTN_OBSTACLE_TEXT);
        btnLancer = new Button(Constantes.BTN_LANCER_TEXT);
        btnVider = new Button(Constantes.BTN_VIDER_TEXT);
        lbNbPredateurs = new Label("PREDATEURS : "+Integer.toString(0));
        lbNbProies = new Label("PROIES : " + Integer.toString(0));
        
        setSpacing(10);
        setPadding(new Insets(15, 15, 15, 15));
        setStyle("-fx-background-color: #ffffff;");
        setPrefWidth(Constantes.RIGHT_WIDTH);
        setAlignment(Pos.TOP_CENTER);
        
        getChildren().addAll(gridPane, btnObstacle, btnLancer, btnVider, lbNbPredateurs, lbNbProies);
    }

    public RightGridPane getGridPane() {
        return gridPane;
    }

    public Button getBtnObstacle() {
        return btnObstacle;
    }

    public Button getBtnLancer() {
        return btnLancer;
    }

    public Label getLbNbPredateurs() {
        return lbNbPredateurs;
    }

    public Label getLbNbProies() {
        return lbNbProies;
    }

    public Button getBtnVider() {
        return btnVider;
    }
}
