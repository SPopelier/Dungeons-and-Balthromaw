package fr.popelier.sarah.dungeons.and.balthromaw.game.cell;

import fr.popelier.sarah.dungeons.and.balthromaw.character.Character;

public class PlayerCell extends Cell {

    private final String symbole;

    public PlayerCell(String symbole) {
        this.symbole = symbole;
    }

    @Override
    public String getSymbol() {
        return "[" + symbole + "]";
    }

    @Override
    public void interact(Character player) {

    }
}

