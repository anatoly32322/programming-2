package com.attacks;

import ru.ifmo.se.pokemon.*;

public class LowSweep extends PhysicalMove {
    public LowSweep(){
        super(Type.PSYCHIC, 65, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon def){
        def.setMod(Stat.SPEED, -1);
    }
}
