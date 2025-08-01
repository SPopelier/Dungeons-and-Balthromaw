package fr.popelier.sarah.dungeons.and.balthromaw.character;

/**
 * Représente le personnage Warrior
 * Warrior hérite de la classe Character(avec un name)
 * qui elle même hérite de Entity(avec attaque et vie)
 */
public class Warrior extends Character{

    /**
     * Le constructeur de Warrior
     * @param name le nouveau nom du personnage
     */
    public Warrior(String name) {

        super(name, 5, 10 );

    }

}
