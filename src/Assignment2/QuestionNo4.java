package Assignment2;

import java.util.Scanner;

public class QuestionNo4 {
	// create method
	void EvenNumber() {
		// create an array for multiple 
		int num[]=new int[100];
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=100;i++) {
		System.out.println("Enter the number:");
		num[i]=sc.nextInt();

		if(num[i]%2==0) {
			System.out.println("The given number is Even:");
		}else{
			System.out.println("null!!");
		
			}
		}
		sc.close();
	}
	
	public static void main(String[] args) {
		//create object for non-static method
			QuestionNo4 e = new QuestionNo4();
		// calling non-static method
			e.EvenNumber();
	}

}
