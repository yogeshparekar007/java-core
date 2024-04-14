package com.OnlineShoppingApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Online Shopping BAZAR!");

		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		ShoppingCart cart1 = (ShoppingCart) context.getBean("shoppingCart");
		cart1.addItem(new Battery(1, "AAA Battery", 5.0, true, 0.1));
		cart1.addItem(new Disc(2, "DVD Disc", 10.0, 700, 0.15));

		ShoppingCart cart2 = (ShoppingCart) context.getBean("shoppingCart");
		cart2.addItem(new Disc(3, "Blu-ray Disc", 15.0, 1000, 0.2));

		System.out.println("Items in ShoppingCart 1:");
		for (Product item : cart1.getItems()) {
			System.out.println(item);
		}

		System.out.println("Items in ShoppingCart 2:");
		for (Product item : cart2.getItems()) {
			System.out.println(item);
		}

		((ClassPathXmlApplicationContext) context).close();
	}
}
