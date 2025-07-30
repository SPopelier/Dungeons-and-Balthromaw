package fr.popelier.sarah.dungeons.and.balthromaw.equipment;

public class OffensiveEquipment extends Equipment {

    private int bonusAttack;

    public OffensiveEquipment(String name, int bonusAttack) {
        super("Weapon");
        this.bonusAttack = bonusAttack;
    }

    public OffensiveEquipment(String name) {
        super("Spell");
    }
}

