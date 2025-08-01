package fr.popelier.sarah.dungeons.and.balthromaw.character;

/**
 * Représente le personnage Wizard
 * Warrior hérite de la classe Character(avec un name)
 * qui elle même hérite de Entity(avec attaque et vie)
 */
public class Wizard extends Character {

    /**
     * Le constructeur de Wizard
     * @param name le nouveau nom du personnage
     */
    public Wizard(String name) {

        super(name, 8, 6);
    }
}
