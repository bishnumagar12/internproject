package Assignment3;
import java.util.Scanner;
public class Student2 {
	// properties
	static int roll_no;
	static double phone_no;
	static String address;
	
	// constructor
	public Student2(int roll_no, double phone_no,String address) {
		this.roll_no=roll_no;
		this.phone_no=phone_no;
		this.address=address;
	}

	
	public static void main(String[] args) {
	
		//take input from user
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter your roll_no:");
		int roll_no = sc.nextInt();
		System.out.println("Enter your phone number:");
		double phone_no = sc.nextDouble();
		System.out.println("Enter your address:");
		String address = sc.next();
		*/
		
		// creating two objects
		Student2 sam = new Student2(12,986733715,"dang");
		System.out.println("rollno:"+roll_no+"\nphoneno:"+phone_no+"\naddress:"+address);
		Student2 Jhon = new Student2(10,986694326,"dang");
		System.out.println("rollno:"+roll_no+"\nphoneno:"+phone_no+"\naddress:"+address);
		//sc.close();
	}
}
