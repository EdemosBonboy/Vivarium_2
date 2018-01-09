/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vivariumview;

import javafx.scene.paint.Color;

/**
 *
 * @author bonbo
 */
public class Constantes {
    public static String TITRE = "VIVARIUM 2.0";
    public static String BTN_LION_TEXT = "AJOUTER LION";
    public static String BTN_LOUP_TEXT = "AJOUTER LOUP";
    public static String BTN_LAPIN_TEXT = "AJOUTER LAPIN";
    public static String BTN_POULE_TEXT = "AJOUTER POULE";
    public static String BTN_OBSTACLE_TEXT = "AJOUTER OBSTACLE";
    public static String BTN_LANCER_TEXT = "LANCER LE JEU";
    public static String BTN_VIDER_TEXT = "VIDER LE VIVARIUM";
    
    public static double RIGHT_WIDTH = 300.;
    public static double CENTER_WIDTH = 1060.;
    public static double CENTER_HEIGHT = 670.;
    
    public static int PROIE_RADIUS = 10;
    public static int PREDATEUR_RADIUS = 10;
    public static int OBSTACLE_RADIUS = 10;
    
    public final static int VITESSE_PROIE = 3;
    public final static int VITESSE_PREDATEUR = 5;
    public final static int CONSOMAIR_PROIE = 4;
    public final static int CONSOMAIR_PREDATEUR  = 5;
    public final static int VITESSE_LAPIN = 5;
    public final static int VITESSE_LOUP = 5;
    public final static int VITESSE_POULE = 5;
    public final static int VITESSE_LION = 5;
    
    //public final static int HEIGHT_VIVARIUM = 500;
    //public final static int WIDTH_VIVARIUM = 300;
    public final static int HEIGHT_VIVARIUM = 1060;
    public final static int WIDTH_VIVARIUM = 670;
    
    public final static int TAILLE_PREDATEUR = 15;
    public final static int TAILLE_PROIE = 10;
    public final static int TAILLE_OBSTACLE = 12;
    
    //orientation de deplacement
    public final static int left_up=0,right_up=1,left_down=2,right_down=3;
    
    public final static int CONSOMAIR_POULE  = 5;
    public final static int CONSOMAIR_LAPIN  = 5;
    public final static int CONSOMAIR_LION  = 5;
    public final static int CONSOMAIR_LOUP  = 5;
    
    public final static int TAILLE_LION = 35;
    public final static int TAILLE_LOUP = 35;
    
    public final static int TAILLE_LAPIN = 30;
    public final static int TAILLE_POULE = 30;
    
    public final static double RADIUS_NOUR = 10;
    public final static Color COLOR_NOUR = Color.GREENYELLOW; 
    
    public final static int LONGUEUR_PROIE = 20;
    public final static int LONGUEUR_LION = 10;
    public final static int LONGUEUR_LOUP = 6;
   
    public final static int LONGUEUR_PREDATEUR = 20;
    public final static int LONGUEUR_LAPIN = 10;
    public final static int LONGUEUR_POULE = 6;
    
    public final static int LARGEUR_PREDATEUR = 20;
    public final static int LARGEUR_LAPIN = 10;
    public final static int LARGEUR_POULE = 6;
        
    public final static int LARGEUR_PROIE = 20;
    public final static int LARGUEUR_LION = 10;
    public final static int LARGUEUR_LOUP = 6;
    
    public final static int LONGUEUR_OBSTACLE = 20;
    public final static int LARGEUR_OBSTACLE = 20;
    
    
    public final static int NIVEAU_FAIM_MAX= 50;
    
    public final static int NIVEAU_FAIM_MAX_POULE= 20;
    public final static int NIVEAU_FAIM_MAX_LAPIN= 30;
    public final static int NIVEAU_FAIM_MAX_LION= 50;
    public final static int NIVEAU_FAIM_MAX_LOUP= 30;
    
    public final static int NIVEAU_AIR_MAX_VIVA = 200;
    
    public final static String IMAGE_LION = "res/images/lion.png";
    public final static String IMAGE_LOUP = "res/images/loup.png";
    public final static String IMAGE_LAPIN = "res/images/lapin.png";
    public final static String IMAGE_POULE = "res/images/poule.png";
    public final static String IMAGE_OBSTACLE = "res/images/rocher1.png";
}
