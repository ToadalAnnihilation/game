package com.toadal.model;

import java.util.ArrayList;
import java.util.List;

public class Player {
    // Variables
    private String name;
    private String color;
    private List<Territory> occupied = new ArrayList<Territory>();

    public List<Territory> getOccupied() {
        return occupied;
    }

    public void setOccupied(List<Territory> occupied) {
        this.occupied = occupied;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
