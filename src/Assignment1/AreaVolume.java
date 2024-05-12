package Assignment1;

public class AreaVolume {
	// create getArea method
		static int getArea (int length, int breadth) {
			int area = length * breadth;
			return area;
		}
		static void volume(int area, int height) {
			int vol = area * height;
			System.out.println("The value of area is:"+area);
			System.out.println("The value of volume is :"+ vol);
		}
		
		public static void main(String[] args) {
			// define variable
			int length = 80;
			int breadth = 10;
			int height = 20;
			
			// call getArea method
	        int area = getArea(length, breadth);
	        
	        //calling method volume
	        volume(area, height);
	        
		
			
		}
}
