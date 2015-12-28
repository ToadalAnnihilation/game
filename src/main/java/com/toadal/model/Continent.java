package com.toadal.model;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    private List<Territory> territories = new ArrayList<Territory>();

    public List<Territory> getTerritories() {
        return territories;
    }

    public void setTerritories(List<Territory> territories) {
        this.territories = territories;
    }
}
