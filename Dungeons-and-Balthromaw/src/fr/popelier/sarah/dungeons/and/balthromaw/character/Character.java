package fr.popelier.sarah.dungeons.and.balthromaw.character;

import fr.popelier.sarah.dungeons.and.balthromaw.equipment.DefensiveEquipment;
import fr.popelier.sarah.dungeons.and.balthromaw.equipment.OffensiveEquipment;
import fr.popelier.sarah.dungeons.and.balthromaw.model.Entity;

/**
 *Représente un personnage jouable Warrior ou Sorcerer
 * Chaque personnage hérite des attributs d'Entity (attaque et vie), et possède un nom.
 */
public class Character extends Entity {


    /** Le nom du personnage */
    private int id;
    protected String name;
    protected DefensiveEquipment defensiveEquipment;
    protected OffensiveEquipment offensiveEquipment;

    /**
     * @return le nom du personnage
     */
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    /**
     *
     * @return le type d'équipemet défensif
     */
    public DefensiveEquipment getDefensiveEquipment() {
        return defensiveEquipment;
    }

    /**
     *
     * @return le type d'équiment offensif
     */
    public OffensiveEquipment getOffensiveEquipment() {
        return offensiveEquipment;
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
     *
     * @param defensiveEquipment le nouveau defensiveEquipment
     */
    public void setDefensiveEquipment(DefensiveEquipment defensiveEquipment) {this.defensiveEquipment = defensiveEquipment;}

    /**
     *
     * @param offensiveEquipment le nouveau offensiveEquipment
     */
    public void setOffensiveEquipment(OffensiveEquipment offensiveEquipment) {
        this.offensiveEquipment = offensiveEquipment;
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
