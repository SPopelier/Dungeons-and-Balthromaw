package fr.popelier.sarah.dungeons.and.balthromaw.main;

import fr.popelier.sarah.dungeons.and.balthromaw.ui.Menu;

public class Main {

    public static void main(String[] args) {

        //point d'entrée du jeu
        Game myGame = new Game(); //création de l'instance de Game
        myGame.start(); //lancement du jeu

        //Menu boîte de dialogue
        Menu menu = new Menu(); // cration de l'instance de Menu
        /*String nom = menu.demanderTexte("Quel est ton nom ?");
        menu.afficherMessage("Salut " + nom + " !");
         */
    }
}