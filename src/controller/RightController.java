/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import model.Animal;
import model.Nourriture;
import model.Obstacle;
import model.Point;
import model.Predateur;
import model.Proie;
import view.Center;
import view.Right;
import vivariumview.Utils;
/**
 *
 * @author bonbo
 */
public class RightController implements EventHandler<ActionEvent> {

    private Right right;
    private Center center;
    
    //////////////////////////////////////////
    private int nbPred, nbProi, nbObst;
    private List<Animal> listAnim = new ArrayList<>();
    private List<Obstacle> listObst = new ArrayList<>();
    private List<Nourriture> listNour = new ArrayList<>();
    private List<Circle> listCircles = new ArrayList<>();
    
    public RightController(Right r) {
        right = r;
    }
    
    public RightController(Right r, Center c) {
        right = r;
        center = c;
    }
    
    private Point genererPointAleatoire(Color c) {
        Random r = new Random();
        double x = r.nextDouble()*1000 + 100;
        double y = r.nextDouble()*1000 + 100;
        return new Point(x, y, c);
    }
    
    @Override
    public void handle(ActionEvent event) {
        if (event.getSource() == right.getGridPane().getBtnLion()) {
            //System.out.println("BTN LION CLICK");
            //center.getChildren().add(genererPointAleatoire(Color.RED));
            ajouter(2);
        }
        if (event.getSource() == right.getGridPane().getBtnLoup()) {
            System.out.println("BTN LOUP CLICK");
            center.getChildren().add(genererPointAleatoire(Color.GREEN));
        }
        if (event.getSource() == right.getGridPane().getBtnLapin()) {
            //System.out.println("BTN LAPIN CLICK");
            //center.getChildren().add(genererPointAleatoire(Color.BLUE));
            ajouter(3);
        }
        if (event.getSource() == right.getGridPane().getBtnPoule()) {
            System.out.println("BTN POULE CLICK");
            center.getChildren().add(genererPointAleatoire(Color.WHITE));
        }
        if (event.getSource() == right.getBtnObstacle()) {
            //System.out.println("BTN OBSTACLE CLICK");
            //center.getChildren().add(genererPointAleatoire(Color.BLACK));
            ajouter(1);
        }
        if (event.getSource() == right.getBtnLancer()) {
            run_run();
        }
    }
    
    ////////////////////////////////////////////////////////////////////
    
    //ajouter les animaux
    public void ajouter(int choix){     //obtenir la valeur venant de boutton
        //position aleatoire
        int x=(int) (Math.random()*700);    //position x
        int y=(int) (Math.random()*500);    //position y
        int dir=(int) (Math.random()*4);    //orientation de deplacement
        
        switch(choix){
            case 1:
                System.out.println("Ajouter Obstacle");
                Obstacle o = new Obstacle(nbObst,x,y,(int)Utils.CENTER_HEIGHT,(int)Utils.CENTER_WIDTH);
                center.getChildren().add(o);
                nbObst++;
                listObst.add(o);
                listCircles.add(o);
            break;
            //ajouter un predateur
            case 2:
                System.out.println("Ajouter Predateur");
                Predateur p = new Predateur(nbPred,x,y,dir,(int)Utils.CENTER_HEIGHT,(int)Utils.CENTER_WIDTH);
                //circle = new Circle(p.getX(), p.getY(), 10, Color.RED);
                center.getChildren().add(p.getCircle());
                nbPred++;
                listAnim.add(p);
                listCircles.add(p.getCircle());
            break;
            //ajouter un proie
            case 3:
                System.out.println("Ajouter Proie");
                Proie proie = new Proie(nbProi,x,y,dir,(int)Utils.CENTER_HEIGHT,(int)Utils.CENTER_WIDTH);
                center.getChildren().add(proie.getCircle());
                nbProi++;
                listAnim.add(proie);
                listCircles.add(proie.getCircle());
            break;
        }
    }
    
    public void run_run(){  
        new Thread(){  
            @Override
            public void run(){
                int n = 0;
                while(n < 500){  
                    for(int i=0;i<listAnim.size();i++){               //tous les animaux se deplacent
                        Animal b=listAnim.get(i);
                        b.move();
                    }  
                    for(int i=0;i<listAnim.size();i++){           //verifier si les deux sont rencontres
                        Animal b1=listAnim.get(i);
                        for(int j=i+1;j<listAnim.size();j++){
                            Animal b2=listAnim.get(j);
                            RencontreCtrl bab=new RencontreCtrl();
                            if(bab.animdestroy(b1, b2)){        //se rencontrent
                                nbProi--;
                                if(b1.getType() == "Predateur"){       //si b1 est predateur, b2 est mange par b1
                                    listAnim.remove(j);
                                    listCircles.get(j).setVisible(false);
                                    listCircles.remove(j);
                                    System.out.println("1_REMOOOOOOOOOOOOOVE");
                                    break;
                                }  
                                else if(b1.getType() == "Proie"){ 
                                    listAnim.remove(i);
                                    listCircles.get(i).setVisible(false);
                                    listCircles.remove(i);
                                    System.out.println("2_REMOOOOOOOOOOOOOOVE");
                                    break;  
                                }  
                            }
                        }  
                    }  
                    //repaint();                        //mettre en oevure sur le vue paint()  
                    try {  
                        Thread.sleep(30);            //mettre en pause
                    } catch (InterruptedException e) {  
                        e.printStackTrace();  
                    }
                    n++;
                }
            }
        }.start();
    }
}
