package org.example;

import edu.hneu.mjt.Valentyn.BankCard;
import edu.hneu.mjt.Valentyn.User;
import edu.hneu.mjt.Valentyn.BankCardType;

public interface Bank {
    BankCard createBankCard(User user, BankCardType cardType);
}