package com.pierreramoin.example1.company;

import com.pierreramoin.example1.company.country.Country;
import com.pierreramoin.example1.company.material.Amount;
import com.pierreramoin.example1.company.material.MaterialStock;
import com.pierreramoin.example1.company.money.BankAccount;
import com.pierreramoin.example1.company.money.Money;

import java.util.ArrayList;
import java.util.List;

public class ToyCompany {
    private final List<Toy> toysStock;
    private final ToyFactory toyFactory;
    private final Country country;
    private final BankAccount bankAccount;
    private final MaterialStock materialStock;

    public ToyCompany(Country country) {
        this.country = country;
        materialStock = new MaterialStock(new Amount(0), new Amount(0));
        toysStock = new ArrayList<>();
        bankAccount = new BankAccount();
        toyFactory = new ToyFactory();
    }

    public void receivePlastic(Amount amount, Money price) {
        materialStock.stockPlastic(amount);
        bankAccount.pay("Plastic", price);
    }

    public void receiveMetal(Amount amount, Money price) {
        materialStock.stockMetal(amount);
        bankAccount.pay("Metal", price);
    }

    public void produce(ToyRecipe toyRecipe) {
        Toy toy = toyFactory.create(toyRecipe, materialStock);
        toysStock.add(toy);
    }

    public void sell(String toyType, Money price, PostalAddress clientAddress) {
        if (toysStock.removeIf((toy) -> toy.isType(toyType))) {
            country.payTaxesOnSale(bankAccount, price);
            bankAccount.receiveMoney(toyType, price);
            // Here should be the moment to send to the client, but we reduce the scope to simplify the exemple
            // Ici ce serait le moment d'envoyer au client, mais on limite le scope, pour simplifier l'exemple
        } else
            throw new RuntimeException("Not enough stock");
    }

    public void printBalance() {
        bankAccount.printBalance();
    }
}
