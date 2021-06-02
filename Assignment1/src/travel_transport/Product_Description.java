package travel_transport;

import java.util.*;

public class Product_Description { //1.3 User Defined Class
	//1.2 Predefined class
	Scanner in = new Scanner(System.in);
	
	String departure, destination, description;
	int pkg;
	double price, discount;
	
	public Product_Description() {	//1.4 Constructor with zero argument
		System.out.println("Enter number set for travel package:");
		this.pkg = in.nextInt();
		in.nextLine();
		System.out.println("Enter location of start departure:");
		this.departure = in.nextLine();
		System.out.println("Enter location of end destination:");
		this.destination = in.nextLine();
		System.out.println("Enter price of travel package:");
		this.price = in.nextDouble();
		System.out.println("Enter discount for special offer:");
		this.discount = in.nextDouble();
		in.nextLine();
		this.description = addDescription();
	}

	public Product_Description(int a) {	//1.4 Constructor with one argument
		this.pkg = a;
		System.out.println("Enter location of start departure:");
		this.departure = in.nextLine();
		System.out.println("Enter location of end destination:");
		this.destination = in.nextLine();
		System.out.println("Enter price of travel package:");
		this.price = in.nextDouble();
		System.out.println("Enter discount for special offer:");
		this.discount = in.nextDouble();
		in.nextLine();
		this.description = addDescription();
	}
	
	public Product_Description(String a, String b) { //1.4 Constructor with 2 arguments
		System.out.println("Enter number set for travel package:");
		this.pkg = in.nextInt();
		in.nextLine();
		this.departure = a;
		this.destination = b;
		System.out.println("Enter price of travel package:");
		this.price = in.nextDouble();
		System.out.println("Enter discount for special offer:");
		this.discount = in.nextDouble();
		in.nextLine();
		this.description = addDescription();
	}
	
	public String addDescription() {
		String line;
		String sum = "";
		char choice;
		
		do {
			System.out.print("Enter new description line:");
			line = in.nextLine();
			
			sum = sum + "\n" + line;
			System.out.println();
			System.out.print("Enter y for enter more input or n for no:");
			choice = in.next().charAt(0);
			in.nextLine();
			}
		while(choice == 'y');

		return sum;
	}
	
	public String toString() {
		return "Package travel no: " + pkg +
				"\nStart departure location: " + departure +
				"\nEnd destination location: " + destination +
				"\nPrice of travel package: RM" + price + 
				"\nDiscount for special offer: " + discount + "%" +
				"\nDescription of travel package: " + description;
	}
}
