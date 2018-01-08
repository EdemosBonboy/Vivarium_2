/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

/**
 *
 * @author bonbo
 */
public class Top extends HBox {
    private Button button;
    
    public Top() {
        button = new Button("Button Top");
        setPadding(new Insets(5, 5, 5, 5));
        setSpacing(10);
        setStyle("-fx-background-color: #336699;");
        getChildren().add(button);
    }
}
