package com.yokai.showdown.yokai;

import java.util.List;

public interface Effect {
    public void apply(Yokai origin, List<Yokai> objectives);
}
