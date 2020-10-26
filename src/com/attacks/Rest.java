package com.attacks;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest(){
        super(Type.PSYCHIC, 0, 0);
    }
    @Override
    protected boolean checkAccuracy(Pokemon atk, Pokemon def){
        return true;
    }

    protected void applySelfEffects(Pokemon atk){
        atk.setMod(Stat.HP, -((int)atk.getStat(Stat.HP) - (int)atk.getHP()));
        Effect var1 = (new Effect()).condition(Status.SLEEP).attack(0.0D).turns(2);
        atk.setCondition(var1);
    }
}
