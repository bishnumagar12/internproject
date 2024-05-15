package Assignment3;
import java.util.Scanner;
public class Area {
	// properties
	int l;
	int b;
  void setDim(int length, int breadth) {
	  l=length;
	  b=breadth;
	}
	
  int getArea() {
		int area = l*b;
		return area;
		
	}
	
	public static void main(String[] args) {
		Area a = new Area();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of rectangle:");
		int l = sc.nextInt();
		
		System.out.println("Enter the breadth of rectangle:");
		int b = sc.nextInt();
		
		a.setDim(l, b);

		int areaofrectangle=a.getArea();
		
		System.out.println("The area of rectangle is:"+areaofrectangle);
		sc.close();
		
		
		
	}

}
