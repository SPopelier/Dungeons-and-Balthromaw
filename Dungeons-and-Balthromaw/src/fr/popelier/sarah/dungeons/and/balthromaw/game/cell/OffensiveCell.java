package fr.popelier.sarah.dungeons.and.balthromaw.game.cell;

import fr.popelier.sarah.dungeons.and.balthromaw.character.Warrior;
import fr.popelier.sarah.dungeons.and.balthromaw.character.Wizard;
import fr.popelier.sarah.dungeons.and.balthromaw.character.Character;
import fr.popelier.sarah.dungeons.and.balthromaw.equipment.offensive.*;
import fr.popelier.sarah.dungeons.and.balthromaw.ui.Menu;

import java.util.Random;

/**
 * Classe répresentant l'arme et qui retourne textuellement A
 */
public class OffensiveCell extends Cell {

    private OffensiveEquipment equipment;
    Menu menu = new Menu();
    private int bonusAttack;


    public OffensiveEquipment getOffensiveEquipment() {
        return equipment;
    }

    public OffensiveCell(OffensiveEquipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public String getSymbol() {
        return "Arme";
    }

    @Override
    public void interact(Character player) {

        if (equipment instanceof Sword && player instanceof Warrior || equipment instanceof Club && player instanceof Warrior) {
            player.setOffensiveEquipment(equipment);
            player.setAttack(player.getAttack() + equipment.getBonusAttack());
            menu.afficherMessage("Guerrier : tu obtiens une arme ! Ton attaque augmente de " + player.getAttack() + "!");
        } else if (equipment instanceof FireBall && player instanceof Wizard || equipment instanceof Flash && player instanceof Wizard) {
            player.setOffensiveEquipment(equipment);
            player.setAttack(player.getAttack() + equipment.getBonusAttack());
            menu.afficherMessage("Magicien : tu obtiens un sort !Ton attaque augmente de " + player.getAttack() + "!");
        } else menu.afficherMessage("Tu n'es pas aptes à obtenir ce bonus !");
    }
}
