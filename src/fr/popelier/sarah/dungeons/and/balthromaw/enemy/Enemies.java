package fr.popelier.sarah.dungeons.and.balthromaw.enemy;

import fr.popelier.sarah.dungeons.and.balthromaw.model.Entity;

/**
 * Représente les ennemies
 * les ennemies héritent de la classe Character(avec un name)
 * qui elle même hérite de Entity(avec attaque et vie)
 */
public class Enemies extends Entity {

    /**
     * Le constructeur Enemies
     * @param attack le niveau d'attaque
     * @param life le niveau de vie
     */
    public Enemies(int attack, int life) {
        super(attack, life);
    }

}
