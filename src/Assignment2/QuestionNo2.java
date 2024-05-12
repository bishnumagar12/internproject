package Assignment2;
import java.util.Scanner;
public class QuestionNo2 {
	public void nameOfCities() {
		// create an array to store for multiple cities
		String Cities [] = new String[6];
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=6;i++) {
			//take input from user
			System.out.println("Enter the name of cities:");
			Cities[i] = sc.nextLine();
			// print the cities name
			System.out.println("the name of cities is: "+Cities[i]+'\n');
			}
		sc.close();	
		}
	public static void main(String[] args) {
		// create object for non-static method
		QuestionNo2 b = new QuestionNo2();
		// calling non-static method
		b.nameOfCities();
	}
	
}
