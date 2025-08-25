package fr.popelier.sarah.dungeons.and.balthromaw.game.fight;

import fr.popelier.sarah.dungeons.and.balthromaw.game.dice.Dice;

public interface CriticalRule {
    CritResult apply(Dice d20);
}