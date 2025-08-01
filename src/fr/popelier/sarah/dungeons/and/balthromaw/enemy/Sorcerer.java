package fr.popelier.sarah.dungeons.and.balthromaw.enemy;


/**
 * Représente l'ennemi Sorcerer
 * Sorcerer hérite de la classe Character(avec un name)
 * qui elle même hérite de Entity(avec attaque et vie)
 */
public class Sorcerer extends Enemies{

    /**
     * Constructeur de Sorcerer
     * @param attack le niveau d'attaque
     * @param life le niveau de vie
     */
    public Sorcerer(int attack, int life) {

        super( 2, 9);
    }
}
