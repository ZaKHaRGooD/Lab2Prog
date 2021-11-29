package pokemonMoves;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest() {
        super(Type.PSYCHIC, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect fullHeal = new Effect().turns(0).stat(Stat.HP, -99999);
        Effect sleep = new Effect().turns(2).condition(Status.SLEEP);
        p.addEffect(fullHeal);
        p.setCondition(sleep);
    }

    @Override
    protected String describe() {
        return "использует Rest";
    }
}
