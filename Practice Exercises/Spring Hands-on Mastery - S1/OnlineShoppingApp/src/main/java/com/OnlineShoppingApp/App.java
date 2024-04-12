package com.OnlineShoppingApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Online Shopping BAZAR!");

		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		Battery battery = (Battery) context.getBean("battery");
		System.out.println(battery);

		Disc disc = (Disc) context.getBean("disc");
		System.out.println(disc);

	}
}
