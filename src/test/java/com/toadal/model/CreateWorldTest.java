package com.toadal.model;

import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Test;

public class CreateWorldTest {
    @Test
    public void testCreateWorld(){
        World w = new World();
        
        assertNotNull("World was null", w.getContinents());
//        Assert.assertNotEquals("No territories added",  0, w.getTerritories().size());
    }
}
