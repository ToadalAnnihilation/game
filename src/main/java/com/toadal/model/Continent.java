package com.toadal.model;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    private List<Territory> territories = new ArrayList<Territory>();
    private String name;

    public Continent(String s) {
        setName(s);
    }

    public String getName() {
        return name;
    }

    public List<Territory> getTerritories() {
        return territories;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTerritories(List<Territory> territories) {
        this.territories = territories;
    }
}
