package travel_transport;

import java.util.*;

public class Customer { //1.3 User defined class
	//1.2 Predefined class
	Scanner in = new Scanner(System.in);
	
	String name, departure, destination, phone;
	int age;
	double price, discount, finalprice;
	
	public Customer() { //1.4 Constructor with zero argument
		System.out.println("Enter name of customer:");
		this.name = in.nextLine();
		System.out.println("Enter age:");
		this.age = in.nextInt();
		in.nextLine();
		System.out.println("Enter phone number:");
		this.phone = in.next();
		System.out.println("Enter travel package bought:");
		int a = in.nextInt();
		in.nextLine();
		travelpackage(a);
		calFinalprice(age);
	}
	
	public Customer(int a) { //1.4 Constructor with one argument
		System.out.println("Enter name of customer:");
		this.name = in.nextLine();
		this.age = a;
		System.out.println("Enter phone number:");
		this.phone = in.next();
		System.out.println("Enter travel package bought:");
		int b = in.nextInt();
		in.nextLine();
		travelpackage(b);
		calFinalprice(a);
	}
	
	public Customer(int a, int b) { //1.4 Constructor with 2 arguments
		System.out.println("Enter name of customer:");
		this.name = in.nextLine();
		this.age = a;
		System.out.println("Enter phone number:");
		this.phone = in.next();
		travelpackage(b);
		calFinalprice(a);
	}
	
    public void travelpackage(int a) {
    	if(a == 1) {
    		this.departure = "Kuala Perlis";
    		this.destination = "Kuala Lumpur";
    		this.price = 620.2;
    	}
    	if(a == 2) {
    		this.departure = "Kuala Lumpur";
    		this.destination = "Singapore";
    		this.price = 457.85;
    	}
    	if(a == 3) {
    		this.departure = "Penang";
    		this.destination = "Penang";
    		this.price = 299.55;
    	}
    }
    
    public double calFinalprice(int b) {
    	if(b <= 18) {
			this.discount = 0.15;
			this.finalprice = price*(1-discount);
		}
		else {
			this.finalprice = price;
		}
    	return finalprice;
    }
    
     public String toString() {
    	return "Name of Customer: " + name +
    			"\nAge: " + age +
    			"\nPhone Number: " + phone +
    			"\nDeparture: " + departure +
    			"\nDestination: " + destination +
    			"\nOriginal price: RM" + price +
    			"\nPrice need to paid: RM" + finalprice;
    }
}
