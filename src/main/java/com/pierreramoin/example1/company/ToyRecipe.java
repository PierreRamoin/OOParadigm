package com.pierreramoin.example1.company;

import com.pierreramoin.example1.company.material.Amount;

public class ToyRecipe {
    private Amount plasticNeeds;
    private Amount metalNeeds;
    private String name;

    public ToyRecipe(Amount plasticNeeds, Amount metalNeeds, String name) {
        this.plasticNeeds = plasticNeeds;
        this.metalNeeds = metalNeeds;
        this.name = name;
    }

    public Amount getPlasticNeeds() {
        return plasticNeeds;
    }

    public Amount getMetalNeeds() {
        return metalNeeds;
    }

    public String getToyName() {
        return name;
    }
}
