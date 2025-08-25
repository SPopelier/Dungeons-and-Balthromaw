package fr.popelier.sarah.dungeons.and.balthromaw.game.dice;

import java.util.Random;

public final class RandomDice implements Dice {
    private final int sides;
    private final Random rng;

    public RandomDice(int sides, Random rng) {
        if (sides < 2) throw new IllegalArgumentException("cotes >= 2");
        this.sides = sides;
        this.rng = rng;
    }

    @Override
    public int roll() {
        return rng.nextInt(sides) + 1; // 1 à cotes inclus
    }

    @Override
    public int sides() {
        return sides;
    }

    public static RandomDice d6(Random rng) {
        return new RandomDice(6, rng);
    }

    public static RandomDice d20(Random rng) {
        return new RandomDice(20, rng);
    }
}