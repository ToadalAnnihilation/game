package com.toadal.model;

import java.util.ArrayList;
import java.util.List;

public class World {
    private List<Territory> territories = new ArrayList<Territory>();
    private List<Player> players = new ArrayList<Player>();

    public List<Player> getPlayers() {
        return players;
    }

    public List<Territory> getTerritories() {
        return territories;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public void setTerritories(List<Territory> territories) {
        this.territories = territories;
    }
}
