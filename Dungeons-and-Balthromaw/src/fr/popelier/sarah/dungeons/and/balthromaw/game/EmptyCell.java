package fr.popelier.sarah.dungeons.and.balthromaw.game;

/**
 * Classe répresentant une case vide et qui retourne textuellement V
 */
public class EmptyCell extends Cell {
    @Override
    public String getSymbol() {
        return "V"; // pour vide
    }
}
