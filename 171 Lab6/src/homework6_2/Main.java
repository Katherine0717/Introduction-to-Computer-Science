package homework6_2;

public class Main {
	public static void main(String[] args) {
		License license = new License(12345, "2020-12-20"); //object license
		System.out.println(license.toString());
		
		License license2 = new License(12345, "2020-12-20"); //object license2
		System.out.println(license2.toString());

		if(license.equals(license2)) {	//license1 and license2 are equal or not.
			System.out.println("These two licenses are equal.");
			
		}else {
			System.out.println("These two licenses are not equal.");

		}
		
		if(license.expired()) {  //license is not expired
			System.out.println("It is not expired.");

		}else {
			System.out.println("It's expired.");

		}
		
		
		System.out.println("");
		// object drivers license
		DriversLicense driver = new DriversLicense(12345, "2020-12-20", "New York");
		DriversLicense driver2 = new DriversLicense(12345, "2020-12-20", "New York");
		System.out.println(driver.toString());
		if(driver.equals(driver2)) {
			System.out.println("This two licenses are equal.");
			
		}else {
			System.out.println("This two licenses are not equal.");

		}
		
		
		System.out.println("");
		// truck drivers license
		TruckDriversLicense Truck = new TruckDriversLicense(12345, "2020-12-20", "New York");
		System.out.println(Truck.toString());
		
		
		System.out.println("");
		// fishing license
		FishingLicense fishing = new FishingLicense(12345, "2020-12-20", "New York");
		System.out.println(fishing.toString());		
	}
}
