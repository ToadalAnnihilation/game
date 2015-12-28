package com.toadal.model;

import java.util.ArrayList;
import java.util.List;

public class World {
    private List<Player> players = new ArrayList<Player>();
    public List<Continent> getContinents() {
        return continents;
    }

    public void setContinents(List<Continent> continents) {
        this.continents = continents;
    }

    private List<Continent> continents = new ArrayList<Continent>();

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}
