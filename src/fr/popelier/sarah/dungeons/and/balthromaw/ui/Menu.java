package fr.popelier.sarah.dungeons.and.balthromaw.ui;

import javax.swing.*;
// Importe toutes les classes du package Swing, y compris JOptionPane.
// C’est ce qu’on utilise pour afficher les boîtes de dialogue.


public class Menu {

    public String demanderTexte(String message) {
        return JOptionPane.showInputDialog(message);
    }

    public void afficherMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
}
