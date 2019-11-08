package homework6_2;

public class TruckDriversLicense extends DriversLicense{
	public TruckDriversLicense(long licenseNum, String expir, String state) {
		super(licenseNum,expir,state);
		
	}
	public String toString() {
		return "Truck drivers license [state: "+ this.state + ", license number: "+ this.licenseNum + ", expiration date: "+this.expir+"]";
	
	}

}
