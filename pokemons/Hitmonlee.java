package pokemons;

import ru.ifmo.se.pokemon.*;
import pokemonMoves.*;

public class Hitmonlee extends Tyrogue {
    public Hitmonlee(String name, int level) {
        super(name, level);
        setStats(50, 120, 53, 35, 110, 87);
        setType(Type.FIGHTING);
        setMove(new Rest(), new Facade(),new LowSweep(), new Waterfall()); // Waterfall не дописан
    }
}
