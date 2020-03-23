package com.task;

public class Customer {
    private int Id;
    private String firstName;
    private String secondName;
    private String lastName;
    private String address;
    private int numberOfCreditCard;
    private String numberOfBankAccount;

    Customer(int id, String lastName, String firstName, String secondName, String address, int numberOfCreditCard, String numberOfBankAccount) {
        this.Id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.secondName = secondName;
        this.address = address;
        this.numberOfCreditCard = numberOfCreditCard;
        this.numberOfBankAccount = numberOfBankAccount;
    }

    public int getId() {
        return Id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getAddress() {
        return address;
    }

    public int getNumberOfCreditCard() {
        return numberOfCreditCard;
    }

    public String getNumberOfBankAccount() {
        return numberOfBankAccount;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setNumberOfBankAccount(String numberOfBankAccount) {
        this.numberOfBankAccount = numberOfBankAccount;
    }

    public void setNumberOfCreditCard(int numberOfCreditCard) {
        this.numberOfCreditCard = numberOfCreditCard;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return "Customer: " + this.lastName + " " + this.firstName + " " + this.secondName + " address: "
                + this.address + " number of credit card " + this.numberOfCreditCard +
                " number of bank account " + this.numberOfBankAccount;
    }
}
