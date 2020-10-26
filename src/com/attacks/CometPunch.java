package com.attacks;

import ru.ifmo.se.pokemon.*;

public class CometPunch extends PhysicalMove {
    /*protected com.attacks.CometPunch(Pokemon p){
        super(Type.NORMAL, 18, 85);
    }*/
    public CometPunch() {
        super(Type.NORMAL, 18, 85);
        double rnd = Math.random();
        int x;
        if (rnd < 3.0 / 8) {
            x = 2;
        }
        else if (rnd < 6.0 / 8) {
            x = 3;
        }
        else if (rnd < 7.0 / 8) {
            x = 4;
        }
        else {
            x = 5;
        }
        this.hits = x;
    }

    @Override
    protected double calcCriticalHit(Pokemon atk, Pokemon def) {
        if (Math.random() <= 0.0625) {
            return 2.0D;
        }
        else {
            return 1.0D;
        }
    }
}
