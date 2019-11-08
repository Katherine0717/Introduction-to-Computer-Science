package homework2;

/*
 * Homework 2 question 2
 * Reads a number and reports whether or not it is a multiple of 5.
 * 
 */

import java.util.Scanner;
public class HW2_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		double value = scanner.nextDouble();
		if(value % 5 == 0) {
			System.out.println("It is a multiple of 5.");
		}else {
			System.out.println("It is not a multiple of 5.");
		}
		scanner.close();
	}

}
