package pokemonMoves;

import ru.ifmo.se.pokemon.*;

public class WoodHammer extends PhysicalMove {
    public WoodHammer() {
        super(Type.GRASS, 120, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon p, double damage) {
        super.applySelfDamage(p, damage);
    }

    @Override
    protected void applySelfDamage(Pokemon p, double damage) {
        super.applySelfDamage(p, damage / 3.0);
    }

    @Override
    protected String describe() {
        return "использует Wood Hammer";
    }
}
