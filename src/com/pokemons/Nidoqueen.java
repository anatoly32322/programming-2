package com.pokemons;

import ru.ifmo.se.pokemon.*;
import com.attacks.*;

public class Nidoqueen extends Nidorina {
    public Nidoqueen(String name, int lvl) {
        super(name, lvl);
        setType(Type.POISON);
        setStats(90, 92, 87, 75, 85, 76);
        setMove(new Facade(), new Swagger(), new Growl(), new StoneEdge());
    }
}
