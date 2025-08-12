package fr.popelier.sarah.dungeons.and.balthromaw.game.cell;

import fr.popelier.sarah.dungeons.and.balthromaw.character.Character;
import fr.popelier.sarah.dungeons.and.balthromaw.enemy.Enemies;
import fr.popelier.sarah.dungeons.and.balthromaw.ui.Menu;

import javax.swing.*;

import static fr.popelier.sarah.dungeons.and.balthromaw.game.Game.getRandomDieRoll;

/**
 * Classe répresentant un ennemi et qui retourne textuellement E
 */
public class EnemyCell extends Cell {

    Enemies enemies;
    Menu menu = new Menu();
    int playerPosition;

    public Enemies getEnemies() {
        return enemies;
    }

    public EnemyCell(Enemies enemies) {
        this.enemies = enemies;
    }

    @Override
    public String getSymbol() {
        return " Ennemi ";
    }

    @Override
    public void interact(Character player) {

        int actionChoice = menu.choixCombat(); //menu option

        switch (actionChoice) {
            case 0: //BAGARRE
                menu.afficherMessage("BAGARRE !");
                enemies.interactWithPlayer(player);
                break;
            case 1: //FUITE
                menu.afficherMessage("Les dés sont lancés pour reculer");

                int dieRoll = getRandomDieRoll(1, 6);
                playerPosition -= dieRoll;
                if (playerPosition < 1) playerPosition = 1; // borne de sécurité

                menu.afficherMessage("Vous reculez de " + dieRoll + " cases et vous êtes à la case " + playerPosition + " !");
                break;
            default:
                menu.afficherMessage("Aucune option sélectionnée.");
        }

    }
}
