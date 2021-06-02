package travel_transport;

public class Advertising_Marketting {

	String socialmedia, printmedia, description;
	double discount;
	
	public Advertising_Marketting() { //1.4 Constructor with no argument
		this.description = typeOfAdvertisement();
	}
	
	public Advertising_Marketting(String sm) { //1.4 Constructor with one argument
		socialmedia=sm;
		
		this.description = onlineAdvertisement();
	}
	
	public Advertising_Marketting(String pm, double d) { //1.4 Constructor with two arguments
		printmedia=pm;
		discount=d;
		
		this.description = offlineAdvertisement();
	}
	
	public String typeOfAdvertisement() {
		return "We have two types of advertisement."
				+ "\n1. Online advertisement on Social Media"
				+ "\n2. Offline advertisement on Printed Media";
	}
	
	public String onlineAdvertisement() {
	    return "====================ONLINE ADVERTISEMENT====================" +
		       "\nPosted on " + socialmedia +
		       "\n********************GIVEAWAY EVENT******************" +
		       "\nOur company is helding a GIVEAWAY event!!!"
				+ "\nYou have a chance to get up to 30% discount voucher for booking travel package by just follow these 3 steps!!!"
				+ "\n1st Step\t: Like our page."
				+ "\n2nd Step\t: Like this post and share out this post in public."
				+ "\n3nd Step\t: Tag 3 friends in comment and state why you wanted to get this giveaway."
				+ "\nLucky winner will win the prize!!!"
				+ "\nThe lucky winner will be announced on 24 June 2021.";
	}
	
	public String offlineAdvertisement() {
		return "====================OFFLINE ADVERTISEMENT====================" +
		       "\nPosted on " + printmedia +
		       "\nAidilfitri festival season is Coming Soon!!!!"
				+ "\nJust come to our webiste and booking for your travel package in anywhere."
				+ "\nWe provide free cancellation in 30 days before departure and free lunch during travel."
				+ "\n***********PROMOTION***********"
				+ "\nYou will get a " + discount + "% discount on your next avaiable travel if you have spend over RM3000 cumulatively!!!"
				+ "\nThis promotion only valid until 1 August 2021."
				+ "\nHURRY UP!!! Pls dont miss this amazing promotion!!!"
				+ "\nVisit our website now!!"
				+ "\nWebsite\t: www.tyt.com.my\n";
	}
	
	public String toString() {
		return description;
	}
}
