package com.toadal.model;

import java.util.ArrayList;
import java.util.List;

public class Territory {
    private String name;
    private List<Territory> adjacent = new ArrayList<Territory>();
    private String defaultName;
    private int size;

    public List<Territory> getAdjacent() {
        return adjacent;
    }

    public String getDefaultName() {
        return defaultName;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public void setAdjacent(List<Territory> adjacent) {
        this.adjacent = adjacent;
    }

    public void setDefaultName(String defaultName) {
        this.defaultName = defaultName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
