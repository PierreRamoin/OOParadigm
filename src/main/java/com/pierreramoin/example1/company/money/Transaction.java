package com.pierreramoin.example1.company.money;

public class Transaction {

    private final String transactionName;
    private final Money amount;
    private final TransactionType transactionType;

    public Transaction(String transactionName, Money amount, TransactionType transactionType) {
        this.transactionName = transactionName;
        this.amount = amount;
        this.transactionType = transactionType;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionName='" + transactionName + '\'' +
                ", amount=" + amount +
                ", transactionType=" + transactionType +
                '}';
    }
}
