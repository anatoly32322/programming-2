package com.pokemons;

import ru.ifmo.se.pokemon.*;
import com.attacks.*;

public class Tyrogue extends Pokemon{
    public Tyrogue(String name, int lvl){
        super(name, lvl);
        setStats(35, 35, 35, 35, 35, 35);
        setType(Type.FIGHTING);
        setMove(new LowSweep(), new Confide(), new WorkUp());
    }
}
