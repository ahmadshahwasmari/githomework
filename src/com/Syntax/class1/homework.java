package com.Syntax.class1;

public class homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int esum=0;
int osum=0;
for (int i=1;i<=100; i++) {
	if (i%2==0) {
		esum+=i;
	}else {
		osum+=i;
	}
}
System.out.println("Sum of even numbers= "+esum);
System.out.println("sum of odd numbers= "+osum);



	}

}
