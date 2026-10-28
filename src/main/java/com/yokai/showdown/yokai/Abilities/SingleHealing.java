package com.yokai.showdown.yokai.Abilities;
import java.util.List;

import com.yokai.showdown.yokai.Effect;
import com.yokai.showdown.yokai.Yokai;

public class SingleHealing implements Effect{
    private final int power;

    public SingleHealing(int power) {
        this.power = power;
    }
    
    @Override 
    public void apply(Yokai origin, List<Yokai> objectives) {
        for(Yokai objective : objectives){
            objective.setIvHP(Math.min(objective.getIvMaxHP(), (origin.getIvSpirit() * power + objective.getIvHP())));
        }
    }
}
