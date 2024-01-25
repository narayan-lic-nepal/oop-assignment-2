package com.np.thapanarayan.question2;

public class MainApp {

    public static void main(String[] args) {
        savingAccountOperations();
        checkingAccountOperations();

    }

    private static void savingAccountOperations() {
        SavingAccount savingAccount = new SavingAccount("SAV-2023-5645");
        savingAccount.setInterestRate(8.0);

        System.out.println("Saving Account Details");
        System.out.println(savingAccount);

        double depositAmount = 15000d;
        System.out.println("\nDepositing to Saving Account : " + depositAmount);
        savingAccount.deposit(depositAmount);

        double withDrawAmount = 1000d;
        System.out.println("Trying to Withdraw : " + withDrawAmount);
        savingAccount.withdraw(withDrawAmount);

        depositAmount = 5000d;
        System.out.println("Depositing to Saving Account :" + depositAmount);
        savingAccount.deposit(depositAmount);

        System.out.println("\n\nSaving Account Details: ");
        System.out.println(savingAccount);
    }

    private static void checkingAccountOperations() {
        CheckingAccount checkingAccount = new CheckingAccount("CHK-2023-9845");
        checkingAccount.setInterestRate(2.0);
        checkingAccount.setOverDraftLimit(10000);

        System.out.println("Checking Account Details");
        System.out.println(checkingAccount);


        double depositAmount = 15000d;
        System.out.println("\nDepositing to Checking Account : " + depositAmount);
        checkingAccount.deposit(depositAmount);

        double withDrawAmount = 10000d;
        System.out.println("Trying to Withdraw :" + withDrawAmount);
        checkingAccount.withdraw(withDrawAmount);

        withDrawAmount = 8000d;
        System.out.println("Trying to Withdraw :" + withDrawAmount);
        checkingAccount.withdraw(withDrawAmount);

        System.out.println(checkingAccount);

        withDrawAmount = 20000d;
        System.out.println("Trying to Withdraw :" + withDrawAmount);
        checkingAccount.withdraw(withDrawAmount);

        System.out.println(checkingAccount);
    }
}
