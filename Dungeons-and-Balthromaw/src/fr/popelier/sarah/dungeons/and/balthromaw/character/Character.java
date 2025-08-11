package fr.popelier.sarah.dungeons.and.balthromaw.character;

import fr.popelier.sarah.dungeons.and.balthromaw.equipment.defensive.DefensiveEquipment;
import fr.popelier.sarah.dungeons.and.balthromaw.equipment.offensive.OffensiveEquipment;
import fr.popelier.sarah.dungeons.and.balthromaw.model.Entity;
import fr.popelier.sarah.dungeons.and.balthromaw.game.fight.Fighter;

/**
 *Représente un personnage jouable Warrior ou Sorcerer
 * Chaque personnage hérite des attributs d'Entity (attaque et vie), et possède un nom.
 */
public class Character extends Entity implements Fighter {


    /** Le nom du personnage */
    private Long id;
    protected String name;
    protected DefensiveEquipment defensiveEquipment;
    protected OffensiveEquipment offensiveEquipment;

    /**
     * @return le nom du personnage
     */
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public int getAttack() {
        return attack;
    }

    @Override
    public void interactWithPlayer(Character player) {

    }

    public void setLife(int life) {
        this.life = life;
    }
    public void setAttack(int attack) {
        this.attack = attack;
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


    public void setId(Long id) {
        this.id = id;
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

    public int changeLife(int life) {
        this.life += life;
        return life;
    }
}
