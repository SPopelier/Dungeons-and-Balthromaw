package fr.popelier.sarah.dungeons.and.balthromaw.game.cell;

import fr.popelier.sarah.dungeons.and.balthromaw.character.Character;
import fr.popelier.sarah.dungeons.and.balthromaw.enemy.Enemies;
import fr.popelier.sarah.dungeons.and.balthromaw.ui.Menu;

/**
 * Classe répresentant un ennemi et qui retourne textuellement E
 */
public class EnemyCell extends Cell {

    Enemies enemies;
    Menu menu = new Menu();

    public Enemies getEnemies() {
        return enemies;
    }

    public EnemyCell(Enemies enemies) {
        this.enemies = enemies;
    }

    @Override
    public String getSymbol() {
        return "| En |";
    }

    @Override
    public void interact(Character player) {
        menu.afficherMessage("Noble héro un ennemi est là , BAGUARRE ? ou FUITE ?");
        //LOGIQUE DE COMBAT
        enemies.interactWithPlayer(player);
    }
}
