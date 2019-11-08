package hw05;

public class HW5_2 {
	// This is a class representing physical elements
	// with instance variables name, symbol, integer atomic number, and an atomic weight.
	String element;
	String symbol;
	int atomicNumber;
	double atomicWeight;
	
	
	public String setElement(String name) {  //Setters
		return this.element = name;
	}
	public String setSymbol(String symbol) {
		return this.symbol = symbol;
	}
	public int setNumber(int number) {
		return this.atomicNumber = number;
	}
	public double setWeight(double weight) {
		return this.atomicWeight = weight;
	}
	
	
	public String getElement() {             //Getters
		return this.element;
	}
	public String getSymbol() {
		return this.symbol;
	}
	public int getNumber() {
		return this.atomicNumber;
	}
	public double getWeight() {
		return this.atomicWeight;
	}
	
	
	public String toString() {     
		return "Element: "+this.element + "\nSymbol: " + this.symbol+"\nAtomic number "
	+this.atomicNumber + "\nAtomic weight "+this.atomicWeight;
	}
	
	
	
	public static void main(String[] args) {
		HW5_2 elementA = new HW5_2();  //create object A
		elementA.setElement("Hydrogen");
		elementA.setSymbol("H");
		elementA.setNumber(1);
		elementA.setWeight(1.00784);
		System.out.println(elementA.toString());
		System.out.println(" ");
		
		HW5_2 elementB = new HW5_2();  //create object B
		elementB.setElement("Helium");
		elementB.setSymbol("He");
		elementB.setNumber(2);
		elementB.setWeight(4.003);
		System.out.println(elementB.toString());
		System.out.println(" ");

		HW5_2 elementC = new HW5_2();   //create object C
		elementC.setElement("Lithium");
		elementC.setSymbol("Li");
		elementC.setNumber(3);
		elementC.setWeight(6.94);
		System.out.println(elementC.toString());
		System.out.println(" ");

	}
}
