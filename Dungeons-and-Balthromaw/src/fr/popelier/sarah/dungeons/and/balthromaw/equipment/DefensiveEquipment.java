package fr.popelier.sarah.dungeons.and.balthromaw.equipment;

/**
 * Représente la classe des équipements de défense
 * Chaque équipement de défense hérite de la classe d'équipement(name)
 */
public abstract class DefensiveEquipment extends Equipment{

    /**
     * La valeur de bonus attribuée
     */
    private int bonusLife;

    /**
     *
     * @return la valeur du bonusLife
     */
    public int getBonusLife() {return bonusLife;}

    /**
     * modifie le niveau de life
     * @param bonusLife le nouveau niveau de bonusLife
     */
    public void setBonusLife(int bonusLife) { this.bonusLife = bonusLife;}

    /**
     * Construit l'équipement de défense
     * @param name le nom de l'équipement de défense
     * @param bonusLife le niveau de bonus attribué
     */
    public DefensiveEquipment(String name, int bonusLife) {
        super(name);
        this.bonusLife = bonusLife;
    }

    /**
     * Affiche visuellement la valeur du bonusLife attribué
     * @return bonusLife
     */
    @Override
    public String toString() {
        return getName() + " (Bonus de vie : " + bonusLife + ")";}
}

