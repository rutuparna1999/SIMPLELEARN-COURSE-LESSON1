package trainingjava;

import java.util.Scanner;
class Calculator{
	void operations() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number 1:");
		int num1 = sc.nextInt();
		System.out.println("Enter Number 2:");
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
			System.out.println("The Addition result is: "+addition);
		}
		else if(n==2) {
			int subtraction = num1-num2;
			System.out.println("The Subtraction result is: "+subtraction);
		}
		else if(n==3) {
			int multiplication = num1*num2;
			System.out.println("The Multiplication result is: "+multiplication);
		}
		else if(n==4) {
			int division = num1/num2;
			System.out.println("The Division result is: "+division);
		}
		else {
			System.exit(0);
		}
	}
}
public class code1 {
	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		for(; ;) //infinite loop
		{
			c.operations();
		}
		
	}
}
