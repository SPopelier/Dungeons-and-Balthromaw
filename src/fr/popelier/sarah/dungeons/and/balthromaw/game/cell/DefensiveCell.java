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

    DefensiveEquipment equipment;
    Menu menu = new Menu();

    public DefensiveEquipment getDefensiveEquipment() {
        return equipment;
    }

    public DefensiveCell(DefensiveEquipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public String getSymbol() {
        return "| Déf |";
    }

    @Override
    public void interact(Character player) {

        if (equipment instanceof Shield) {
            if (player instanceof Warrior) {
                player.setDefensiveEquipment(equipment);
                menu.afficherMessage("Guerrier : tu obtiens un bouclier !");
            } else {
                menu.afficherMessage("Tu n'est pas un Guerrier, tu ne peux pas prendre ce bouclier !");
            }
        } else if (equipment instanceof ProtectedSpell) {
            if (player instanceof Wizard) {
                player.setDefensiveEquipment(equipment);
                menu.afficherMessage("Tu n'est pas un Magicien, tu ne peux pas prendre ce sort !");
            }
        } else {
            menu.afficherMessage("Bonus inconnu !");
        }
    }

}
