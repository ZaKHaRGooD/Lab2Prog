package pokemons;

import ru.ifmo.se.pokemon.*;
import pokemonMoves.*;

public class Fletchling extends Pokemon {
    public Fletchling(String name, int level) {
        super(name, level);
        setStats(45, 50, 43, 40, 38, 62);
        setType(Type.NORMAL, Type.FLYING);
        setMove(new Swagger(), new Screech());
    }
}
