package travel_transport;

import java.util.*;

public class Finance {
	Scanner in = new Scanner(System.in);
	
	double income, expense, daily_profit, monthly_profit;
	int day;
	String month;
	
	public Finance() {
		System.out.println("Enter month: ");
		this.month = in.nextLine();
		this.income = dailyincome();
		this.expense = dailyexpense();
		this.daily_profit = income - expense;
		
		if(month.equalsIgnoreCase("January")||month.equalsIgnoreCase("March")||month.equalsIgnoreCase("May")||month.equalsIgnoreCase("July")||month.equalsIgnoreCase("August")||month.equalsIgnoreCase("October")||month.equalsIgnoreCase("December")) {
			this.day = 31;
			this.monthly_profit = day*daily_profit;
		}
		else {
			this.day = 30;
			this.monthly_profit = day*daily_profit;
		}
	}
	
	public Finance(String m){
		this.month = m;
		this.income = dailyincome();
		this.expense = dailyexpense();
		this.daily_profit = income - expense;
		
		if(month.equalsIgnoreCase("January")||month.equalsIgnoreCase("March")||month.equalsIgnoreCase("May")||month.equalsIgnoreCase("July")||month.equalsIgnoreCase("August")||month.equalsIgnoreCase("October")||month.equalsIgnoreCase("December")) {
			this.day = 31;
			this.monthly_profit = day*daily_profit;
		}
		else {
			this.day = 30;
			this.monthly_profit = day*daily_profit;
		}
	}
	
	public Finance(double i, double e) {
		System.out.println("Enter month: ");
		this.month = in.nextLine();
		this.income = i;
		this.expense = e;
        this.daily_profit = income - expense;
		
		if(month.equalsIgnoreCase("January")||month.equalsIgnoreCase("March")||month.equalsIgnoreCase("May")||month.equalsIgnoreCase("July")||month.equalsIgnoreCase("August")||month.equalsIgnoreCase("October")||month.equalsIgnoreCase("December")) {
			this.day = 31;
			this.monthly_profit = day*daily_profit;
		}
		else {
			this.day = 30;
			this.monthly_profit = day*daily_profit;
		}
	}
	
	public double dailyincome() {
		double value;
		double sum = 0;
		char choice;
		
		do {
			System.out.print("Enter amount income:");
			value = in.nextInt();
			
			sum = sum + value;
			System.out.print("Enter y for enter more input or n for no:");
			choice = in.next().charAt(0);
			}
		while(choice == 'y');

		return sum;

	}
	
	public double dailyexpense() {
		double value;
		double sum = 0;
		char choice;
		
		do {
			System.out.print("Enter amount of expense:");
			value = in.nextInt();
			
			sum = sum + value;
			System.out.print("Enter y for enter more input or n for no:");
			choice = in.next().charAt(0);
			}
		while(choice == 'y');

		return sum;
	}
	
	public String toString() {
		return "Month: " + month +
				"\nDaily Income: RM" + income +
				"\nDaily Expense: RM" + expense +
				"\nDaily Profit: RM" + daily_profit +
				"\nTotal Profit in " + month + ": RM" + monthly_profit;
				
	}
	}


