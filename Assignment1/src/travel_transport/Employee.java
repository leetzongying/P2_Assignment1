package travel_transport;

import java.util.*;

public class Employee {

	Scanner in = new Scanner(System.in);
	
	String name, position, ID;
	int hour;
	double salary;
	
	public Employee() {
		System.out.println("Enter name of employee:");
		this.name = in.nextLine();
		System.out.println("Enter name of position:");
		this.position = in.nextLine();
		System.out.println("Enter employee ID:");
		this.ID = in.nextLine();
		System.out.println("Enter salary per hour:");
		this.salary = in.nextDouble();
		System.out.println("Enter hours of work:");
		this.hour = in.nextInt();
	}
	
	public Employee(String p) {
		this.position = p;

		System.out.println("Enter name of employee:");
		this.name = in.nextLine();
		System.out.println("Enter employee ID:");
		this.ID = in.nextLine();
		System.out.println("Enter hours of work:");
		this.hour = in.nextInt();
		if(p.equalsIgnoreCase("Manager")) {
			this.salary = 20; 
		}
		else if(p.equalsIgnoreCase("Counter Service")) {
			this.salary = 18;
		}
		else if(p.equalsIgnoreCase("Tour Guide")) {
			this.salary = 18.5;
		}
		else {
			this.salary = 16.5;
		}
	}
	
	public Employee(String p, double s) {
		this.position = p;
		this.salary = s;
		
		System.out.println("Enter name of employee:");
		this.name = in.nextLine();
		System.out.println("Enter employee ID:");
		this.ID = in.nextLine();
		System.out.println("Enter hours of work:");
		this.hour = in.nextInt();
		
	}

	public double calDailyWage() {
		return hour*salary;
	}
	
    public String toString() {
    	return "Name of employee: " + name +
    			"\nEmployee ID: " + ID +
    			"\nName of position: " + position +
    			"\nWages paid per day: RM" + calDailyWage();
    }
}
