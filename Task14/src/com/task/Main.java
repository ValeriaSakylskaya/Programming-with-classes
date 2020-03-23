package com.task;

import Enums.AccountStatus;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /*. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
        счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
        всем счетам, имеющим положительный и отрицательный балансы отдельно.*/
        Account account1 = new Account("1234", -20, AccountStatus.Unlocked);
        Account account2 = new Account("1034", 20, AccountStatus.Unlocked);
        Account account3 = new Account("2568", 80, AccountStatus.Unlocked);
        Client client = new Client("Bob");
        client.addAccount(account1);
        client.addAccount(account2);
        client.addAccount(account3);
        System.out.println(client.getAccounts().toString());
        client.SortAccount();
        System.out.println(client.getAccounts().toString());
        client.searchAccount("1034");
        System.out.println("sum: " + client.sumAllBalance());
        System.out.println("sum positive balance: " + client.getSumOfPositiveBalance());
        System.out.println("sum negative: " + client.getSumOfNegativeBalance());
    }
}
