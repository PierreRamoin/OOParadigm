package com.pierreramoin.example1.company.country;

import com.pierreramoin.example1.company.money.BankAccount;
import com.pierreramoin.example1.company.money.Money;

public class CountryFrance implements Country {
    @Override
    public void payTaxesOnSale(BankAccount bankAccount, Money objectPrice) {
        bankAccount.pay("Taxes", objectPrice.multiply(0.2));
    }
}
