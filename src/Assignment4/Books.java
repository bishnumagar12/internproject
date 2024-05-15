package Assignment4;

public class Books {
	//properties
	String Title;
	String Author;
	float Price;
	String Publisher;
	double ISBN;
	void display() {
		System.out.println(Title+"\t"+Author+"\t\t"+Price+"\t"+Publisher+"\t\t"+ISBN);
	}
	public static void main(String[] args){
		Books a = new Books();
		a.Title="====";
		a.Author="====";
		a.Price= 0000;
		a.Publisher="=====";
		a.ISBN=00000;
		
		Books b = new Books();
		b.Title="OOP";
		b.Author="Grahm";
		b.Price=32.50f;
		b.Publisher="OReilly";
		b.ISBN=498844235;
		
		Books c = new Books();
		c.Title="QoS";
		c.Author="Geoff";
		c.Price=12.99f;
		c.Publisher="Wiley";
		c.ISBN=87654235;
		
		Books d = new Books();
		d.Title="java";
		d.Author="anthony";
		d.Price=8.00f;
		d.Publisher="pearson";
		d.ISBN=644744235;
		System.out.println("Title\tAuthor\t\tPrice\tPublisher\tISBN");
		a.display();
		b.display();
		c.display();
		d.display();
		
	}

}
