package com.pierreramoin.example1.company.country;

import com.pierreramoin.example1.company.money.BankAccount;
import com.pierreramoin.example1.company.money.Money;

public interface Country {
    void payTaxesOnSale(BankAccount bankAccount, Money objectPrice);
}
