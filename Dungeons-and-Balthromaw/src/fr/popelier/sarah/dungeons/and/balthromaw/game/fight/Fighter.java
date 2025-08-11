package fr.popelier.sarah.dungeons.and.balthromaw.game.fight;

import fr.popelier.sarah.dungeons.and.balthromaw.character.Character;

public interface Fighter {
    String getName();
    int getLife();
    void setLife(int life);
    int getAttack();
    void interactWithPlayer(Character player);
}
