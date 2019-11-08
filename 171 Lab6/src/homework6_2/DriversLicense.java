package homework6_2;

public class DriversLicense extends License {
	String state;
	
	public DriversLicense(long licenseNum, String expir, String state) {
		super(licenseNum, expir);
		this.state = state;
	}
	
	public boolean equals(DriversLicense license) {
		long NewNum = license.licenseNum;
		String NewExpir = license.expir;
		if(license.state.equals(this.state)) {
			if(NewNum==(this.licenseNum)) {    
				if(NewExpir.equals(this.expir)) {  
					return true;
				}else{
					return false;
				}
			}else {
				return false;
			}
		}else {
			return false;
		}
		
	}
	public String toString() {
		return "Drivers license [state: "+ this.state + ", license number: "+ this.licenseNum + ", expiration date: "+this.expir+"]";
	
	}

}
