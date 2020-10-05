package com.pierreramoin.example1.company.money;

public class Money {
    private double amount;

    public Money(double amount) {
        this.amount = amount;
    }

    public Money minus(Money amount) {
        return new Money(this.amount - amount.amount);
    }

    public Money plus(Money amount) {
        return new Money(this.amount + amount.amount);
    }

    public Money multiply(double factor) {
        return new Money(amount * factor);
    }

    @Override
    public String toString() {
        return String.valueOf(amount);
    }
}
