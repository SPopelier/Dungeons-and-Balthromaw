package fr.popelier.sarah.dungeons.and.balthromaw.enemy;

import fr.popelier.sarah.dungeons.and.balthromaw.game.Fight;
import fr.popelier.sarah.dungeons.and.balthromaw.model.Fighter;
import fr.popelier.sarah.dungeons.and.balthromaw.ui.Menu;
import fr.popelier.sarah.dungeons.and.balthromaw.character.Character;


/**
 * Représente l'ennemi Dragon
 *Dragon hérite de la classe Character(avec un name)
 * qui elle même hérite de Entity(avec attaque et vie)
 */
public class Dragon extends Enemies implements Fighter {

    /**
     * Le constructeur de Dragon
     * @param attack le niveau attaque propre à Dragon
     * @param life le niveau de vie propre à Dragon
     */
    public Dragon(int attack, int life) {

        super("Dragon", 4, 15);
    }


    @Override
    public void interactWithPlayer(Character player) {
        Menu menu = new Menu();
        menu.afficherMessage("🔥 Le dragon rugit et attaque !");
        new Fight(player, this).start();
    }
}
