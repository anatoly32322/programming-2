package com.pokemons;

import ru.ifmo.se.pokemon.*;
import com.attacks.*;

public class Hitmonchan extends Tyrogue {
    public Hitmonchan(String name, int lvl){
        super(name, lvl);
        setStats(50, 105, 79, 35, 110, 76);
        setMove(new LowSweep(), new Confide(), new WorkUp(), new CometPunch());
    }
}
