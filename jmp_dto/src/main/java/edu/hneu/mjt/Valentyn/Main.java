package edu.hneu.mjt.Valentyn;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {

        User user = new User("Valentyn", "Hladkykh", LocalDate.of(2003, 9, 2));
        BankCard bankCard = new BankCard("A4528nvk", user);
        Subscription subscription = new Subscription("4444-9028-2567-1247", LocalDate.of(2019, 5, 8));
        CreditBankCard creditCard = new CreditBankCard("3333-1111-2222-4444", user, 1000.0);
        DebitBankCard debitCard = new DebitBankCard("1245-6789-1011-1213", user, 500.0);
        BankCardType creditCardType = BankCardType.CREDIT;
        BankCardType debitCardType = BankCardType.DEBIT;


        System.out.println("Name: " + user.getName());
        System.out.println("Surname: " + user.getSurname());
        System.out.println("Birthday: " + user.getBirthday());

        System.out.println("Number:" + bankCard.getNumber());
        System.out.println("User:" + user.getName());

        System.out.println("bankcard:" + subscription.getBankcard());
        System.out.println("startdate:" + subscription.getStartDate());

        creditCard.makePurchase(200.0);
        creditCard.makePurchase(700.0);
        creditCard.makePurchase(100.0);
        creditCard.makePurchase(100.0);

        debitCard.makePurchase(50.0);
        debitCard.makePurchase(400.0);
        debitCard.makePurchase(50.0);
        debitCard.makePurchase(50.0);

    }

}