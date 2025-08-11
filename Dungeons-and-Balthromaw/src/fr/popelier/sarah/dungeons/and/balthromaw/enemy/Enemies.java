package fr.popelier.sarah.dungeons.and.balthromaw.enemy;

import fr.popelier.sarah.dungeons.and.balthromaw.game.fight.Fighter;
import fr.popelier.sarah.dungeons.and.balthromaw.character.Character;
/**
 * Représente les ennemies
 * les ennemies héritent de la classe Character(avec un name)
 * qui elle même hérite de Entity(avec attaque et vie)
 */
public abstract class Enemies extends Character implements Fighter {

    /**
     * Le constructeur Enemies
     * @param attack le niveau d'attaque
     * @param life le niveau de vie
     */
    public Enemies(String name, int attack, int life) {
        super(name, attack, life);
    }

    public abstract void interactWithPlayer(Character player);

}
