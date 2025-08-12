package fr.popelier.sarah.dungeons.and.balthromaw.game;

import fr.popelier.sarah.dungeons.and.balthromaw.character.Character;
import fr.popelier.sarah.dungeons.and.balthromaw.character.Warrior;
import fr.popelier.sarah.dungeons.and.balthromaw.character.Wizard;
import fr.popelier.sarah.dungeons.and.balthromaw.db.ConnectionRequest;
import fr.popelier.sarah.dungeons.and.balthromaw.game.cell.*;
import fr.popelier.sarah.dungeons.and.balthromaw.ui.CharacterCard;
import fr.popelier.sarah.dungeons.and.balthromaw.ui.Menu;

import java.awt.event.ActionEvent;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 * Représente la logique du jeu
 * Gère le choix du personnage, les interactions avec le joueur  via l'interface {@code Menu},
 * et la boucle de jeu (lancement de dés, déplacement, vérification de victoire ou d'erreur).
 */
public class Game {

    /**
     * Gère les événements d'action
     */
    private ActionEvent ActionEvent;

    private String choixPersonnage;

    /**
     * Démarre le jeu en affichant les menus et demandent de choix du joueur
     * créatin de personnage, de modifiction de nom
     * si personnage invalide une {@code IllegalArgumentException} est mise en place
     */
    public void start() {

        Menu menu = new Menu(); // création de l'instance de Menu

        String name = menu.demanderTexte("Quel est ton nom ?");
        menu.afficherMessage("Salut " + name + " !");

        ConnectionRequest dbManager = new ConnectionRequest();
        dbManager.getHeroes();

        choixPersonnage = menu.demanderTexte("Quel personnage ? Magicien ou Guerrier ?");

        //normalise : majuscule + suppression espaces inutiles
        choixPersonnage = choixPersonnage.trim().toUpperCase();

        menu.afficherMessage(("Bienvenue " + name + " noble " + choixPersonnage + "!"));

        Character player;

        if (choixPersonnage.equals("MAGICIEN")) {
            player = new Wizard(name);
        } else if (choixPersonnage.equals("GUERRIER")) {
            player = new Warrior(name);
        } else {
            menu.afficherMessage("Personnage invalide !");
            throw new IllegalArgumentException("Type de personnage inconnu : " + choixPersonnage);
        }

        dbManager.createHero(player);

        new CharacterCard().afficherCard(player);

        int buttonChoice = menu.showMainMenu(); //menu option


        switch (buttonChoice) {
            case 0: //Sauvegarder
                menu.afficherMessage("Le jeu commence !");
                newGame(player);
                break;
            case 1: //  Modifier
                String newName = menu.demanderTexte("Quel est votre nouveau nom de " + player.getName() + "?");
                player.setName(newName);
                menu.afficherMessage("Nouveau nom : " + player.getName());
                dbManager.editHero(player);
                newGame(player);
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
     *
     * @param min la valeur minimale possible
     * @param max la valeur maximale possible
     * @return le résultat du dé
     */
    public static int getRandomDieRoll(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }

    /**
     * Lance une nouvelle partie
     * gère le déplacement du plateau sur 64 cases, selon le lancé de dé
     * si le joueur dépasse la dernière case une {@code IllegalArgumentException} est mise en place
     */
    private void newGame(Character player) {

        Menu menu = new Menu();
        GameBoard gameBoard = new GameBoard();
        ConnectionRequest dbManager = new ConnectionRequest();

        int playerPosition = 1;
        int dieRoll = 0;
        int result = 0;

       // dbManager.saveBoard(gameBoard, playerPosition);

        while (playerPosition < 65) {

            try {
                if (playerPosition + dieRoll > 64) {
                    throw new OutOfBoardException("Tu dépasses la dernière case !");
                }

                int actionChoice = menu.playGame();

                if (actionChoice == 0 && player.getLife() >= 1) {

                    dieRoll = getRandomDieRoll(1, 6);
                    System.out.println("Position avant du joueur : " + playerPosition);
                    playerPosition += dieRoll;
                    System.out.println("Position après : " + playerPosition);

                    int ligne = (playerPosition - 1) / 8;
                    int colonne = (playerPosition - 1) % 8;

                    Cell currentCell = gameBoard.getCell(ligne, colonne);
                    gameBoard.setCell(ligne, colonne, new PlayerCell(choixPersonnage));

                    JOptionPane.showMessageDialog(null, gameBoard.display(), "Plateau de jeu", JOptionPane.INFORMATION_MESSAGE);

                    menu.afficherMessage(("Vous avancez de " + dieRoll + "cases et vous êtes à la case " + playerPosition + "!"));
                    currentCell.interact(player);
                    new CharacterCard().afficherCard(player);

                } else {
                    menu.afficherMessage("Le jeu est terminé !");
                    System.exit(0);
                }

            } catch (OutOfBoardException e) {
                System.out.println("⚠️ Erreur : " + e.getMessage());
                menu.afficherMessage("⛔ Tour annulé. Restez sur la même case.");
                dieRoll = 0;
            }
        } menu.afficherMessage("ßravo ! Vous avez gagné !");
    }
}



