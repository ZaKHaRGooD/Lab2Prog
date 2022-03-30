import pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Lab2Prog {
    public static void main(String[] args) {
        Battle battle = new Battle();

        Fletchling p1 = new Fletchling("Стефен", 1);
        Heatmor p2 = new Heatmor("Джеймс", 1);
        Hitmonlee p3 = new Hitmonlee("Леброн", 1);

        Fletchinder p4 = new Fletchinder("Клей", 1);
        Talonflame p5 = new Talonflame("Кевин", 1);
        Tyrogue p6 = new Tyrogue("Кайри", 1);

        battle.addAlly(p1);
        battle.addAlly(p2);
        battle.addAlly(p3);

        battle.addFoe(p4);
        battle.addFoe(p5);
        battle.addFoe(p6);

        battle.go();
    }
}
