package Assignment2;


import java.util.Scanner;

public class QuestionNo1 {
	// create method
	public static void CalculatePrice() {
		 int books[]=new int[10];
		 int totalprice = 0;
		 int averageprice = 0;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<10;i++) {
			System.out.println("Enter the price of book"+i+":");
			books[i]=sc.nextInt();
			}
			for(int i=0;i<10;i++) {
			// calculation total  
			  totalprice=totalprice+books[i];
			  averageprice=totalprice/10;
				sc.close();
			}
			// print the total price and average price
			System.out.println("the total price of 10 books:" +totalprice);
			System.out.println("the average price of 10 bookes:" +averageprice);
		}
			
	public static void main(String[] args) {
	CalculatePrice();
    
	}
}
