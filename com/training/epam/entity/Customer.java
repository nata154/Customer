package com.training.epam.entity;

import java.math.BigInteger;

public class Customer {
    private int id;
    private String lastName;
    private String firstName;
    private String middleName;
    private String address;
    private BigInteger creditCard;
    private BigInteger bankAccount;

    public Customer() {
    }

    public Customer(int id, String lastName, String firstName, String middleName, String address, BigInteger creditCard, BigInteger bankAccount) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.address = address;
        this.creditCard = creditCard;
        this.bankAccount = bankAccount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigInteger getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(BigInteger creditCard) {
        this.creditCard = creditCard;
    }

    public BigInteger getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BigInteger bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String toString() {
        return "Customer:  " +
                "id = " + id + ", " +
                "lastName = " + lastName + ", " +
                "firstName = " + firstName + ", " +
                "middleName = " + middleName + ", " +
                "address = " + address + ", " +
                "bankAccount = " + bankAccount + ";";
    }
}
