package com.pierreramoin.example1.company.money;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private Money balance;
    private List<Transaction> transactions;

    public BankAccount() {
        balance = new Money(0);
        transactions = new ArrayList<>();
    }

    public void pay(String transactionName, Money price) {
        balance = balance.minus(price);
        Transaction transaction = new Transaction(transactionName, price, TransactionType.EXPENSE);
        transactions.add(transaction);
    }

    public void receiveMoney(String transactionName, Money price) {
        balance = balance.plus(price);
        Transaction transaction = new Transaction(transactionName, price, TransactionType.REVENUE);
        transactions.add(transaction);
    }

    public void printTransactions() {
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }

    public void printBalance() {
        System.out.println(balance);
    }
}
