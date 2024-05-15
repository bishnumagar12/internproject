package Assignment3;
import java.util.Scanner;
public class AddDistance {
	// properties
	float i;
	float f;
	
	void setDistance(float inch, float feet) {
		 i = inch;
		 f = feet;
	}
	
	float getDistance() {
		float distance = f+i;
		return distance;
	}
	public static void main() {
		AddDistance a = new AddDistance();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a feets:");
		float f = sc.nextFloat();
		System.out.println("Enter a inchs:");
		float i = sc.nextFloat();
		
		System.out.println("Adding two distances:"+distance);
		a.setDistance(f,i);
		a.getDistance();
	}
}
