package com.pokemons;

import ru.ifmo.se.pokemon.*;
import com.attacks.*;

public class NidoranF extends Pokemon{
    public NidoranF(String name, int lvl){
        super(name, lvl);
        setStats(55, 47, 52, 40, 40, 41);
        setType(Type.POISON);
        setMove(new Facade(), new Swagger());
    }
}
