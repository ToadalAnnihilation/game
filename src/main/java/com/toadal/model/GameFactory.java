package com.toadal.model;

public class GameFactory {
    public static Game makeGame(){
        Game g = new Game();
        g.setWorld(WorldFactory.newWorld());
        return g;
    }
}
