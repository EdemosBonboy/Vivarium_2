/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vivariumview;

import controller.CenterPaneController;
import controller.RightController;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import view.FenVivarium;

/**
 *
 * @author bonbo
 */
public class VivariumView extends Application {
    
    private FenVivarium fen;
    private CenterPaneController centerPaneController;
    private RightController rightController;
    
    @Override
    public void start(Stage primaryStage) {
        fen = new FenVivarium();
        fen.init();
        
        // Enregistrer les clicks sur le centre
        centerPaneController = new CenterPaneController(fen.getCenter());
        fen.getCenter().addEventHandler(MouseEvent.MOUSE_CLICKED, centerPaneController);
        fen.getCenter().addEventHandler(MouseEvent.MOUSE_ENTERED, centerPaneController);
        
        // Enregistrer les clicks sur les boutons de droite
        rightController = new RightController(fen.getRight(), fen.getCenter());
        fen.getRight().getGridPane().getBtnLion().setOnAction(rightController);
        fen.getRight().getGridPane().getBtnLoup().setOnAction(rightController);
        fen.getRight().getGridPane().getBtnLapin().setOnAction(rightController);
        fen.getRight().getGridPane().getBtnPoule().setOnAction(rightController);
        fen.getRight().getBtnObstacle().setOnAction(rightController);
        fen.getRight().getBtnLancer().setOnAction(rightController);
    }

    @Override
    public void stop() throws Exception {
        if (centerPaneController != null) {
            fen.getCenter().removeEventHandler(MouseEvent.MOUSE_CLICKED, centerPaneController);
            fen.getCenter().removeEventHandler(MouseEvent.MOUSE_ENTERED, centerPaneController);
        }
        super.stop();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
