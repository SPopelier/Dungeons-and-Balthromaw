package fr.popelier.sarah.dungeons.and.balthromaw.enemy;

/**
 * Représente l'ennemi Dragon
 *Dragon hérite de la classe Character(avec un name)
 * qui elle même hérite de Entity(avec attaque et vie)
 */
public class Dragon extends Enemies{

    /**
     * Le constructeur de Dragon
     * @param attack le niveau attaque propre à Dragon
     * @param life le niveau de vie propre à Dragon
     */
    public Dragon(int attack, int life) {

        super(4, 15);
    }

}
