/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Animal;
import model.Nourriture;
import model.Obstacle;
import model.Predateur;
import model.Proie;
import model.Vivarium;

/**
 *
 * @author bonbo
 */
public class VivariumCtrl {
    private List<Animal> listAnim = new ArrayList<Animal>();
    private List<Obstacle> listObst = new ArrayList<Obstacle>();
    private List<Nourriture> listNour = new ArrayList<Nourriture>();
    
    private AnimalCtrl ac = new AnimalCtrl();
    
    //lancer le vivarium
    public void lanceViva(Vivarium v){
        new Thread(){  
            @Override
            public void run(){
                while(true){
                    for(int i=1;i<listAnim.size();i++){               //tous les animaux se deplacent
                        Animal b=listAnim.get(i);
                        ac.move(b);
                    }
                    //verifier le rencontre de deux animaux
                    for(int i=0;i<listAnim.size()-1;i++){
                        Animal b1=listAnim.get(i);
                        
                        //verifier le rencontre d'un animal et un obstacle
                        for(int k=0;k<listObst.size();k++){
                            Obstacle obs=listObst.get(k);
                            RencontreCtrl bab=new RencontreCtrl();
                            bab.animRobst(b1, obs);
                        }
                        
                        for(int j=i+1;j<listAnim.size();j++){
                            Animal b2=listAnim.get(j);
                            
                            RencontreCtrl bab=new RencontreCtrl();
                            bab.animRanim(b1, b2);
                            if(bab.animdestroy(b1, b2)){        //se rencontrent
                                //nbProi--;
                                v.setNbProi(v.getNbProi()-1);
                                if(b1.getType() == "Predateur"){       //si b1 est predateur, b2 est mange par b1
                                    System.out.println(b1.toString()+" mange "+b2.toString());
                                    listAnim.remove(j);
                                    break;  
                                }  
                                else if(b1.getType() == "Proie"){
                                    System.out.println(b2.toString()+" mange "+b1.toString());
                                    listAnim.remove(i);
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
                }  
            }
        }.start();
    }
    
    //ajouter les objets
    /*public void ajouter(Vivarium v,int choix){     //obtenir la valeur venant de boutton
        
        //position aleatoire
        int x=(int) (Math.random()*700);    //position x
        int y=(int) (Math.random()*500);    //position y
        int dir=(int) (Math.random()*4);    //orientation de deplacement
        
        switch(choix){
            case 1:
                System.out.println("Ajouter Obstacle");
                //nbObst++;
                v.setNbObst(v.getNbObst()+1);
                listObst.add(new Obstacle(v.getNbObst(),x,y,v.getLongueur(), v.getLargeur()));
            break;
            //ajouter un predateur
            case 2:
                System.out.println("Ajouter Predateur");
                //nbPred++;
                v.setNbPred(v.getNbPred()+1);
                listAnim.add(new Predateur(v.getNbPred(),x,y,dir, v.getLongueur(), v.getLargeur()));
            break;
            //ajouter un proie
            case 3:
                System.out.println("Ajouter Proie");
                //nbProi++;
                v.setNbProi(v.getNbProi()+1);
                listAnim.add(new Proie(v.getNbProi(),x,y,dir, v.getLongueur(), v.getLargeur()));
            break;
        }
    }*/
    
    @Override
    public String toString(){
        String s = "Vivarium :\n  Animal:";
        for(Animal anim : listAnim){
            s += anim.toString()+" ";
        }
        s+="\n  Obstacle:";
        for(Obstacle obst : listObst){
            s += obst.toString()+" ";
        }
        return s;
    }
}
