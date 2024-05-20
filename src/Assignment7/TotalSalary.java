package Assignment7;

public class TotalSalary extends Employees{
	void display() {
		double totalsalary=0;
		 for(TotalSalary total:emp) {
				totalsalary=totalsalary+total.salary;
				System.out.println("TotalSalary:"+totalsalary);
			}
	}
	}
		
	
	
