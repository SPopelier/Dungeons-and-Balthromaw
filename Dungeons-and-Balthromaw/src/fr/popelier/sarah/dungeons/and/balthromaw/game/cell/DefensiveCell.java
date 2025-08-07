package fr.popelier.sarah.dungeons.and.balthromaw.game.cell;

import fr.popelier.sarah.dungeons.and.balthromaw.character.Character;
import fr.popelier.sarah.dungeons.and.balthromaw.character.Warrior;
import fr.popelier.sarah.dungeons.and.balthromaw.character.Wizard;
import fr.popelier.sarah.dungeons.and.balthromaw.equipment.defensive.DefensiveEquipment;
import fr.popelier.sarah.dungeons.and.balthromaw.equipment.defensive.ProtectedSpell;
import fr.popelier.sarah.dungeons.and.balthromaw.equipment.defensive.Shield;
import fr.popelier.sarah.dungeons.and.balthromaw.ui.Menu;

import java.util.Random;

/**
 * Classe répresentant une potion et qui retourne textuellement P
 */
public class DefensiveCell extends Cell {

    DefensiveEquipment defensiveEquipment;
    Menu menu = new Menu();

    public DefensiveEquipment getDefensiveEquipment() {
        return defensiveEquipment;
    }

    @Override
    public String getSymbol() {
        return "Défensif équipement";
    }

    public DefensiveCell() {
        Random random = new Random();
        int value = random.nextInt(2) +1;

        switch (value) {
            case 1: defensiveEquipment = new ProtectedSpell();
                break;
            default: defensiveEquipment = new Shield();
        }
    }

    @Override
    public void interact(Character player) {

        if (defensiveEquipment instanceof Shield) {
            if (player instanceof Warrior) {
                player.setDefensiveEquipment(defensiveEquipment);
                menu.afficherMessage("Guerrier : tu obtiens un bouclier !");
            } else {
                menu.afficherMessage("Tu n'est pas un Guerrier, tu ne peux pas prendre ce bouclier !");
            }
        } else if (defensiveEquipment instanceof ProtectedSpell) {
            if (player instanceof Wizard) {
                player.setDefensiveEquipment(defensiveEquipment);
                menu.afficherMessage("Tu n'est pas un Magicien, tu ne peux pas prendre ce sort !");
            }
        } else {
            menu.afficherMessage("Bonus inconnu !");
        }
    }

}
