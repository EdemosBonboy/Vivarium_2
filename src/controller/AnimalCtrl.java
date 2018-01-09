/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Animal;
import vivariumview.Constantes;
import model.Nourriture;

/**
 *
 * @author bonbo
 */
public class AnimalCtrl {
    public void move(Animal a){
        switch (a.getDir()) {
        case Constantes.left_up:
            //x-=vitesse;
            a.setX(a.getX()-a.getVitesse());
            //y-=vitesse;
            a.setY(a.getY()-a.getVitesse());
            if(a.getX()<=0)a.setDir(Constantes.right_up);
            else if(a.getY()<=0)a.setDir(Constantes.left_down);
            //System.out.println("Je bouge left_up");
            break;
        case Constantes.right_up:
            //x+=vitesse;
            a.setX(a.getX()+a.getVitesse());
            //y-=vitesse;
            a.setY(a.getY()-a.getVitesse());
            if(a.getX()>=a.getLargeur()-a.getTaille())a.setDir(Constantes.left_up);
            else if(a.getY()<=0)a.setDir(Constantes.right_down);
            //System.out.println("Je bouge right_up");
            break;
        case Constantes.left_down:  
            //x-=vitesse;
            a.setX(a.getX()-a.getVitesse());
            //y+=vitesse;
            a.setY(a.getY()+a.getVitesse());
            if(a.getX()<=0)a.setDir(Constantes.right_down);
            else if(a.getY()>=a.getLongueur()-a.getTaille())a.setDir(Constantes.left_up);
            //System.out.println("Je bouge left_down");
            break;
        case Constantes.right_down:
            //x+=vitesse;
            a.setX(a.getX()+a.getVitesse());
            //y+=vitesse;
            a.setY(a.getY()+a.getVitesse());
            if(a.getX()>=a.getLargeur()-a.getTaille())a.setDir(Constantes.left_down);
            else if(a.getY()>=a.getLongueur()-a.getTaille())a.setDir(Constantes.right_up);
            //System.out.println("Je bouge right_down");
            break;
        }
    }
    
    public void mangeNourriture(Animal a, Nourriture n){
        RencontreCtrl rc = new RencontreCtrl();
        rc.nourdestroy(a, n);
    }
}
