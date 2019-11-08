package homework6_1;

/*
 * Ningyuan Xiong
 * NetID:nxiong
 * assignment 6
 * lab section: TR 6:15 - 7:30
 */

//I did not collaborate with anyone on this assignment.

public class Person {
	//same person class from homework 5:
	String name;
	int age;
	long phoneNumber;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String greeting() {
		return "Hello";
	}
	
	public String getName() {   
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public long getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public void setName(String name) { 
		this.name = name;
		
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setPhoneNumber(long number) {
		this.phoneNumber = number;
	}
	
	public String toString() {
		return "[Name: " + this.name + ". Age: " + this.age + ". Phone number: " + this.phoneNumber + "]";
	}

}
