/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author bonbo
 */
public class Nourriture {
    
    Vecteur positionN;
    private int tailleN;
    
    public Nourriture(int x, int y){
        positionN = new Vecteur(x, y);
    }

    public Vecteur getPositionN() {
        return positionN;
    }

    public void setPosition(Vecteur position) {
        this.positionN = position;
    }

    /**
     * @return the tailleN
     */
    public int getTailleN() {
        return tailleN;
    }

    /**
     * @param tailleN the tailleN to set
     */
    public void setTailleN(int tailleN) {
        this.tailleN = tailleN;
    }

    
}
