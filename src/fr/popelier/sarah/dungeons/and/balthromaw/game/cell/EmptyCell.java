package fr.popelier.sarah.dungeons.and.balthromaw.game.cell;

import fr.popelier.sarah.dungeons.and.balthromaw.character.Character;
import fr.popelier.sarah.dungeons.and.balthromaw.ui.Menu;

/**
 * Classe répresentant une case vide et qui retourne textuellement V
 */
public class EmptyCell extends Cell {

    Menu menu = new Menu();


    @Override
    public String getSymbol() {
        return " X "; // pour vide
    }

    @Override
    public void interact(Character player) {
        menu.afficherMessage("Noble héro la case est vide, REPOS !");
    }
}
