package com.training.epam.manager;

import com.training.epam.entity.Customer;

import java.math.BigInteger;
import java.sql.SQLOutput;
import java.util.*;

public class CustomerManager {
    List<Customer> listCustomer = new ArrayList<Customer>();

    public CustomerManager(List<Customer> listCustomer) {
        this.listCustomer = listCustomer;
    }

    public List<Customer> getListCustomer() {
        return listCustomer;
    }

    public void setListCustomer(List<Customer> listCustomer) {
        this.listCustomer = listCustomer;
    }

    public List<Customer> getCustomerListInAlphabetOrder(List<Customer> listCustomer) {
        List<Customer> listCustomerInAlphabetOrder = new ArrayList<Customer>();
        listCustomerInAlphabetOrder.addAll(listCustomer);
        if (!listCustomerInAlphabetOrder.isEmpty()) {
            Collections.sort(listCustomerInAlphabetOrder, new Comparator<Customer>() {
                @Override
                public int compare(Customer o1, Customer o2) {
                    return o1.getLastName().compareTo(o2.getLastName());
                }
            });
        }
        for (Customer customer : listCustomerInAlphabetOrder) {
            System.out.println(customer);
        }
        return listCustomerInAlphabetOrder;
    }

    public List<Customer> getCustomerListByBankAccountInBetweenLimits(List<Customer> listCustomer, BigInteger firstLimit, BigInteger lastLimit) {
        List<Customer> listCustomerByBankAccountInBetweenLimits = new ArrayList<Customer>();
        Customer customer = new Customer();
        System.out.println("FirstLimit = " + firstLimit + ", lastLimit = " + lastLimit +";");

        for (int i = 0; i < listCustomer.size(); i++) {
            if (!((listCustomer.get(i).getBankAccount().compareTo(firstLimit) >= 0) & (listCustomer.get(i).getBankAccount().compareTo(lastLimit) <= 0))) {
                customer = listCustomer.get(i);
                System.out.println(customer);
                listCustomerByBankAccountInBetweenLimits.add(customer);
            }
        }
        return listCustomerByBankAccountInBetweenLimits;
    }
}

//    public List<Customer> getCustomerListByBankAccountInBetweenLimits(List<Customer> listCustomer, BigInteger firstLimit, BigInteger lastLimit) {
//        List<Customer> listCustomerByBankAccountInBetweenLimits = new ArrayList<Customer>();
//        listCustomerByBankAccountInBetweenLimits.addAll(listCustomer);
//        if (!listCustomer.isEmpty()) {
//            Iterator<Customer> iterator = listCustomerByBankAccountInBetweenLimits.iterator();
//            while (iterator.hasNext()) {
//                Customer customer = iterator.next();
//                if (((customer.getBankAccount().compareTo(firstLimit) == -1) || (customer.getBankAccount().compareTo(lastLimit) == 1))) {
//                    iterator.remove();
//                }
//            }
//        }
//        for (Customer customer : listCustomerByBankAccountInBetweenLimits) {
//            System.out.println(customer);
//        }
//        return listCustomerByBankAccountInBetweenLimits;
//    }




