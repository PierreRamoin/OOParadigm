package com.pierreramoin.example1.company;

public class Toy {
    private final String name;

    public Toy(String name) {
        this.name = name;
    }

    public boolean isType(String toyType) {
        return name.equals(toyType);
    }
}
