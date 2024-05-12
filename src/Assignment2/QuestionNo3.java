package Assignment2;


import java.util.Scanner;
public class QuestionNo3 {
	
	void OddNumber() {
		// create an array to store for multiple number
		int num[]= new int[100];
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=100;i++) {
		System.out.println("Enter the number:");
		num[i]=sc.nextInt();
		if(num[i]%2==1) {
			System.out.println("The given number is odd:");
		}else{
			System.out.println("null!!");
		}
		}
		sc.close();
	}
	
	public static void main(String[] args) {
		//create object for non-static method
		QuestionNo3 g = new QuestionNo3();
		// calling non-static method
		g.OddNumber();
		
	}

}
