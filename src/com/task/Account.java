package com.task;
import Enums.AccountStatus;

public class Account {
    private String numberAccount;
    private double Balance;
    AccountStatus status;
    Account(String numberAccount, double balance, AccountStatus status){
        this.Balance = balance;
        this.numberAccount = numberAccount;
        this.status = status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public String getNumberAccount() {
        return numberAccount;
    }

    public double getBalance() {
        return Balance;
    }

    public AccountStatus getStatus() {
        return status;
    }
    public void blockAccount (Account account)
    {
         account.status = AccountStatus.Blocked;
    }
    public void unLockAccount (Account account)
    {
        account.status = AccountStatus.Unlocked;
    }
    @Override
    public String toString()
    {
        return "account: " + this.numberAccount + " balance " + this.Balance + " status " + this.status;
    }
}
