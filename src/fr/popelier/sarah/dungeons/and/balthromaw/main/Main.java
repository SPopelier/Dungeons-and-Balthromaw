package fr.popelier.sarah.dungeons.and.balthromaw.main;

import fr.popelier.sarah.dungeons.and.balthromaw.game.Game;
import fr.popelier.sarah.dungeons.and.balthromaw.ui.Menu;

/**
 * classe Main d'entrée du programme
 * gère l'entrée et le lancement du jeu
 */
public class Main {

    /**
     *méthode principale appelée au démarrage
     * créer une instance et lance le jeu
     * @param args les arguments de la ligne de commande
     */
    public static void main(String[] args) {

        //point d'entrée du jeu
        Game game = new Game(); //création de l'instance de Game
        game.start(); //lancement du jeu
    }
}