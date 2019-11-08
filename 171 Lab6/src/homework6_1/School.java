package homework6_1;

public class School {
	private String name;
	private String location;
	
	//constructor
	public School(String name, String location) {
		this.name = name;
		this.location = location;
	}
	
	//Getters
	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}
	
	//Setters
	public void setName(String name) {
		this.name = name;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public String toString() {
		return "School [name: " + this.name + ", " + this.location + "]";
	}
	

}
