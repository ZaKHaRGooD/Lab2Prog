package pokemons;

import ru.ifmo.se.pokemon.*;
import pokemonMoves.*;

public class Heatmor extends Pokemon {
    public Heatmor(String name, int level) {
        super(name, level);
        setStats(85, 97, 66, 105, 66, 65);
        setType(Type.FIRE);
        setMove(new Bulldoze(), new WoodHammer(), new SwordsDance(), new DoubleTeam());
    }
}
