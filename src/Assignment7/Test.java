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
		
		}
		for(Employees details:emp) {
			System.out.println("Employees"+emp);
		}
		TotalSalary s = new TotalSalary();
		s.display();
		ITDepartment d = new ITDepartment();
		d.show();

		sc.close();
	}
}