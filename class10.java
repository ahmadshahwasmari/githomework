package com.Syntax.class1;

import java.util.Scanner;

public class class10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a Java program that will ask if user has a credit card or not. If you//
		 //user does not have a credit card then offer them. If they do have one ask//
		// what is balance on the card? If balance of the card is larger than 1000, tell//
		 //them to pay off immediately, otherwise you can tell them that they can spend//
	//more.//
		  
	Scanner scan=new Scanner(System.in);
	System.out.println("Do you have a credit card");
	String creditcard=scan.next();
	if (creditcard.equalsIgnoreCase("yes")) {
		System.out.println("enter your balance");
		double balance=scan.nextDouble();
		if (balance> 1000) {
			System.out.println("pay off immediatley");
		}else {
			System.out.println("you can spend more");
		}
		
			
		
			
		
		
	
   }else {
	System.out.println("we can offer you a credit card");
}	
	}

}
