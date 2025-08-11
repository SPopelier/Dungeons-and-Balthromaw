package fr.popelier.sarah.dungeons.and.balthromaw.game.fight;

import fr.popelier.sarah.dungeons.and.balthromaw.character.Character;
import fr.popelier.sarah.dungeons.and.balthromaw.ui.Menu;

public class Fight {

    private final Character player;
    private final Fighter enemy;

    private final Menu menu = new Menu();

    public Fight(Character player, Fighter enemy) {
        this.player = player;
        this.enemy = enemy;
    }

    public void start() {

        menu.afficherMessage("Le combat commence entre " + player.getName() + " et " + enemy.getName() + " !");

        while (player.getLife() > 0 && enemy.getLife() > 0) {
            // Tour de l’ennemi
            int damageToPlayer = enemy.getAttack();
            player.setLife(player.getLife() - damageToPlayer);
            menu.afficherMessage(enemy.getName() + " contre-attaque ! " + player.getName() + " perd " + damageToPlayer + " PV (reste : " + player.getLife() + ")");

            if (player.getLife() <= 0) {
                menu.afficherMessage(player.getName() + " est tombé au combat...");
                return;
            }

            // Tour du joueur
            int damageToEnemy = player.getAttack();
            enemy.setLife(enemy.getLife() - damageToEnemy);
            menu.afficherMessage(player.getName() + " attaque ! " + enemy.getName() + " perd " + damageToEnemy + " PV (reste : " + enemy.getLife() + ")");

            if (enemy.getLife() <= 0) {
                menu.afficherMessage(player.getName() + " a vaincu " + enemy.getName() + " !");
            }
        }
    }
    }
