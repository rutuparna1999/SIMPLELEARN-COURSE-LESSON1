package com.simplelearn.projecttest;
import java.util.Scanner;
class Calculator{
	void operations() {
		  Scanner sc = new Scanner(System.in);
		System.out.println("enter the num-1");
		int num1 = sc.nextInt();
		System.out.println("enter the num-2");
		int num2 = sc.nextInt();
		
		System.out.println("Please select the opearation to be performed\n "
				+ "1. Addition\n"
				+ "2. subtraction\n"
				+ "3. multiplication\n"
				+ "4. division\n"
				+ "5. exit");
		int n = sc.nextInt();
		
		if(n==1) {
			int addition = num1+num2;
			System.out.println("The addition result is: "+addition);

		}
		else if(n==2) {
			int subtraction = num1-num2;
			System.out.println("The subtraction result is: "+subtraction);
		}
		else {
			System.exit(0);
		}
	}
	
}
public class Code1 {
	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		for(; ;) //infinite loop
		{
			c.operations();
		}
		
	}
}
