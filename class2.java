package com.Syntax.class1;

public class class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a program to store a boolean value of whether user has diploma or not.
		 * If user has a diploma, you should say congratulations, otherwise program
		 * should suggest to get a degree. Then if user has a degree program should
		 * check a gpa score. If gpa score is higher or equals to 3.5 → output should
		 * say “You are eligible for scholarship”, otherwise → “You should have studied
		 * harder” .
		 */
		boolean diploma=true;
		double gpa=3.5;
		if(diploma) {
			System.out.println("congratulations");
			if(gpa>3.5) {
				System.out.println("you are ligable for schlorship");
				
					
				}else {
					System.out.println("you should have study hard");
				}
		}else {
			System.out.println("you have to get degree");
		}
		
		


	}

}
