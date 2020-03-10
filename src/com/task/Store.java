package com.task;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Store {
    private Customer [] customers;
    Store ()
    {
        customers = new Customer[5];
        customers[0] = new Customer(111,"Pushkin", "Alexander", "Sergeyevich","18th century Moscow",1645,"BYN123475248747");
        customers[1] = new Customer(111,"Gogol", "Nikolay", "Vasilievich","19th century Moscow",9658,"BYN357875248747");
        customers[2] = new Customer(111,"Tolstoy", "Leo", "Nikolaevich","19th century Moscow",23,"BYN123471478747");
        customers[3] = new Customer(111,"Rowling", "Joanne", "Kathleen","21th century London",65477,"BYN214775248747");
        customers[4] = new Customer(111,"Nekrasov ", "Nikolay", "Alekseevich","20th century Moscow",5,"BYN365872214747");
    }
    private void sortCustomers ()
    {
        Arrays.sort(customers, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getLastName().compareToIgnoreCase(o2.getLastName());
            }
        });
    }
    public void getCustomersBySort()
    {
        sortCustomers();
        Output();
    }
    public void Output () {
        for (Customer c : customers) {
            System.out.println(c.toString());
        }
    }
   public  void getCustomersByDiapasonCreaditCard (int start , int end )
    {
        for (Customer c : customers) {
            if (c.getNumberOfCreditCard() >= start && c.getNumberOfCreditCard() <= end) {
                System.out.println(c.toString());
            }
        }
    }
}
