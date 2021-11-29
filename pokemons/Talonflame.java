package pokemons;

import ru.ifmo.se.pokemon.*;
import pokemonMoves.*;

public class Talonflame extends Fletchinder {
    public Talonflame(String name, int level) {
        super(name, level);
        setStats(78, 81, 71, 74, 69, 126);
        setType(Type.FIRE, Type.FLYING);
        setMove(new Swagger(), new Screech(), new Agility(), new FlashCannon());
    }
}

