package com.pokemons;

import ru.ifmo.se.pokemon.*;
import com.attacks.*;

public class Pheromosa extends Pokemon{
    public Pheromosa(String name, int level){
        super(name, level);
        setStats(71, 137, 37, 137, 37, 151);
        setType(Type.BUG, Type.FIGHTING);
        setMove(new Harden(), new Superpower(),  new Confide(), new Rest());
    }
}
