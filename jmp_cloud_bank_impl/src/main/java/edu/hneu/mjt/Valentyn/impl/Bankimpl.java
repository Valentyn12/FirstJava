package edu.hneu.mjt.Valentyn.impl;

import edu.hneu.mjt.Valentyn.bank.Bank;
import edu.hneu.mjt.Valentyn.*;


public class Bankimpl implements Bank {
    public BankCard createBankCard(User user, BankCardType cardType) {
        if (cardType == BankCardType.CREDIT) {
            return new CreditBankCard("3333-1111-2222-4444", user, 1000.0);
        } else if (cardType == BankCardType.DEBIT) {
            return new DebitBankCard("1245-6789-1011-1213", user, 500.0);
        } else {
            throw new IllegalArgumentException("Неподдерживаемый тип карты");
        }
    }
}