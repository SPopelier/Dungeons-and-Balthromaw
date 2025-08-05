package fr.popelier.sarah.dungeons.and.balthromaw.game;
import fr.popelier.sarah.dungeons.and.balthromaw.equipment.DefensiveEquipment;
import fr.popelier.sarah.dungeons.and.balthromaw.equipment.OffensiveEquipment;

/**
 * Classe abstraite représentant une cellule du plateau de jeu.
 * Chaque cellule doit définir un symbole qui la représente.
 */
public abstract class Cell {

    private int x;
    private int y;
    private String type;
    private OffensiveEquipment offensiveEquipment;
    private DefensiveEquipment defensiveEquipment;
    private String enemyName;

    // Getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getType() {
        return type;
    }

    public OffensiveEquipment getOffensiveEquipment() {
        return offensiveEquipment;
    }

    public DefensiveEquipment getDefensiveEquipment() {
        return defensiveEquipment;
    }

    public String getEnemyName() {
        return enemyName;
    }

    // Setters
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setOffensiveEquipment(OffensiveEquipment offensiveEquipment) {
        this.offensiveEquipment = offensiveEquipment;
    }

    public void setDefensiveEquipment(DefensiveEquipment defensiveEquipment) {
        this.defensiveEquipment = defensiveEquipment;
    }

    public void setEnemyName(String enemyName) {
        this.enemyName = enemyName;
    }
    /**
     * Renvoie le symbole associé à la cellule (ex: V = vide, E = ennemi…).
     * Ce symbole sera affiché sur le plateau.
     *
     * @return Symbole de la cellule
     */
    public abstract String getSymbol();

}