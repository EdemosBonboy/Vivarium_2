/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 *
 * @author bonbo
 */
public class Point extends Circle {
    public Point() {
        setCenterX(0);
        setCenterY(0);
    }
    
    public Point(double x, double y, Color c) {
        this.setCenterX(x);
        this.setCenterY(y);
        this.setRadius(20);
        this.setFill(c);
    }
}
