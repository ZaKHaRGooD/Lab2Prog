package pokemonMoves;

import ru.ifmo.se.pokemon.*;


public class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon p, double damage) {
        Status stat = p.getCondition();
        if (stat.equals(Status.BURN) || stat.equals(Status.POISON) || stat.equals(Status.PARALYZE)) {
            super.applyOppDamage(p, damage * 2);
        } else {
            super.applyOppDamage(p, damage);
        }
    }

    @Override
    protected String describe() {
        return "использует Facade";
    }
}
