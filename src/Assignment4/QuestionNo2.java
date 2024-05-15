package Assignment4;

import java.util.Scanner;

public class QuestionNo2 {
	void display(float n,float c,float M,float m,float a) {
		System.out.println("Total number of books:"+n);
		System.out.println("Total cost of books:"+c);
		System.out.println("Maximum cost of books:"+M);
		System.out.println("Minimum cost of books:"+m);
		System.out.println("Average cost of books:"+a);
	}
	
	public static void main(String[] args) {
		QuestionNo2 q = new QuestionNo2();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Total number of books:");
		float n = sc.nextFloat();
		System.out.println("Total cost of books:");
		float c = sc.nextFloat();
		System.out.println("Maximum cost of books:");
		float M = sc.nextFloat();
		System.out.println("Minimum cost of books:");
		float m = sc.nextFloat();
		System.out.println("Average cost of books:");
		float a = sc.nextFloat();

		q.display(n,c,m,M,a);
		sc.close();
	}

}
