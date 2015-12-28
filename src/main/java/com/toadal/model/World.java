package com.toadal.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class World {
    private List<Player> players = new ArrayList<Player>();

    private List<Continent> continents = new ArrayList<Continent>();

    protected World() {

    }

    public List<Continent> getContinents() {
        return Collections.unmodifiableList(continents);
    }

    public List<Player> getPlayers() {
        return players;
    }

    protected void setContinents(List<Continent> continents) {
        this.continents = continents;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}
