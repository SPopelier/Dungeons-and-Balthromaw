package fr.popelier.sarah.dungeons.and.balthromaw.game.fight;

public record CritResult(CritType type, int strengthBonus) {
    public static CritResult fail()    { return new CritResult(CritType.FAIL, 0); }
    public static CritResult normal()  { return new CritResult(CritType.NORMAL, 0); }
    public static CritResult success() { return new CritResult(CritType.SUCCESS, 2); }
}