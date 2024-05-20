package Assignment5;
class Employee extends Member{
	void display() {
		System.out.println("name:"+name+"\tage:"+age+"\tphone_number:"+ph_number+"\taddress:"+address+"\tsalary:"+salary);
	}
}
class Manager extends Member{
	void show() {
		System.out.println("name:"+name+"\tage:"+age+"\tphone_number:"+ph_number+"\taddress:"+address+"\tsalary:"+salary);
	}
}
public class Member {
	String name;
	int age;
	double ph_number;
	String address;
	int salary;
	
	void printSalary() {
		System.out.println("salary of employee:"+salary);
		System.out.println("salary of manager:"+salary);
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.name="bijay";
		e.age=23;
		e.ph_number=884838939;
		e.address="dang";
		e.salary=230000;
		e.display();
		
		Manager m = new Manager();
		m.show();
		
		Member me = new Member();
		me.printSalary();
	}

}
