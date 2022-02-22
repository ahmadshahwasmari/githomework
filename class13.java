package com.Syntax.class1;

public class class13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char gender='m';
		String description;
		
		switch(gender) {
		
		case 'm':
			description="Male";
			break;
		case 'M':
			description="Male";
			break;
		case 'f':
			description="Female";
			break;
		case 'F':
			description="Female";
			break;
		default:
			description="Unknown";
		}
		
		System.out.println(gender +" means "+description);
		
	}

}
