package edu.hneu.mjt.Valentyn;

public class DebitBankCard extends BankCard {
    private double balance;

    public DebitBankCard(String number, User user, double balance) {
        super(number, user);
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void makePurchase(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Зроблено покупку на суму " + amount);
        } else {
            System.out.println("Помилка: недостатньо коштів на рахунку.");
        }
    }
}