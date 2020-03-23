package com.task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Client {
    private String name;
    private ArrayList<Account> accounts = new ArrayList();

    Client(String name) {
        this.name = name;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public void searchAccount(String nameAccount) {
        for (Account account : this.accounts) {
            if (account.getAccountNumber() == nameAccount)
                System.out.println(account.toString());
        }
    }

    public void SortAccount() {
        Collections.sort(accounts, new Comparator<Account>() {
            @Override
            public int compare(Account firstAccount, Account secondAccount) {
                String firstAccountNumber = firstAccount.getAccountNumber();
                String secondAccountNumber = secondAccount.getAccountNumber();
                return firstAccountNumber.compareToIgnoreCase(secondAccountNumber);
            }
        });
    }

    public double sumAllBalance() {
        double sum = 0;
        for (Account ac : this.accounts) {
            sum = sum + ac.getBalance();
        }
        return sum;
    }

    public double getSumOfPositiveBalance() {
        double sum = 0;
        for (Account account : this.accounts) {
            if (account.getBalance() > 0)
                sum = sum + account.getBalance();
        }
        return sum;
    }

    public double getSumOfNegativeBalance() {
        double sum = 0;
        for (Account account : this.accounts) {
            if (account.getBalance() < 0)
                sum = sum + account.getBalance();
        }
        return sum;
    }
}
