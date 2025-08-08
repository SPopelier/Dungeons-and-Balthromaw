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


    public OffensiveEquipment getOffensiveEquipment() {
        return equipment;
    }

        public OffensiveCell(OffensiveEquipment equipment) {
            this.equipment = equipment;
        }

    @Override
    public String getSymbol() {
        return " | Arme |";
    }

    @Override
    public void interact(Character player) {

        if (equipment instanceof Sword || equipment instanceof Club) {
            if (player instanceof Warrior) {
                player.setOffensiveEquipment(equipment);
                menu.afficherMessage("Guerrier : tu obtiens une arme !");
            } else {
                menu.afficherMessage("Tu n'est pas un Guerrier, tu ne peux pas prendre cette arme !");
            }
        } else if (equipment instanceof FireBall || equipment instanceof Flash) {
            if (player instanceof Wizard) {
                player.setOffensiveEquipment(equipment);
                menu.afficherMessage("Magicien : tu obtiens un sort !");
            } else {
                menu.afficherMessage("Tu n'est pas un Magicien, tu ne peux pas prendre ce sort !");
            }
        } else {
            menu.afficherMessage("Bonus inconnu !");
        }
    }
}
