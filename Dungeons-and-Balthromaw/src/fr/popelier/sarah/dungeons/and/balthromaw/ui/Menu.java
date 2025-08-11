package fr.popelier.sarah.dungeons.and.balthromaw.ui;

import fr.popelier.sarah.dungeons.and.balthromaw.character.Character;

import javax.swing.*;
import java.awt.event.ActionEvent;
// Importe toutes les classes du package Swing, y compris JOptionPane.
// C’est ce qu’on utilise pour afficher les boîtes de dialogue.

/**
 *représente l'interface graphique du menu
 * gère les entrées utilisateurs et affiche les messages
 * gère les boutons de séléction pour l'utilisateur
 */
public class Menu {

    /**
     * gère les entrées utilisateurs via l'interface graphique
     * @param message le message demandé
     * @return le message de l'utilisateur
     */
    public String demanderTexte(String message) {
        return JOptionPane.showInputDialog(message);
    }

    /**
     * gère l'affichage des messages dans le menu
     * @param message affiche le message dans le menu
     */
    public void afficherMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    /**
     * gère les options possible(jouer, modifier, quitter) affichées pour l'utilisateur
     * @return la séléction de l'utilisateur
     */
    public int showMainMenu() {
        Object[] options = {"Jouer", "Modifier", "Quitter"};


        int buttonChoice = JOptionPane.showOptionDialog(
                null, //parentComponent
                "Que voulez-vous faire ?", //message
                "Menu", //title
                JOptionPane.DEFAULT_OPTION, //optionType
                JOptionPane.QUESTION_MESSAGE, //messageType
                null, //icon
                options, //custom options
                options[0]); /* initialValue */

        return buttonChoice;
    }

    /**
     * affiche le menu du jeu en cours
     * gère la proposition de lancer de dé
     * @return le choix de l'utilisateur(lancer, quitter)
     */
    public int playGame() {
        Object[] options = {"Lancer le dé", "Quitter"};

        int actionChoice = JOptionPane.showOptionDialog(
                null, //parentComponent
                "Que voulez-vous faire ?", //message
                "Menu", //title
                JOptionPane.DEFAULT_OPTION, //optionType
                JOptionPane.QUESTION_MESSAGE, //messageType
                null, //icon
                options, //custom options
                options[0]); /* initialValue */

        return actionChoice;

    }

    public int choixCombat() {
        Object[] options = {"COMBAT", "FUITE"};

        int actionChoice = JOptionPane.showOptionDialog(
                null, //parentComponent
                "COMBAT ou FUITE ?", //message
                "Menu", //title
                JOptionPane.DEFAULT_OPTION, //optionType
                JOptionPane.QUESTION_MESSAGE, //messageType
                null, //icon
                options, //custom options
                options[0]); /* initialValue */

        return actionChoice;
    }


}


