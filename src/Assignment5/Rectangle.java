package Assignment5;

public class Rectangle {
		//properties
			float length;
			float breadth;
			//constructor
			 Rectangle(float l,float b){
				 length=l;
				 breadth=b;
			 }
			void printArea(float l, float b) {
				float area = l*b;
				System.out.println("area of rectangle:"+area);
			}
			void printPerimeter(float l,float b) {
				float perimeter = 2*(l+b);
				System.out.print("perimeter of Rectanlge:"+perimeter);
			}
	}

	class Square extends Rectangle{
		void printAreaSquare(float l) {
			float areasquare = l * l;
			System.out.println("area of square:"+areasquare);
		}
		
		void printPerimeterSq(float l) {
			float perimetersquare = 4*l;
			System.out.println("perimeter of square:"+perimetersquare);
		}
	public static void main(String[] args) {
		Rectangle r = new Rectangle(400,500);
		r.printArea();
		r.printPerimeter();
		Square s = new Square();
		s.printAreaSquare();
		s.printPerimeterSq();
}
	}
