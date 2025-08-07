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

    OffensiveEquipment offensiveEquipment;
    Menu menu = new Menu();


    public OffensiveEquipment getOffensiveEquipment() {
        return offensiveEquipment;
    }

    @Override
    public String getSymbol() {
        return "Arme";
    }

    public OffensiveCell() {
        Random random = new Random();
        int value = random.nextInt(4) +1;

        switch (value) {
            case 1: offensiveEquipment = new Sword();
            break;
            case 2: offensiveEquipment = new Club();
            break;
            case 3: offensiveEquipment = new FireBall();
            break;
            default: offensiveEquipment = new Flash();
        }

    }

    @Override
    public void interact(Character player) {

        if (offensiveEquipment instanceof Sword || offensiveEquipment instanceof Club) {
            if (player instanceof Warrior) {
                player.setOffensiveEquipment(offensiveEquipment);
                menu.afficherMessage("Guerrier : tu obtiens une arme !");
            } else {
                menu.afficherMessage("Tu n'est pas un Guerrier, tu ne peux pas prendre cette arme !");
            }
        } else if (offensiveEquipment instanceof FireBall || offensiveEquipment instanceof Flash) {
            if (player instanceof Wizard) {
                player.setOffensiveEquipment(offensiveEquipment);
                menu.afficherMessage("Magicien : tu obtiens un sort !");
            } else {
                menu.afficherMessage("Tu n'est pas un Magicien, tu ne peux pas prendre ce sort !");
            }
        } else {
            menu.afficherMessage("Bonus inconnu !");
        }
    }
}
