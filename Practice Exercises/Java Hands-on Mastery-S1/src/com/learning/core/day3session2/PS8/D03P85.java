package com.learning.core.day3session2.PS8;

import java.util.Map;
import java.util.TreeMap;

public class D03P85 {

	public static void main(String[] args) {
		Map<Integer, Car> cars = new TreeMap<Integer, Car>();
		cars.put(1, new Car(80050.0, "Bugatti"));
		cars.put(2, new Car(3050000.0, "Swift"));
		cars.put(3, new Car(600100.0, "Audi"));
		cars.put(4, new Car(900000.0, "Benz"));

		cars.entrySet().stream().forEach(entry -> System.out.println(entry.getValue()));
	}

}
