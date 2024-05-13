package Assignment3;
import java.util.Scanner;
public class Employee {
	String name[]= new String[3];
	int year_of_joining[]=new int[3];
	String address[]=new String[3];
	
	// methods
	 void display() {
		 Scanner sc = new Scanner(System.in);
		 for(int i=0;i<3;i++) {
			 System.out.println("Enter your name:");
			 name[i]=sc.next();
			 
			 System.out.println("joining_date:");
			 year_of_joining[i]=sc.nextInt();
			 
			 System.out.println("address:");
			 address[i]=sc.next();
			 
		 }
		 sc.close();
		 
			}
	 public void DisplayTable() {
		 System.out.println("name            year_of_joining             address");
		 for(int i=0;i<3;i++) {
			 System.out.println(name[i]+ "        " +year_of_joining[i]+"        "+address[i]+"        ");
		 }
	 }
	
	
	
public static void main(String[] args) {
	
	Employee e = new Employee();
	e.display();
	e.DisplayTable();
	
	
	}
}
