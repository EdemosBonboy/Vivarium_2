/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import vivariumview.Utils;

/**
 *
 * @author bonbo
 */
public class Right extends VBox {
    private RightGridPane gridPane;
    private Button btnObstacle, btnLancer;
    
    public Right() {
        gridPane = new RightGridPane();
        btnObstacle = new Button(Utils.BTN_OBSTACLE_TEXT);
        btnLancer = new Button(Utils.BTN_LANCER_TEXT);
        
        setSpacing(10);
        setPadding(new Insets(5, 5, 5, 5));
        setStyle("-fx-background-color: #cecece;");
        setPrefWidth(Utils.RIGHT_WIDTH);
        setAlignment(Pos.TOP_CENTER);
        
        getChildren().addAll(gridPane, btnObstacle, btnLancer);
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
}
