package Assignment3;
import java.util.Scanner;
public class Area {
	// properties
	static int length;
	static int breadth;
	static int Area;
  void setDim(int length, int breadth) {
	     Area = length*breadth;
	  
	}
	
	static int  getArea(int a) {
		return a;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of rectangle:");
		int length = sc.nextInt();
		System.out.println("Enter the breadth of rectangle:");
		int breadth = sc.nextInt();
		
		
		
		Area a = new Area();
		a.setDim(length, breadth);

		int areaofrectangle=getArea(Area);
		
		System.out.println("The area of rectangle is:"+areaofrectangle);
		sc.close();
		
		
		
	}

}
