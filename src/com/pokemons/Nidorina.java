package com.pokemons;

import ru.ifmo.se.pokemon.*;
import com.attacks.*;

public class Nidorina extends NidoranF {
    public Nidorina(String name, int lvl) {
        super(name, lvl);
        setType(Type.POISON);
        setStats(70, 62, 67, 55, 55, 56);
        setMove(new Facade(), new Swagger(), new Growl());
    }

}
