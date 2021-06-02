package travel_transport;

import java.util.*;

public class Company { //1.3 User defined class
	//1.2 Predefined class
	Scanner in = new Scanner(System.in);
	
	String company, name;
	int yearEstablished;
	
	public Company() { //1.4 Constructor with zero argument
		System.out.println("Enter name of company:");
		this.company = in.nextLine();
		System.out.println("Enter name of CEO:");
		this.name = in.nextLine();
		System.out.println("Enter year established:");
		this.yearEstablished = in.nextInt();
		in.nextLine();
	}
	
	public Company(String c, String n, int y) { //1.4 Constructor with 2 argument
		this.company = c;
		this.name = n;
		this.yearEstablished = y;
	}
	
	public String toString(){
		return "Company name: " + company +
				"\nName of CEO: " + name +
				"\nYear established: " + yearEstablished;
	}
	

}
