package fr.popelier.sarah.dungeons.and.balthromaw.equipment;


/**
 * Représente la class Sort
 * elle hérite de la classe defensiveEquipment(bonusLife)
 * qui hérite elle même de la classe Equipment(name)
 */
public class Spell extends OffensiveEquipment {

    /**
     * constructeur du sort
     * @param bonusAttack points de d'attaque attribué par le sort
     */
    public Spell(int bonusAttack) {
        super("Spell", bonusAttack);
    }
}
