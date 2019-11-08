package homework6_2;

import java.time.LocalDate;
public class License {
	long licenseNum;
	String expir;
	
	public License(long licenseNum, String expir) {
		this.licenseNum = licenseNum;
		this.expir = expir;
	}
	
	public boolean equals(License license) {
		long NewNum = license.licenseNum;
		String NewExpir = license.expir;
		if(NewNum==(this.licenseNum)) {    
			if(NewExpir.equals(this.expir)) {  
				return true;
			}else{
				return false;
			}
		}else {
			return false;
		}
	}
	
	public boolean expired() {
		LocalDate today = LocalDate.now(); //get today's date
		
		String NewExpir = this.expir;   
		String[] part = NewExpir.split("-");
		int year = Integer.parseInt(part[0]);  //get license's year in int
		int month = Integer.parseInt(part[1]); //get license's month in int
		int day = Integer.parseInt(part[2]);   //get license's day in int
		
		if(today.getYear()<year) {  
			return true;
		}else if(today.getYear()==year) {
			if(today.getMonthValue() < month) {
				return true;
			}else if(today.getMonthValue()==month) {
				if(today.getDayOfMonth() <= day) {
					return true;

				}else {
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
		return "License [License number: "+ this.licenseNum + ", expiration date: "+this.expir+"]";
	
	}
	

}
