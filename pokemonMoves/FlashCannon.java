package pokemonMoves;

import ru.ifmo.se.pokemon.*;

public class FlashCannon extends SpecialMove {
    public FlashCannon() {
        super(Type.STEEL, 80, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon p, double damage) {
        super.applySelfDamage(p, damage);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect lowerSpecialDefense = new Effect().chance(0.1).stat(Stat.SPECIAL_DEFENSE, -1);
        p.addEffect(lowerSpecialDefense);
    }

    @Override
    protected String describe() {
        return "использует Flash Cannon";
    }
}
