package com.PS4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
    	//Product product = new Product();
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        ShoppingCart customer1Cart = (ShoppingCart) context.getBean("shoppingCart");
        ShoppingCart customer2Cart = (ShoppingCart) context.getBean("shoppingCart");
        ShoppingCart customer3Cart = (ShoppingCart) context.getBean("shoppingCart");


        customer1Cart.addItem(new Product(1, "Leptop", 25000.00));
        customer2Cart.addItem(new Product(2, "Mobile", 15000.00));
        customer3Cart.addItem(new Product(3, "MacBook", 30000.00));

        System.out.println("Customer 1 Cart Contents: " + customer1Cart.getItems());
        System.out.println("Customer 2 Cart Contents: " + customer2Cart.getItems());
        System.out.println("Customer 3 Cart Contents: " + customer3Cart.getItems());

    }
}
