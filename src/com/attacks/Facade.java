package com.attacks;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected double calcCriticalHit(Pokemon atk, Pokemon def){
        Status stt = atk.getCondition();
        if (stt == Status.BURN || stt == Status.POISON || stt == Status.PARALYZE){
            return 2.0D;
        }
        else{
            return 1.0D;
        }
    }
}
