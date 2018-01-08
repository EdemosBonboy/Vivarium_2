/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.input.MouseEvent;
import view.Center;

/**
 *
 * @author bonbo
 */
public class CenterPaneController implements EventHandler<MouseEvent> {

    private Center centerPane;
    
    public CenterPaneController(Center c) {
        centerPane = c;
    }

    @Override
    public void handle(MouseEvent event) {
        switch (event.getButton()) {
            case PRIMARY:
                System.out.println("CENTER CLICK !!!");
                break;
        }
        
        if (event.getEventType() == MouseEvent.MOUSE_ENTERED) {
            centerPane.setCursor(Cursor.HAND);
        }
    }
}
