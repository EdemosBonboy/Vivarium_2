/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import vivariumview.Utils;

/**
 *
 * @author bonbo
 */
public class RightGridPane extends GridPane {
    private Button btnLion, btnLoup, btnLapin, btnPoule;
    
    public RightGridPane() {
        btnLion = new Button(Utils.BTN_LION_TEXT);
        btnLoup = new Button(Utils.BTN_LOUP_TEXT);
        btnLapin = new Button(Utils.BTN_LAPIN_TEXT);
        btnPoule = new Button(Utils.BTN_POULE_TEXT);
        
        setAlignment(Pos.CENTER);
        setHgap(10);
        setVgap(10);
        setPadding(new Insets(5, 5, 5, 5));
        add(btnLion, 0, 0);
        add(btnLoup, 1, 0);
        add(btnLapin, 0, 1);
        add(btnPoule, 1, 1);
        setStyle("-fx-background-color: #F44336;");
    }

    public Button getBtnLion() {
        return btnLion;
    }

    public Button getBtnLoup() {
        return btnLoup;
    }

    public Button getBtnLapin() {
        return btnLapin;
    }

    public Button getBtnPoule() {
        return btnPoule;
    }
}
