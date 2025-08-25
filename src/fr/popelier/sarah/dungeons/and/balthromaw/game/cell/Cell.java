package fr.popelier.sarah.dungeons.and.balthromaw.game.cell;
import fr.popelier.sarah.dungeons.and.balthromaw.character.Character;

import java.io.Serializable;

/**
 * Classe abstraite représentant une cellule du plateau de jeu.
 * Chaque cellule doit définir un symbole qui la représente.
 */
public abstract class Cell {



    public abstract String getSymbol();

    public abstract void interact(Character player);
}