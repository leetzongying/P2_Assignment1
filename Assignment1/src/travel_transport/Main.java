package travel_transport;

public class Main {

	public static void main(String[] args) {
	
		Company a = new Company("TY Travel Agency", "Lee Tzong Ying", 2021);
		Employee b = new Employee("Manager");
		Finance c = new Finance("June");
		Customer d = new Customer();
		Product_Description e = new Product_Description();
		Advertising_Marketting f = new Advertising_Marketting("Facebook");
		
		System.out.println(a);
		System.out.println();
		System.out.println(b);
		System.out.println();
		System.out.println(c);
		System.out.println();
		System.out.println(d);
		System.out.println();
		System.out.println(e);
		System.out.println();
		System.out.println(f);
		
	}

}
