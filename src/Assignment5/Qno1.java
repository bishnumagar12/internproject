package Assignment5;


class A{
	
	void show() {
		System.out.println("This is parent class:");
	}
	
}

class B extends A{
	
	void display() {
		System.out.println("This is child class:");
	}
}
public class Qno1 {	
	
	public static void main(String[] args) {
		A ob = new A();
		ob.show();//call method of parent class by object of parent class
		
		B ob1 = new B();
		ob1.display();// call method of child class by object of child class
		
		ob1.show();// call method of parent class by object of child class
		
		
	}
}

