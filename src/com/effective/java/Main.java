package com.effective.java;

import com.effective.java.objects.builder.Customer;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer.Builder("test@gmail.com", "000000000")
            .name("kader").lastName("Çelik").build();
        System.out.println("Customer : "+ customer);
    }
}
