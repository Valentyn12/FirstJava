package edu.hneu.mjt.Valentyn.impl;

import edu.hneu.mjt.Valentyn.BankCard;
import edu.hneu.mjt.Valentyn.Subscription;
import edu.hneu.mjt.Valentyn.User;
import edu.hneu.mjt.Valentyn.api.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.Flow;

public class ServiceImplementation implements Service {


    private Map<String, BankCard> bankCards = new HashMap<>();
    private Map<String, Flow.Subscription> subscriptions = new HashMap<>();
    private List<User> users = new ArrayList<>();

    @Override
    public void subscribe(BankCard card) {

    }

    @Override
    public Optional<Subscription> getSubscriptionByBankCardNumber(String cardNumber) {
        return Optional.empty();
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }
}