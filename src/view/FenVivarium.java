/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Screen;
import javafx.stage.Stage;
import vivariumview.Constantes;

/**
 *
 * @author bonbo
 */
public class FenVivarium extends Stage {
    private BorderPane root;
    
    private Top top = new Top();
    private Bottom bottom = new Bottom();
    private Right right = new Right();
    private Center center = new Center();
    
    public void init() {
        setTitle(Constantes.TITRE);
        //setWidth(1200);
        //setHeight(600);
        setWidth(Screen.getPrimary().getBounds().getWidth());
        setHeight(Screen.getPrimary().getBounds().getHeight());
        setResizable(false);
        
        root = new BorderPane();
        root.setTop(top);
        root.setBottom(bottom);
        root.setRight(right);
        root.setCenter(center);
        
        System.out.println("WIDTH : " + getWidth());
        System.out.println("HEIGHT : " + getHeight());
        
        Scene scene = new Scene(root);
        setScene(scene);
        show();
    }

    public BorderPane getRoot() {
        return root;
    }

    public Top getTop() {
        return top;
    }

    public Bottom getBottom() {
        return bottom;
    }

    public Right getRight() {
        return right;
    }

    public Center getCenter() {
        return center;
    }
    
    
}
