package fr.popelier.sarah.dungeons.and.balthromaw.enemy;


import fr.popelier.sarah.dungeons.and.balthromaw.character.Character;
import fr.popelier.sarah.dungeons.and.balthromaw.game.Fight;
import fr.popelier.sarah.dungeons.and.balthromaw.model.Fighter;
import fr.popelier.sarah.dungeons.and.balthromaw.ui.Menu;

/**
 * Représente l'ennemi Goblin
 *Goblin hérite de la classe Character(avec un name)
 * qui elle même hérite de Entity(avec attaque et vie)
 */
public class Goblin extends Enemies implements Fighter {

    /**
     * Constructeur de Goblin
     * @param attack le niveau d'attaque
     * @param life le niveau de vie
     */
    public Goblin(int attack, int life) {

        super("Goblin", 1, 6 );
    }

    @Override
    public void interactWithPlayer(Character player) {
        Menu menu = new Menu();
        menu.afficherMessage("Le Goblin grogne et attaque !");
        new Fight(player, this).start();
    }

}
