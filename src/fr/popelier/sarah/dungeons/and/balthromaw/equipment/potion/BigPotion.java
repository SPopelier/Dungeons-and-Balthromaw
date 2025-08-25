package fr.popelier.sarah.dungeons.and.balthromaw.equipment.potion;

import fr.popelier.sarah.dungeons.and.balthromaw.equipment.defensive.DefensiveEquipment;

/**
 * Représente la class BigPotion
 * elle hérite de la classe defensiveEquipment(bonusLife)
 * qui hérite elle même de la classe Equipment(name)
 */
public class BigPotion extends Potion {
    /**
     * Le constructeur de BigPotion
     */
    public BigPotion() {
        super("BigPotion", 5);
    }
}