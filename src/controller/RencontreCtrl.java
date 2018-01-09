/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Animal;
import vivariumview.Constantes;
import model.Nourriture;
import model.Obstacle;

/**
 *
 * @author bonbo
 */
public class RencontreCtrl {
    //verifier la destruction de l'animal
    public boolean animdestroy(Animal a,Animal b){         //verifier si les deux animaux sont rencontrer
        //nous pouvons aussi utiliser if(a==b)
        if(a.getType().equals(b.getType())) return false;      //si tous les deux sont meme predateur ou meme proie, il ne detruit pas
        
        int x1=a.getX()+a.getTaille()/2;
        int y1=a.getY()+a.getTaille()/2;
        int x2=b.getX()+b.getTaille()/2;
        int y2=b.getY()+b.getTaille()/2;
        double dis= Math.sqrt( (x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        if(dis<=a.getTaille()/2+b.getTaille()/2)return true;
        return false;
    }
    
    //veriier la destruction de nourriture
    public boolean nourdestroy(Animal a, Nourriture n){
        int x1=a.getX()+a.getTaille()/2;
        int y1=a.getY()+a.getTaille()/2;
        double x2=n.getPositionN().getAbscisse()+n.getTailleN()/2;
        double y2=n.getPositionN().getOrdonnee()+n.getTailleN()/2;
        double dis= Math.sqrt( (x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        if(dis<=a.getTaille()/2+n.getTailleN()/2) return true;
        return false;
    }
    
    public void animRobst(Animal a,Obstacle b){               //两球相碰反弹  并没有调用它  
        int x1=a.getX()+a.getTaille()/2;  
        int y1=a.getY()+a.getTaille()/2;  
        int x2=b.getX()+b.getTailleO()/2;
        int y2=b.getY()+b.getTailleO()/2;  
          
        double dis= Math.sqrt( (x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));  
        if(dis<=a.getTaille()/2+b.getTailleO()/2){
            switch (a.getDir()) {
            case Constantes.left_up:
                a.setDir(Constantes.right_down);
                //System.out.println("Change : right_down");
                break;
            case Constantes.left_down:
                a.setDir(Constantes.right_up);
                //System.out.println("Change : left_down");
                break;
            case Constantes.right_up:
                a.setDir(Constantes.left_down);
                //System.out.println("Change : right_up");
                break;
            case Constantes.right_down:
                a.setDir(Constantes.left_up);
                //System.out.println("Change : left_up");
                break;
            }
        }  
    }
    
    public void animRanim(Animal a,Animal b){               //两球相碰反弹  并没有调用它  
        int x1=a.getX()+a.getTaille()/2;  
        int y1=a.getY()+a.getTaille()/2;  
        int x2=b.getX()+b.getTaille()/2;  
        int y2=b.getY()+b.getTaille()/2;  
          
        double dis= Math.sqrt( (x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));  
        if((dis<=a.getTaille()/2+b.getTaille()/2+5) && (!a.getType().equals(b.getType()))){
            //si a est proie, a echape
            if(a.getType().equals("Proie")){
                switch (a.getDir()) {
                    case Constantes.left_up:
                        a.setDir(Constantes.right_down);
                        System.out.println(a.toString()+" change : right_down");
                    break;
                    case Constantes.left_down:
                        a.setDir(Constantes.right_up);
                        System.out.println(a.toString()+" change : left_down");
                    break;
                    case Constantes.right_up:
                        a.setDir(Constantes.left_down);
                        System.out.println(a.toString()+ " change : right_up");
                    break;
                    case Constantes.right_down:
                        a.setDir(Constantes.left_up);
                        System.out.println(a.toString()+" change : left_up");
                    break;  
                }
            } else {    //si b est proie, b echape
                switch (b.getDir()) {  
                    case Constantes.left_up:
                        b.setDir(Constantes.right_down);
                        System.out.println(b.toString()+" change : right_down");
                    break;
                    case Constantes.left_down:
                        b.setDir(Constantes.right_up);
                        System.out.println(b.toString()+" change : left_down");
                    break;
                    case Constantes.right_up:
                        b.setDir(Constantes.left_down);
                        System.out.println(b.toString()+" change : right_up");
                    break;
                    case Constantes.right_down:
                        b.setDir(Constantes.left_up);
                        System.out.println(b.toString()+" change : left_up");
                    break;
                }
            }
        }  
    }
}
