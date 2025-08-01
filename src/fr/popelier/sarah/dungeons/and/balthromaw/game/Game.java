package fr.popelier.sarah.dungeons.and.balthromaw.game;

import fr.popelier.sarah.dungeons.and.balthromaw.character.Character;
import fr.popelier.sarah.dungeons.and.balthromaw.character.Warrior;
import fr.popelier.sarah.dungeons.and.balthromaw.character.Wizard;
import fr.popelier.sarah.dungeons.and.balthromaw.ui.Menu;
import fr.popelier.sarah.dungeons.and.balthromaw.game.OutOfBoardException;
import java.awt.event.ActionEvent;
import java.util.Random;

/**
 * Représente la logique du jeu
 * Gère le choix du personnage, les interactions avec le joueur  via l'interface {@code Menu},
 * et la boucle de jeu (lancement de dés, déplacement, vérification de victoire ou d'erreur).
 *
 */
public class Game {

    /**
     * Gère les événements d'action
     */
    private ActionEvent ActionEvent;

    /**
     * Démarre le jeu en affichant les menus et demandent de choix du joueur
     * créatin de personnage, de modifiction de nom
     * si personnage invalide une {@code IllegalArgumentException} est mise en place
     */
    public void start() {

        Menu menu = new Menu(); // création de l'instance de Menu

        String name = menu.demanderTexte("Quel est ton nom ?");
        menu.afficherMessage("Salut " + name + " !");

        String choixPersonnage = menu.demanderTexte("Quel personnage ? Magicien ou Guerrier ?");
        menu.afficherMessage(("Bienvenue " + name + " noble " + choixPersonnage +  "!"));

        if (!choixPersonnage.equals("Magicien") && !choixPersonnage.equals("Guerrier")) {
            menu.afficherMessage("Erreur, Veuillez choisir Magicien ou Guerrier !");
            throw new IllegalArgumentException("Personnage inconnu : " + choixPersonnage );
        }

        menu.afficherMessage("Votre " +choixPersonnage+ " à été créer !");

        Character player;


        if (choixPersonnage.equals("Magicien")) {
            player = new Wizard(name);
        }else {
            player = new Warrior(name);
        }

        int buttonChoice = menu.showMainMenu(); //menu option


        switch (buttonChoice) {
            case 0: //Sauvegarder
                menu.afficherMessage("Le jeu commence !");
                newGame();
                break;
            case 1: //  Modifier
                String newName = menu.demanderTexte("Quel est votre nouveau nom de " + player.getName() + "?");
                player.setName(newName);
                menu.afficherMessage("Nouveau nom : " + player.getName());
                newGame();
                // card.afficherCard();
                break;
            case 2: //Quitter
                menu.afficherMessage("Au Revoir !");
                System.exit(0);
                break;
            default:
                menu.afficherMessage("Aucune option sélectionnée.");
        }
    }

    /**
     * génère aléatoirement le lancer du dé
     */
    private static final Random random = new Random();

    /**
     * simule le lancer de dé
     * @param min la valeur minimale possible
     * @param max la valeur maximale possible
     * @return le résultat du dé
     */
    public static int getRandomDieRoll(int min, int max) {
        return random.nextInt(max - min +1) + min;
    }

    /**
     * Lance une nouvelle partie
     * gère le déplacement du plateau sur 64 cases, selon le lancé de dé
     * si le joueur dépasse la dernière case une {@code IllegalArgumentException} est mise en place
     */
    private void newGame( ) {

        Menu menu = new Menu();

        int position = 1;
        int dieRoll= 0;

        while (position < 64) {

            try {
                if (position + dieRoll > 64) {
                    throw new OutOfBoardException("Tu dépasses la dernière case !");
                }

            menu.afficherMessage("Vous êtes à la case " + position + " .");
            int actionChoice = menu.playGame();

            if (actionChoice == 0) {
                menu.afficherMessage("Les dés sont lancés");
                dieRoll = getRandomDieRoll(1, 6);
                position += dieRoll;
                menu.afficherMessage(("Vous avancez de " + dieRoll + "cases"));
            }
            } catch (OutOfBoardException e) {
                System.out.println("⚠️ Erreur : " + e.getMessage());
                menu.afficherMessage("⛔ Tour annulé. Restez sur la même case.");
                dieRoll = 0;
            }
        }
        menu.afficherMessage("ßravo ! Vous avez gagné !");
    }
}
