package Assignment6;

class Employee{
	private int empid;
	private String name;
	private String ssn;
	private double salary;

	Employee(int empid, String name, String ssn, double salary){
		this.empid=empid;
		this.name=name;
		this.ssn=ssn;
		this.salary=salary;
	}
	public void setName(String name) {
		
	}
	public void raiseSalary(double increase) {
		
	}
	
	void printEmployee(){
		System.out.println("empid:"+empid+"name:"+name+"ssn:"+ssn+"salary:"+salary);
	}
	
}
class Manager extends Employee{
	private String deptName;
	public String getDeptName() {
		
	}
	
}
class Engineer extends Employee{
	
}
class Admin extends Employee{
	
}
class Director extends Manager{
	private double budget;
	public double getBudget() {
		
	}
	
}
public class Encapsulation {

	public static void main(String[] args) {
		
		Employee e = new Employee();
	
	}
}
