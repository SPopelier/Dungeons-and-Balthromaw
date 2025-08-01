package fr.popelier.sarah.dungeons.and.balthromaw.enemy;


/**
 * Représente l'ennemi Goblin
 *Goblin hérite de la classe Character(avec un name)
 * qui elle même hérite de Entity(avec attaque et vie)
 */
public class Goblin extends Enemies{

    /**
     * Constructeur de Goblin
     * @param attack le niveau d'attaque
     * @param life le niveau de vie
     */
    public Goblin(int attack, int life) {

        super(1, 6 );
    }
}
