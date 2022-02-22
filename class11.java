package com.Syntax.class1;

import java.util.Scanner;

public class class11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a program that will ask user to input the current time (use 24 hour format).
			Based on the given time define:
			if hour is between 1-11 --> Morning
			if hour between 12-15 --> Afternoon
			if hour between 16-20 --> Evening
			if hour between 21-24 --> Night
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the time");
		int time=scan.nextInt();
		if(time>=1 && time<=11) {
			System.out.println(" it is Morning time");
		}else if (time>=12 && time<=15) {
				System.out.println("it is afternoon time");
		}else if (time>=16 && time <=20) {
			System.out.println("it is evening time");
		}else if(time>=21 && time<=24) {
			System.out.println("it is night time");
		
				
				
				
				
			}else {
				System.out.println("this is invlaid time");
		}
		
		
		
		
	}

}
