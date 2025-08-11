package fr.popelier.sarah.dungeons.and.balthromaw.game.dice;

public interface Dice {
    /**
     * Lance le dé et retourne un entier compris entre 1 et le nombre de faces inclus.
     */
    int roll();

    /**
     * Retourne le nombre de faces du dé.
     */
    int sides();
}