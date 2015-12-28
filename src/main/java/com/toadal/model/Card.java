package com.toadal.model;

public class Card {
    public enum Type {
        Wild, Soldier, Cannon, Horse
    }

    private Type type;

    private Territory territory;

    public Territory getTerritory() {
        return territory;
    }

    public Type getType() {
        return type;
    }

    public void setTerritory(Territory territory) {
        this.territory = territory;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
