package com.attacks;

import ru.ifmo.se.pokemon.*;

public class StoneEdge extends PhysicalMove {
    public StoneEdge() {
        super(Type.ROCK, 100, 80);
    }

    @Override
    protected double calcCriticalHit(Pokemon atk, Pokemon def) {
        if (Math.random() <= 1.0 / 8) {
              return 2.0D;
        }
        else {
            return 1.0D;
        }
    }
}
