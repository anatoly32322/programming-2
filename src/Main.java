

import com.pokemons.*;
import com.attacks.*;
import ru.ifmo.se.pokemon.*;

public class Main {

    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Pheromosa("1", 10);
        Pokemon p2 = new Nidorina("2", 10);
        Pokemon p3 = new Hitmonchan("3", 10);
        Pokemon p4 = new Nidoqueen("4", 10);
        Pokemon p5 = new NidoranF("5", 10);
        Pokemon p6 = new Tyrogue("6", 10);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}
