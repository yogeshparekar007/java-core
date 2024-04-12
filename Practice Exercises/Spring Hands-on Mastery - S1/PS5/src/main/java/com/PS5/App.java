package com.PS5;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.PS5.Product;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // Load the Spring configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        // Retrieve the Cashier bean
        Cashier cashier = (Cashier) context.getBean("cashier");

        // Create a sample shopping cart
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Product(1, "Leptop", 25000.00));
        cart.addItem(new Product(2, "Mobile", 15000.00));

        try {
            // Perform checkout
            cashier.checkout(cart);
            System.out.println("Checkout successful.");
        } catch (IOException e) {
            System.err.println("Error during checkout: " + e.getMessage());
        }
    }
}
