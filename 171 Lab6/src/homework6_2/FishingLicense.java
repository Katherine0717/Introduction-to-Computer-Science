package homework6_2;

public class FishingLicense extends License {
	String type;
	
	public FishingLicense(long licenseNum, String expir, String type) {
		super(licenseNum, expir);
		this.type = type;
	}

	public String toString() {
		return "Fishing license [License number: "+this.licenseNum+ ", expiration number: "+this.expir+", type: "+this.type+ "]";
	}
}
