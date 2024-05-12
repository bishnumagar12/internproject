package Assignment2;

public class QuestionNo5 {
	
	  void  Calculation() {
		int total=0;
		int marks[]= {99,80,87,88,69};
		for(int i=0;i<marks.length;i++) {
			total=total+marks[i];
		}
		float percentage = (total*100)/500;
		System.out.println("Total marks is:"+total);
		System.out.println("Percentage is:"+percentage);
	}
	
	public static void main(String[] args) {
		QuestionNo5 b = new QuestionNo5();
		b.Calculation();
	}

}
