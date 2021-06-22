package com.javalearning.javaStream;

import java.util.*;
import java.util.stream.Collectors;

public class CustomerEntity {
    public static void main(String[] args) {

        Customer customer1 = new Customer("vandana", 120);
        Customer customer2 = new Customer("tiwari", 100);
        Customer customer3 = new Customer("ruby", 300);

        Customer custom=new Customer();
        custom.setName("bbggh");
        System.out.println(custom);

        List<Customer> customersList = Arrays.asList(customer1, customer2, customer3);
        List<Customer> list = customersList.stream().filter(customer -> customer.getPoints() > 150).collect(Collectors.toList());

        if (!list.isEmpty()) {
            System.out.println(list);
        }
    }
}
