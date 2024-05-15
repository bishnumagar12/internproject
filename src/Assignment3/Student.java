package Assignment3;

import java.util.Scanner;
public class Student {
	
	// properties
	String name;
	int roll_no;
	
	// method
		void display(String n,int r) {
	
			System.out.println(n+"\t\t"+r);
		}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name:");
		String n = sc.next();
		System.out.println("Enter your rollno:");
		int r = sc.nextInt();
		
		// create object
		Student s = new Student();
		
		System.out.println("Name\t\tRollno");
		s.display(n,r);
		sc.close();
		
		
		
	}

}
