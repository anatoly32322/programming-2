package com.attacks;

import ru.ifmo.se.pokemon.*;

public class Harden extends StatusMove {
    public Harden(){
        super(Type.NORMAL, 0, 0);
    }
    @Override
    protected boolean checkAccuracy(Pokemon atk, Pokemon def){
        return true;
    }
    protected void applySelfEffects(Pokemon atk){
        atk.setMod(Stat.DEFENSE, 1);
    }
}
