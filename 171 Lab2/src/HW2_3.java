package homework2;

/*
 * Homework 2 question 3
 * Read a number from its input and outputs whether the number
 * is positive, negative, or zero.
 */

import java.util.Scanner;
public class HW2_3 {
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		double value = scanner.nextDouble();
		if(value > 0) {
			System.out.println("It is a positive number.");
		}else if(value < 0) {
			System.out.println("It is a negative number.");
		}else {
			System.out.println("It is zero.");
		}
		scanner.close();
	}

}
