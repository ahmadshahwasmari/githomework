package com.Syntax.class1;

public class tasks {

	public static void main(String[] args) {
		// Task1
		boolean diploma=true;
		double gpa= 4.0;
		if(diploma) {
			System.out.println("Congratulations");
		} else if (gpa>3.5) {
			System.out.println("you are eligable for schlorship");
		}else if (gpa<3.5){
			System.out.println("you have to work hard");
		}else {
			
		System.out.println("Programm suggest to get a degree");
		
			
		}
		System.out.println("###### second Task ###############");
		
		double mortgagerate=4.0;
		double mortgageprice= 3000000;
		if(mortgagerate>4.5) {
			System.out.println("should not buy");
		}else if (mortgagerate>2000000) {
			System.out.println("will pay in case");
			
		}else if(mortgagerate<2000000) {
			System.out.println("will pay in cash");
		}else {
			System.out.println("will not buy");
		}
	}
}

