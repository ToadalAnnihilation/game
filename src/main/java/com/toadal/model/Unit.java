package com.toadal.model;

public class Unit {
    public enum Type {
        Army, Missile, Radiation
    }

    private Type type;

    private String name;

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
