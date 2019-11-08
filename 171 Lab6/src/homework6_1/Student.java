package homework6_1;

public class Student extends Person{
	private long IDnumber;
	private School school;
	private String major;
		
	
	//Getters:
	public long getIDnumber() {
		return IDnumber;
	}
	
	public School getSchool() {
		return school;
	}
	
	public String getMajor() {
		return major;
	}

	
	//Setters:
	public void setIDnumber(long iDnumber) {
		IDnumber = iDnumber;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	
	//constructor
	public Student(String name, int age, int id, School school) {
		super(name,age);
		this.IDnumber = id;
		this.school = school;
	}
	
	
	
	public String greeting() {
		if(this.major.equals("Computer Science")) {
			return "Greetings Earthling!";
		}else{
			return "Hey.";
		}
	}
	
	
	
	public String toString() {
		return "Student [name: " + this.name + ", age: " + this.age + ", ID number: " + this.IDnumber 
				+ " Major: " + this.major + "]";
	}
	
	
	
	public static void main(String[] args) {
		//school: UR
		School UR = new School("U of R", "Rochester");
		
		//Student: p1
		Student p1 = new Student("Katherine", 19, 12345, UR);
		p1.setMajor("Computer Science");

		
		System.out.println(UR.toString());
		System.out.println(p1.toString());
		System.out.println("Greeting: " + p1.greeting());

		
		System.out.println("");
		//Person: p2
		Person p2 = new Person("Jake", 20);
		System.out.println("Another person: " + p2.toString());
		System.out.println("Greeting: " + p2.greeting());

		
	}

}
