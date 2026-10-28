package com.yokai.showdown.yokai.Abilities;
import java.util.List;
import com.yokai.showdown.yokai.Effect;
import com.yokai.showdown.yokai.Yokai;

public class MultipleHealing implements Effect{
    private final int power;
    
    
    public MultipleHealing(int power, List<Yokai> objetives) {
        this.power = power;
    }

     @Override
    public void apply(Yokai origin, List<Yokai> objectives) {
        int healing = origin.getIvSpirit() * power;
        for (Yokai objective : objectives) {
            objective.setIvHP(Math.min(objective.getIvMaxHP(), objective.getIvHP() + healing));
        }
    }
    
}
