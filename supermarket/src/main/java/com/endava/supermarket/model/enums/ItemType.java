package com.endava.supermarket.model.enums;

public enum ItemType {
    FOOD("Food"), DRINKS("Drinks"), TECHNOLOGY("Technology"), HOUSEHOLD("Household");
    private final String type;

    ItemType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
