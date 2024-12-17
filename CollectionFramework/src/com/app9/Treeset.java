package com.app9;


import java.util.TreeSet;

import com.test.Customer;

public class Treeset {

    public static void main(String[] args) {
        Customer c1 = new Customer(105, "Alice", "alice@gmail.com", 1500.00);
        Customer c2 = new Customer(104, "Bob", "bob@gmail.com", 1200.00);
        Customer c3 = new Customer(103, "Charlie", "charlie@gmail.com", 1300.00);
        Customer c4 = new Customer(102, "David", "david@gmail.com", 1400.00);
        Customer c5 = new Customer(101, "Eve", "eve@gmail.com", 1100.00);
        Customer c11 = new Customer(101, "Eve", "eve@gmail.com", 1100.00);
        Customer c22 = new Customer(102, "David", "david@gmail.com", 1400.00);
        Customer c33 = new Customer(103, "Charlie", "charlie@gmail.com", 1300.00);
        Customer c44 = new Customer(104, "Bob", "bob@gmail.com", 1200.00);
        Customer c55 = new Customer(105, "Alice", "alice@gmail.com", 1500.00);

        TreeSet<Customer> set = new TreeSet<Customer>();
        set.add(c1);
        set.add(c2);
        set.add(c3);
        set.add(c4);
        set.add(c5);
        set.add(c11);
        set.add(c22);
        set.add(c33);
        set.add(c44);
        set.add(c55);

        for (Customer customer : set) {
            System.out.println(customer + " " + customer.hashCode());
        }
    }
}

