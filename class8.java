package com.Syntax.class1;

import java.util.Scanner;

public class class8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="abc";
str="xyz";
Scanner scan=new Scanner(System.in);
System.out.println("enter your name");
String name=scan.next();
System.out.println("Your name is " +name);

System.out.println("enter your age");
int age=scan.nextInt();
System.out.println(name+ " you are " +age+ " years old" );
System.out.println("Please enter the produt name");
String productname=scan.next();
System.out.println("Please enter the product price");
double productprice=scan.nextDouble();
System.out.println("price of " +productname+ " is " +productprice);






	}

}
