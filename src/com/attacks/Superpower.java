package com.attacks;

import ru.ifmo.se.pokemon.*;

public class Superpower extends PhysicalMove {
    public Superpower(){
        super(Type.NORMAL, 120, 100);
    }
    @Override
    protected void applySelfEffects(Pokemon atk){
        atk.setMod(Stat.ATTACK, 1);
        atk.setMod(Stat.ACCURACY, 1);
    }
}
