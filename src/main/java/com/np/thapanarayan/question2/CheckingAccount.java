package com.np.thapanarayan.question2;

public class CheckingAccount extends Account{

    private double overDraftLimit ;

    public CheckingAccount(String accountNumber) {
        super(accountNumber);
        this.setInterestRate(2.0);
    }

    public double getOverDraftLimit() {
        return overDraftLimit;
    }

    public void setOverDraftLimit(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public void withdraw(Double amount) {
        if(amount > 0 ) {
            if (amount <= ( getBalance() + overDraftLimit) ) {
                super.withdraw(amount);
            } else {
                System.out.println("--------------------------");
                System.out.println("Overdraft Limit exceeded: ");
                System.out.println("--------------------------");
            }
        }
    }

    @Override
    public String toString() {
        return "Account Details : "
                + "\n\t Account Type : Checking Account"
                + ",\n\t accountNumber : " + super.getAccountNumber()
                + ",\n\t Balance : " + super.getBalance()
                + ",\n\t Interest Rate : " + super.getInterestRate();
    }

}
