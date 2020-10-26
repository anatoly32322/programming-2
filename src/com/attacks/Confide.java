package com.attacks;

import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove{
    public Confide(){
        super(Type.NORMAL, 0, 0);
    }
    @Override
    protected boolean checkAccuracy(Pokemon atk, Pokemon def){
        return true;
    }
    protected void applyOppEffects(Pokemon def){
        def.setMod(Stat.SPECIAL_ATTACK, -1);
    }
}
