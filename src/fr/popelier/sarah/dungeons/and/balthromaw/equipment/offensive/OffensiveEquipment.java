package fr.popelier.sarah.dungeons.and.balthromaw.equipment.offensive;


import fr.popelier.sarah.dungeons.and.balthromaw.equipment.Equipment;

/**
 * Représente la classe des équipements d'attaque(bonusAttack)
 * Chaque équipement d'attaque hérite de la classe d'équipement(name)
 */
public abstract class OffensiveEquipment extends Equipment {

    
    /**
     * la valeur de l'attaque en bonus
     */
    protected int bonusAttack;

    public String getOffensiveEquipment() { return getName() + bonusAttack;};

    /**
     *
     * @return la valeur du bonusAttack
     */
    public int getBonusAttack() { return bonusAttack; }

    /**
     * modifie le niveau d'attaque
     * @param bonusAttack le nouveau niveau d'attaque
     */
    public void setBonusAttack(int bonusAttack) {
        this.bonusAttack = bonusAttack;
    }

    /**
     * Constructeur de l'équipement d'attaque
     * @param name le nom de l'équipement d'attaque
     * @param bonusAttack le niveau de bonus attaque
     */
    public OffensiveEquipment(String name, int bonusAttack) {
        super(name);
        this.bonusAttack = bonusAttack;
    }

    /**
     * affiche visuellement la valeur du bonus d'attaque
     * @return
     */
    @Override
    public String toString() {
        return getName() + "(Bonus d'attaque : " + bonusAttack + ")";}
}

