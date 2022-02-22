package com.Syntax.class1;

import java.util.Scanner;

public class class14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a country");
		String count = scan.next();
		String food;

		switch (count.toLowerCase()) {

		case "afghanistan":
			food = "qabali palaw";
			break;
		case "usa":
			food = "burger";
			break;
		case "italy":
			food = "Pizza";
			break;
		case "mexico":
			food = "Tacos";
			break;
		default:
			food = "Unknown";
		}
		

		if (!food.equals("Unknown")) {
			System.out.println("If your country is " + count + (" your favorite food is ") + food);
		
		}else {
			System.out.println("Please try another country");
		}
	}

}
