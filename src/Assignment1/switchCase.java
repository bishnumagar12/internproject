package Assignment1;

import java.util.Scanner;
public class switchCase {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter operator (+, -, *, /):");
	char op = sc.next().charAt(0);
	
	System.out.print("Enter first number:");
	int num1 =sc.nextInt();
	System.out.println("Enter second number:");
	int num2 = sc.nextInt();
	
	int result;
	// perform the operation 
	switch (op) {
	case '+':
		result=num1+num2;
		System.out.println("sum of two number is:"+result);
		break;
	case '-':
	result=num1-num2;
	System.out.println("subtraction of two number is:"+result);
	break;
	case '*':
	result=num1*num2;
	System.out.println("multiplication of two number is:"+result);
	break;
	case '/':
	if(num2!=0) {
	result=num1/num2;
	System.out.println("sum of two number is:"+result);
	}else {
		System.out.println("Error! division by zero is not allowed.");
	}
	break;
	}
	sc.close();
  }
}
