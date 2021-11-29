package pokemonMoves;

import ru.ifmo.se.pokemon.*;

public class Waterfall extends PhysicalMove {
    public Waterfall() {
        super(Type.WATER, 80, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon p, double damage) {
        super.applyOppDamage(p, damage);
    }

    // проверить
    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().chance(0.2);
        p.addEffect(e);
        Effect.flinch(p);
    }

    @Override
    protected String describe() {
        return "использует Waterfall";
    }

}
