package hw05;

import java.util.Scanner;

/*
 * Ningyuan Xiong
 * NetID:nxiong
 * assignment 5
 * lab section: MW 2:00 - 3:15
 * 
 */

//I did not collaborate with anyone on this assignment.
public class HW5_1 {
	//This is class Person with 3 variables: name, age, and a phone number.
	String name;
	int age;
	long phoneNumber;
	
	public String getName() {   //Getters
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public long getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public void setName(String name) {  //Setters
		this.name = name;
		
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setPhoneNumber(long number) {
		this.phoneNumber = number;
	}
	
	public String toString() {
		return "Name: " + this.name + ". Age: " + this.age + ". Phone number: " + this.phoneNumber;
	}
	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name:");   //get input
		String name = scanner.next();
		System.out.println("Enter the age:");
		int age = scanner.nextInt();
		System.out.println("Enter the number:");
		long number = scanner.nextLong();
		
		
		
		HW5_1 a = new HW5_1();  //create object a
		a.setName(name);
		a.setAge(age);
		a.setPhoneNumber(number);
		System.out.print(a.toString());
		scanner.close();
	}
	

}
