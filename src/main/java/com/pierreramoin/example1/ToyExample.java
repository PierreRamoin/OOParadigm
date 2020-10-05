package com.pierreramoin.example1;

import com.pierreramoin.example1.company.*;
import com.pierreramoin.example1.company.country.CountryFrance;
import com.pierreramoin.example1.company.material.Amount;
import com.pierreramoin.example1.company.money.Money;

public class ToyExample {
    public static void main(String[] args) {
        ToyCompany toyCompany = new ToyCompany(new CountryFrance());
        ToyRecipe barbieRecipe = new ToyRecipe(new Amount(2), new Amount(0), "Barbie bicycle");
        PostalAddress clientAddress = new PostalAddress("199 chemin de l'impasse, 06000 Nice, France");

        toyCompany.receiveMetal(new Amount(1), new Money(2));
        toyCompany.receivePlastic(new Amount(4), new Money(15));
        toyCompany.produce(barbieRecipe);
        toyCompany.sell("Barbie bicycle", new Money(20), clientAddress);
    }
}
