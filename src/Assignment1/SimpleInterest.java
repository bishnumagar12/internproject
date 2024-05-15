package Assignment1;

import java.util.Scanner;

public class SimpleInterest {
	static int p=0,t=0, r=0;
	 

	//create method and take input from the user
	 static void input() {
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a principal:");
		p = sc.nextInt();
		
		System.out.println("Enter a time:");
		t = sc.nextInt();
		
		System.out.println("Enter a Rate:");
		r= sc.nextInt();
		processing(p,t,r);
		sc.close();
		
		}
	//processing and calculate simple interest and amount
	 static void processing(int p, int t, int r) {
		 // calculate simple interest
		 
		int si = (p*t*r)/100;
		
		//calculate amount
		
		int a = p+si;
		
		// call output method to display results
		output(si, a);
	}
	 
	 // method to display the results
	 static void output(int si, int a) {
		 System.out.println("The value of simple interest:"+si);
		 System.out.println("The value of amount is:"+a);
	 }
	 public static void main (String[] args) {
		 // call input method to 
		 input();
		 //
		 
	 }
}
