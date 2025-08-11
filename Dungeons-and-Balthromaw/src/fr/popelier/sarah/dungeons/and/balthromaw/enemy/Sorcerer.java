package fr.popelier.sarah.dungeons.and.balthromaw.enemy;


import fr.popelier.sarah.dungeons.and.balthromaw.character.Character;
import fr.popelier.sarah.dungeons.and.balthromaw.game.fight.Fight;
import fr.popelier.sarah.dungeons.and.balthromaw.game.fight.Fighter;
import fr.popelier.sarah.dungeons.and.balthromaw.ui.Menu;

/**
 * Représente l'ennemi Sorcerer
 * Sorcerer hérite de la classe Character(avec un name)
 * qui elle même hérite de Entity(avec attaque et vie)
 */
public class Sorcerer extends Enemies implements Fighter {

    /**
     * Constructeur de Sorcerer
     * @param attack le niveau d'attaque
     * @param life le niveau de vie
     */
    public Sorcerer(int attack, int life) {

        super("Sorcerer", 2, 9);
    }

    @Override
    public void interactWithPlayer(Character player) {
        Menu menu = new Menu();
        menu.afficherMessage("Le Sorcier hurle et attaque !");
        new Fight(player, this).start();
    }
}
