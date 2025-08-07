package fr.popelier.sarah.dungeons.and.balthromaw.equipment.potion;

import fr.popelier.sarah.dungeons.and.balthromaw.equipment.Equipment;

public abstract class Potion extends Equipment {

    protected int bonusLife;

    public int getBonusLife() {
        return bonusLife;
    }

    public void setBonusLife(int bonusLife) {
        this.bonusLife = bonusLife;
    }

    public Potion(String name, int bonusLife) {
        super(name);
        this.bonusLife = bonusLife;
    }

    @Override
    public String toString() {
        return getName() + " (Bonus de vie : " + bonusLife + ")";
    }
}
