package fr.popelier.sarah.dungeons.and.balthromaw.ui;

import javax.swing.*;


import fr.popelier.sarah.dungeons.and.balthromaw.ui.Menu;
import javax.swing.*;


/**
 * représente une carte de personnage affichée à l'écran
 * permet à l'utilisateur de visualiser une image et de modifier le nom
 */
    public class CharacterCard {

    /**
     * instance du menu pour les interactions utilisateur
     */
    protected Menu menu = new Menu();

    /**
     * nom du personnage affiché sur la carte
     */
    protected  String name;

    /**
     * image associé au personnage affiché sur la carte
     */
    protected ImageIcon icon;

    /**
     * chemin vers l'image
     */
    protected  String imagePath;


    /**
     * affiche la carte du personnage
     * permet de modifier le nom via un champ texte
     * si l'image n'est pas trouvée une erreur est affichée
     */
        public void afficherCard() {
            java.net.URL image = getClass().getResource(imagePath);
            if (image == null) {
                System.err.println("Image non trouvée pour : " + imagePath);
                return;
            }

            icon = new ImageIcon(imagePath);
            name = menu.demanderTexte("modifiez votre nom : " + name + " !");
            menu.afficherMessage("Vous avez modifiez votre nom : " + name + " !");
        }
    }
