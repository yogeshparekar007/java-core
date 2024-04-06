package com.learning.core.day3session1.PS7;

import java.util.ArrayList;
import java.util.Scanner;

public class D03P71 {

	public static void main(String[] args) {
        ArrayList<String> studentNames = new ArrayList<>();

        studentNames.add("Jack");
        studentNames.add("Paul");
        studentNames.add("Henry");
        studentNames.add("Mary");
        studentNames.add("Ronaldo");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a name to search: ");
        String nameToSearch = scanner.nextLine();

        if (studentNames.contains(nameToSearch)) {
            System.out.println(nameToSearch + " Found.");
        } else {
            System.out.println(nameToSearch + " does not Found.");
        }

        scanner.close();
    }
}