package fr.popelier.sarah.dungeons.and.balthromaw.game.fight;

import fr.popelier.sarah.dungeons.and.balthromaw.game.dice.Dice;

public final class D20CriticalRule implements CriticalRule {
    @Override
    public CritResult apply(Dice d20) {
        int r = d20.roll();
        if (r == 1)  return CritResult.fail();     // échec → 0 dégât
        if (r == 20) return CritResult.success();  // réussite → +2 force
        return CritResult.normal();
    }
}