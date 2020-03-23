package com.task;

import Enums.AccountStatus;

public class Account {
    private String numberAccount;
    private double balance;
    AccountStatus status;

    public Account(String numberAccount, double balance, AccountStatus status) {
        this.balance = balance;
        this.numberAccount = numberAccount;
        this.status = status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return numberAccount;
    }

    public double getBalance() {
        return balance;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void blockAccount(Account account) {
        account.status = AccountStatus.Blocked;
    }

    public void unLockAccount(Account account) {
        account.status = AccountStatus.Unlocked;
    }

    @Override
    public String toString() {
        return "account: " + this.numberAccount + " balance " + this.balance + " status " + this.status;
    }
}
