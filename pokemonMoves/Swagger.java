package pokemonMoves;

import ru.ifmo.se.pokemon.*;


public class Swagger extends StatusMove {
    public Swagger() {
        super(Type.NORMAL, 0, 85);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.confuse();
        Effect raiseAttack = new Effect().stat(Stat.ATTACK, 2);
        p.addEffect(raiseAttack);
    }

    @Override
    protected String describe() {
        return "использует Swagger";
    }
}
