package com.yokai.showdown.yokai.Abilities;
import java.util.List;

import com.yokai.showdown.yokai.Effect;
import com.yokai.showdown.yokai.Yokai;

public class MultipleAttack implements Effect{
    public final int power;
    public final int hits;

    public MultipleAttack(int power, int hits){
        this.power = power;
        this.hits = hits;
    }

    @Override
        public void apply(Yokai origin, List<Yokai> objectives) {
        for (Yokai objective : objectives) {
            int damage = power * origin.getIvStrength() / Math.max(1, objective.getIvDefense());
            objective.setIvHP(Math.max(0, objective.getIvHP() - Math.max(1, damage)));
    }

    }
    
}
