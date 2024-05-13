package Assignment3;

public class Student {
	
	// properties
		static String name;
		static int roll_no;
	
	// constructor
		public  Student(String name, int roll_no) {
			this.name=name;
			this.roll_no=roll_no;

		}
	
	public static void main(String[] args) {
		
		System.out.println("name is:"+name+"\nroll number is:"+roll_no);
		
		// create object
		Student s = new Student("jhon", 6);
		
	}

}
