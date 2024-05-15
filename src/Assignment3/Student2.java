package Assignment3;
import java.util.Scanner;
public class Student2 {
	// properties
	int name;
	int roll_no;
	double phone_no;
	String address;
	
	void display(int r, double p,String a) {
		System.out.println(r+"\t\t"+p+"\t\t"+a);
	}
	
	public static void main(String[] args) {
	
		//take input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your roll_no:");
		int r = sc.nextInt();
		System.out.println("Enter your phone number:");
		double p = sc.nextDouble();
		System.out.println("Enter your address:");
		String a = sc.next();
		
		System.out.println("Roll_no\t\tPhone_no\tAddress");
		
		Student2 e = new Student2();
		e.display(r,p,a);
		sc.close();
		
	}
}
