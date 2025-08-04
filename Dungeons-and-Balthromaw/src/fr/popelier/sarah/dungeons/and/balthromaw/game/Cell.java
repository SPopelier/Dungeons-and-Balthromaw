package fr.popelier.sarah.dungeons.and.balthromaw.game;

/**
 * Classe abstraite représentant une cellule du plateau de jeu.
 * Chaque cellule doit définir un symbole qui la représente.
 */
public abstract class Cell {

    /**
     * Renvoie le symbole associé à la cellule (ex: V = vide, E = ennemi…).
     * Ce symbole sera affiché sur le plateau.
     *
     * @return Symbole de la cellule
     */
    public abstract String getSymbol();

}