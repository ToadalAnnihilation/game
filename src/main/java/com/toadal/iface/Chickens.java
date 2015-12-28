package com.toadal.iface;

import java.util.List;

import org.junit.Test;

import com.toadal.model.Continent;
import com.toadal.model.World;
import com.toadal.model.WorldFactory;

public class Chickens {
    @Test
    public void hacker(){
        World w = WorldFactory.newWorld();
        List<Continent> list = w.getContinents();
        
        list.clear();
        list.add(new Continent("foo"));
    }
}
