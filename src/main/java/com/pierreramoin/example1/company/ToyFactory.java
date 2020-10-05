package com.pierreramoin.example1.company;

import com.pierreramoin.example1.company.material.MaterialStock;

public class ToyFactory {
    public Toy create(ToyRecipe toyRecipe, MaterialStock materialStock) {
        materialStock.usePlastic(toyRecipe.getPlasticNeeds());
        materialStock.useMetal(toyRecipe.getMetalNeeds());
        return new Toy(toyRecipe.getToyName());
    }
}
