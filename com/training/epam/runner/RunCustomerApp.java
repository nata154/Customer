package com.training.epam.com.trainig.epam.runner;

import com.training.epam.entity.Customer;
import com.training.epam.manager.CustomerManager;

import java.math.BigInteger;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class RunCustomerApp {
    public static void main(String[] args) {
        List<Customer> listCustomer = new ArrayList<Customer>();
        CustomerManager customerManager = new CustomerManager(listCustomer);

        Customer customer1 = new Customer(12, "Ivanov", "Ivan", "Ivanovich",
                "Nemanskaya", new BigInteger("1111222233334444"), new BigInteger("1111222233334444"));
        Customer customer2 = new Customer(15, "Petrov", "Petr", "Petrovich",
                "Lidskaya", new BigInteger("1111333344445555"), new BigInteger("1111333344445555"));
        Customer customer3 = new Customer(19, "Petrova", "Anna", "Petrovna",
                "Lucinskaya", new BigInteger("2222333344445555"), new BigInteger("1111222233334444"));
        Customer customer4 = new Customer(1, "Andreew", "Andrei", "Andreevich",
                "Kazimirovskaya", new BigInteger("6666333344445555"), new BigInteger("5555333344445555"));

        listCustomer.add(customer1);
        listCustomer.add(customer2);
        listCustomer.add(customer3);
        listCustomer.add(customer4);

        for (Customer customer : listCustomer) {
            System.out.println(customer);
        }
        System.out.println();

        customerManager.getCustomerListInAlphabetOrder(listCustomer);
        System.out.println();

        customerManager.getCustomerListByBankAccountInBetweenLimits(listCustomer, new BigInteger("1111333344449999"), new BigInteger("3333222211113333"));

    }
}
