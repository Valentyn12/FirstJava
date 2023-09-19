package edu.hneu.mjt.Valentyn;

public class CreditBankCard extends BankCard {

    private double creditLimit;
    private double balance;

    public CreditBankCard(String number, User user, double creditLimit) {
        super(number, user);
        this.creditLimit = creditLimit;
        this.balance = 0.0;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public double getBalance() {
        return balance;
    }

    public void makePurchase(double amount) {
        if (amount <= creditLimit - balance) {
            balance += amount;
            System.out.println("Зроблено покупку на суму " + amount);
        } else {
            System.out.println("Помилка: перевищено кредитний ліміт.");
        }
    }
}