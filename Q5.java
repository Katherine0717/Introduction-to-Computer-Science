package homework1;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number of grams:");
		double gram = scanner.nextDouble();
		double c = 3 * Math.pow(10, 8);
		double E = gram * Math.pow(c,2);
		System.out.println("Energy(in Joules) is "+E);
		scanner.close();
	}

}
