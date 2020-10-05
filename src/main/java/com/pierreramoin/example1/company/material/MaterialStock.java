package com.pierreramoin.example1.company.material;

public class MaterialStock {
    private Amount plastic;
    private Amount metal;

    public MaterialStock(Amount initialPlastic, Amount initialMetal) {
        plastic = initialPlastic;
        metal = initialMetal;
    }

    public void stockPlastic(Amount amount) {
        plastic = plastic.plus(amount);
    }

    public void stockMetal(Amount amount) {
        metal = metal.plus(amount);
    }

    public void usePlastic(Amount amount) {
        plastic = amount.minus(amount);
    }

    public void useMetal(Amount amount) {
        metal = metal.minus(amount);
    }
}
