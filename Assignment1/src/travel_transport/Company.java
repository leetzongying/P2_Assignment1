package travel_transport;

import java.util.*;

public class Company {
	
	Scanner in = new Scanner(System.in);
	
	String company, name;
	int yearEstablished;
	
	public Company() {
		System.out.println("Enter name of company:");
		this.company = in.nextLine();
		System.out.println("Enter name of CEO:");
		this.name = in.nextLine();
		System.out.println("Enter year established:");
		this.yearEstablished = in.nextInt();
		in.nextLine();
	}
	
	public Company(String c, String n, int y) {
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
