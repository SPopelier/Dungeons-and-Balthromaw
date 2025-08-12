package fr.popelier.sarah.dungeons.and.balthromaw.ui;

import javax.swing.*;


import fr.popelier.sarah.dungeons.and.balthromaw.character.Character;


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
        public void afficherCard(Character player) {

            String nameCharacter = player.getType();
            String fileName = verifiactionChard(nameCharacter);
            java.net.URL image = getClass().getResource(fileName);
            if (image == null) {
                System.err.println("Image non trouvée pour : " + fileName);
                return;
            }

            icon = new ImageIcon(image);

            String message = String.format(
                    "Votre personnage : %s%nPoints de vie : %d%nPoints d'attaque : %d",
                    nameCharacter, player.getLife(), player.getAttack()
            );

            javax.swing.JOptionPane.showMessageDialog(
                    null,
                    message,
                    "Fiche personnage",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE,
                    icon
            );
        }

        public String verifiactionChard(String nameCharacter) {
            String response;
            if (nameCharacter.equals("Wizard")) {
                return response = "../assets/wizard.png" ;
            } else if (nameCharacter.equals("Warrior")) {
                return response = "../assets/warrior.png" ;
            }
            return null;
        }
    }
