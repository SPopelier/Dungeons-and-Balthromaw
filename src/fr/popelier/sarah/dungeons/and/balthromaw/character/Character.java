package fr.popelier.sarah.dungeons.and.balthromaw.character;

import fr.popelier.sarah.dungeons.and.balthromaw.model.Entity;

/**
 *Représente un personnage jouable Warrior ou Sorcerer
 * Chaque personnage hérite des attributs d'Entity (attaque et vie), et possède un nom.
 */
public class Character extends Entity {


    /** Le nom du personnage */
    protected String name;

    /**
     * @return le nom du personnage
     */
    public String getName() {
        return name;
    }

    /**
     * modifie le nom du personnage
     *
     * @param name le nouveau nom à attribuer
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Construit un nouveau personnage avec un nom + une valeur d'attaque + le niveau de vie
     *
     * @param name le nom du personnage
     * @param attack la puissance du personnage
     * @param  life la quantité de vie
     */
    public Character(String name, int attack, int life) {
        super(attack, life);
        this.name = name;
    }



}
