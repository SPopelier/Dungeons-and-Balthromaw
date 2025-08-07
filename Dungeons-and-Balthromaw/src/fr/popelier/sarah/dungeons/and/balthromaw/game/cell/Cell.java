package fr.popelier.sarah.dungeons.and.balthromaw.game.cell;
import fr.popelier.sarah.dungeons.and.balthromaw.character.Character;
import fr.popelier.sarah.dungeons.and.balthromaw.equipment.defensive.DefensiveEquipment;
import fr.popelier.sarah.dungeons.and.balthromaw.equipment.offensive.OffensiveEquipment;
import fr.popelier.sarah.dungeons.and.balthromaw.equipment.potion.Potion;

/**
 * Classe abstraite représentant une cellule du plateau de jeu.
 * Chaque cellule doit définir un symbole qui la représente.
 */
public abstract class Cell {

    //représente la position horizontale
    protected int x;
    //représente la position verticale
    protected int y;

    // Getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Setters
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }


    public abstract String getSymbol();

    public abstract void interact(Character player);
}