package fr.popelier.sarah.dungeons.and.balthromaw.game.cell;

import fr.popelier.sarah.dungeons.and.balthromaw.character.Character;
import fr.popelier.sarah.dungeons.and.balthromaw.ui.Menu;

/**
 * Classe répresentant un ennemi et qui retourne textuellement E
 */
public class EnemyCell extends Cell {

    Menu menu = new Menu();

    @Override
    public String getSymbol() {
        return "Ennemi";
    }

    @Override
    public void interact(Character player) {
        menu.afficherMessage("Noble héro un ennemi est là , BAGUARRE ? ou FUITE ?");
    }
}
