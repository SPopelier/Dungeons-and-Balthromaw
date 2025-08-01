package fr.popelier.sarah.dungeons.and.balthromaw.equipment;

/**
 * Représente la class Bouclier
 * elle hérite de la classe defensiveEquipment(bonusLife)
 * qui hérite elle même de la classe Equipment(name)
 */
public class Shield extends DefensiveEquipment {

    /**
     * le ocnstructeur de Bouclier
     * @param bonusLife points de vie accordé par le bouclier
     */
    public Shield(int bonusLife) {
        super("Shield", bonusLife);
    }
}
