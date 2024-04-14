package com.OnlineShoppingApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Online Shopping BAZAR!");

		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		ShoppingCart cart = (ShoppingCart) context.getBean("shoppingCart");

		cart.addItem(context.getBean("battery", Product.class));
		cart.addItem(context.getBean("disc", Product.class));

		System.out.println("Items in ShoppingCart:");
		for (Product item : cart.getItems()) {
			System.out.println(item);
		}

		((ClassPathXmlApplicationContext) context).close();
	}
}
