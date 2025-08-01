package fr.popelier.sarah.dungeons.and.balthromaw.equipment;

/**
 * Représente la class potion
 * elle hérite de la classe defensiveEquipment(bonusLife)
 * qui hérite elle même de la classe Equipment(name)
 */
public class Potion extends DefensiveEquipment {

    /**
     * Le constructeur de Potion
     * @param bonusLife points de vie accordé par la potion
     */
    public Potion(int bonusLife) {
        super("Potion", bonusLife);
    }
}
