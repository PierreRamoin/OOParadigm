package com.pierreramoin.example1.company.material;

public class Amount {
    private final double weightInKg;

    public Amount(double weightInKg) {
        this.weightInKg = weightInKg;
    }

    boolean isGreaterOrEqualTo(Amount other) {
        return weightInKg > other.weightInKg;
    }

    public Amount plus(Amount amount) {
        return new Amount(weightInKg + amount.weightInKg);
    }

    public Amount minus(Amount amount) {
        return new Amount(weightInKg - weightInKg);
    }
}
