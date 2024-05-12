package Assignment1;

import java.util.Scanner;
public class TotalSalary {
	// calculate total salary based on basic salary and bonus percentage
	public static double CalculateTotalSalary(double basicSalary, double bonusPercentage) {
	// calculate bonus amount
		double bonus = (basicSalary+bonusPercentage)/100;
		// calculate total salary
		return basicSalary+bonus;
	}
public static void main(String[] args) {
	// 
	Scanner sc = new Scanner(System.in);
	
	// array containing different job positions
	String [] posts = {"MD", "CEO", "MANAGER", "HELPER"};
	//using loop for taking input of basic salary and percentage from different posts
	for(int i=0; i<posts.length; i++) {
		// for basic salary
		System.out.println("Enter basic salary for" +posts[i]+ ":");
		double basicSalary = sc.nextDouble();
		
		//for bonus percentage
		System.out.println("Enter bonus percentage for " + posts[i]+":");
		double bonusPercentage = sc.nextDouble();
		
		// calculate and print the total salary 
		double totalsalary = CalculateTotalSalary(basicSalary, bonusPercentage );
		System.out.println("Total salary for" + posts[i]+ ":" + totalsalary);
		
	}
	sc.close();
  }
}
