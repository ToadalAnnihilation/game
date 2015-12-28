package com.toadal.model;

import org.junit.Test;

public class CreateGameTest {
    @Test
    public void testCreateGame(){
        Game g = GameFactory.makeGame();
    }
}
