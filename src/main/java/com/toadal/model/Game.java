package com.toadal.model;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private World world;

    private List<Player> players = new ArrayList<Player>();

    protected Game(){
        
    }
    
    public List<Player> getPlayers() {
        return players;
    }

    public World getWorld() {
        return world;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public void setWorld(World world) {
        this.world = world;
    }

}
