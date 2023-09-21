package edu.hneu.mjt.Valentyn.api;


import edu.hneu.mjt.Valentyn.BankCard;
import edu.hneu.mjt.Valentyn.Subscription;
import edu.hneu.mjt.Valentyn.User;

import java.util.List;
import java.util.Optional;

public interface Service {
    void subscribe(BankCard bankCard);

    Optional<Subscription> getSubscriptionByBankCardNumber(String cardNumber);

    List<User> getAllUsers();
}