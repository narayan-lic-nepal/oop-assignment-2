package com.np.thapanarayan.question2;

public class SavingAccount extends Account {

    public SavingAccount(String accountNumber) {
        super(accountNumber);
        this.setInterestRate(5.5);
    }

    @Override
    public void withdraw(Double amount) {
        System.out.println("---------------------------------------------");
        System.out.println("Amount cannot be withdrawn from Saving Account");
        System.out.println("---------------------------------------------");
    }

    @Override
    public String toString() {
        return "Account Details : "
                + "\n\t Account Type : Saving Account"
                + ",\n\t accountNumber : " + super.getAccountNumber()
                + ",\n\t Balance : " + super.getBalance()
                + ",\n\t Interest Rate : " + super.getInterestRate();
    }

}
