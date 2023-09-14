package com.example.dto;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        User user = new User("Valik", "Hladkykh", LocalDate.of(2003, 9, 2));
        BankCard bankCard = new BankCard("A4528nvk",user);
        Subscription subscription = new Subscription("4444-9028-2567-1247",LocalDate.of(2005, 5, 8));

        System.out.println("Name: " + user.getName());
        System.out.println("Surname: " + user.getSurname());
        System.out.println("Birthday: " + user.getBirthday());

        System.out.println("Number:" + bankCard.getNumber());
        System.out.println("User:" + user.getName());

        System.out.println("bankcard:" + subscription.getBankcard());
        System.out.println("startdate:" + subscription.getStartDate());

    }

}