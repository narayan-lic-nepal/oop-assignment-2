package com.np.thapanarayan.question2;

public abstract class Account {
    private String accountNumber;
    private double balance;
    private double interestRate;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void deposit(Double amount) {
        if (amount > 0 ) {
            this.balance += amount;
        }
    }

    public void withdraw(Double amount) {
            this.balance -= amount;
    }
}
