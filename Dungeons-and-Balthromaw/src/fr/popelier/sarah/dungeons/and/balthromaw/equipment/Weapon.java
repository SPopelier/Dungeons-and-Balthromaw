package fr.popelier.sarah.dungeons.and.balthromaw.equipment;

/**
 * Représente la class Arme
 * elle hérite de la classe defensiveEquipment(bonusLife)
 * qui hérite elle même de la classe Equipment(name)
 */
public class Weapon extends OffensiveEquipment {

    /**
     * Constructeur de l'arme
     * @param bonusAttack points d'attaque attribué par l'arme
     */
    public Weapon(int bonusAttack) {
        super("Weapon", bonusAttack);
    }
}



