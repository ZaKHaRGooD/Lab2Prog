package pokemons;

import ru.ifmo.se.pokemon.*;
import pokemonMoves.*;

public class Tyrogue extends Pokemon {
    public Tyrogue(String name, int level) {
        super(name, level);
        setStats(35, 35, 35, 35, 35, 35);
        setType(Type.FIGHTING);
        setMove(new Rest(), new Facade(),new LowSweep());
    }
}
