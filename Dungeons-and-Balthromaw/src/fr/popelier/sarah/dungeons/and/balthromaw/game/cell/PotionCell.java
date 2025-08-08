package fr.popelier.sarah.dungeons.and.balthromaw.game.cell;

import fr.popelier.sarah.dungeons.and.balthromaw.character.Character;
import fr.popelier.sarah.dungeons.and.balthromaw.equipment.potion.BigPotion;
import fr.popelier.sarah.dungeons.and.balthromaw.equipment.potion.Potion;
import fr.popelier.sarah.dungeons.and.balthromaw.equipment.potion.StandardPotion;
import fr.popelier.sarah.dungeons.and.balthromaw.ui.Menu;

import java.util.Random;

public class PotionCell extends Cell {
    Potion potion;
    Menu menu = new Menu();

    public Potion getPotion() {
        return potion;
    }

    public PotionCell(Potion potion) {
        this.potion = potion;
    }


    @Override
    public String getSymbol() {
        return "| Po |";
    }

    @Override
    public void interact(Character player) {

        player.changeLife(potion.getBonusLife());
        menu.afficherMessage("Noble héro : tu obtiens : " + potion.getBonusLife() + " de points de vie !");
    }
}
