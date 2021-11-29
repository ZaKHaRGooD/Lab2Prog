package pokemons;

import ru.ifmo.se.pokemon.*;
import pokemonMoves.*;

public class Fletchinder extends Fletchling {
    public Fletchinder(String name, int level) {
        super(name, level);
        setStats(62, 73, 55, 56, 52, 84);
        setType(Type.FIRE, Type.FLYING);
        setMove(new Swagger(), new Screech(), new Agility());
    }
}
