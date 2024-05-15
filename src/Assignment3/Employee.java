package Assignment3;
import java.util.Scanner;
public class Employee {
	// properties
	String name;
	int year_of_joining;
	int salary;
	String address;
	// methods
	 void display(String n, int d, int s,String a) {
		 
		 for(int i=0;i<5;i++) {
		
		 }
		 System.out.println(n+"\t"+d+"\t\t"+s+"\t"+a);
			
		 }
	
	
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a name:");
	String n = sc.next();
	System.out.println("Enter year_of_join:");
	int d = sc.nextInt();
	System.out.println("Enter a salary:");
	int s = sc.nextInt();
	System.out.println("Enter a address:");
	String a = sc.next();
	
	Employee e = new Employee();
	System.out.println("Name\tYear_of_join\tSalary\tAddress");
	e.display(n,d,s,a);
	sc.close();
	
	}
}
