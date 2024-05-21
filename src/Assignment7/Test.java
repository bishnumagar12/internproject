package Assignment7;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employees emp [] = new Employees[10];
		for(int i=0;i<emp.length;i++) {
			Employees e = new Employees();
		System.out.println("Enter a Employee id:");
		e.setId(sc.nextInt());
		System.out.println("Enter a Employee name:");
		e.setName(sc.next());
		System.out.println("Enter a Company name:");
		e.setCompany(sc.next());
		System.out.println("Enter a Employee salary:");
		e.setSalary(sc.nextDouble());
		System.out.println("Enter a department:");
		e.setDepartment(sc.next());
		System.out.println("Enter a Employee post:");
		e.setPost(sc.next());
		System.out.println("Enter a Employee city:");
		e.setCity(sc.next());
		
		emp[i]=e;
		}
		for(Employees details:emp) {
			System.out.println("Employees"+details);
			}
		
		//a. total salary
		double total=0;
		for(Employees data:emp) {
			total=total+data.getSalary();
		}
		System.out.println(total);
		
		//employees of IT department
		for(Employees data: emp) {
			if("IT".equals(data.getDepartment())) {
				System.out.println(emp.toString());
			}
		}
		
		//counting admin department
		int count=0;
		for(Employees data:emp) {
			if("admin".equals(data.getDepartment())) {
				count++;
			}
		}
		System.out.println(count);
		
		// counting and printing a particular city employee
		int count1=0;
		for(Employees data:emp) {
			if("pyuthan".equals(data.getCity())) {
				count1++;
			}
		}
		System.out.println("pyuthan city:"+count1);
		
		//total salary of particular department
		double totalsalary=0;
		for(Employees data:emp) {
			if("IT".equals(data.getDepartment())){
				totalsalary=totalsalary+data.getSalary();
			}
		}
		System.out.println("Total salary of IT department:" +totalsalary);
		
		//Lowest salary of the employees
		double min = emp[0].getSalary();
		for(Employees data: emp) {
			if(min>=data.getSalary()) {
				min=data.getSalary();
			}
		}
		System.out.println("minimun salary is:"+min);
		
		//highest salary
		double max = emp[0].getSalary();
		for(Employees data:emp) {
			if(max<=data.getSalary()) {
				max=data.getSalary();
			}
		}
		System.out.println("maximum salary is:"+max);
		sc.close();
	}
}