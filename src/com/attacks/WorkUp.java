package com.attacks;

import ru.ifmo.se.pokemon.*;

public class WorkUp extends StatusMove{
    public WorkUp(){
        super(Type.NORMAL, 0, 0);
    }
    @Override
    protected boolean checkAccuracy(Pokemon atk, Pokemon def){
        return true;
    }
    protected void applySelfEffects(Pokemon atk){
        atk.setMod(Stat.ATTACK, 1);
        atk.setMod(Stat.SPECIAL_ATTACK, 1);
    }
}
