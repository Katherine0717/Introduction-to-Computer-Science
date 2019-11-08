package hw05;

public class HW5_3 {
	// This is a class that represent an animal
	// with instance variables name, age, and color.
	String name;
	int age;
	String color;
	
	
	public String barking(){      // Another method: barking
		return this.name + " is barking.";
	}
	
	public String getName() {      // Getters
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public String getColor() {
		return this.color;
	}
	
	public String SetName(String name) {  //Setters
		return this.name=name;
	}
	public int SetAge(int age) {
		return this.age=age;
	}
	public String SetColor(String color) {
		return this.color=color;
	}
	
	
	
	public String toString() {
		return this.name + "is "+this.age + " years old. It's color is " + this.color 
				+ ". ";
	}
	
	
	
	public static void main(String[] args) {
		HW5_3 a = new HW5_3();     // create object a
		a.name = "Bob";
		a.age = 4;
		a.color = "Brown";
		System.out.println(a.toString());
		System.out.println(a.barking());
	}

}
