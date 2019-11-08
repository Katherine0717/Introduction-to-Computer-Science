package homework2;

/*
 * Homework 2 question 4
 * Ask the user for their age and print sentences from the table.
 * 
 */
import java.util.Scanner;
public class HW2_4 {
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your age:");
		double value = scanner.nextDouble();
		if(value >= 0 && value < 13) {
			System.out.println("You're just a kid.");
		}else if(value >= 13 && value < 20) {
			System.out.println("You're a teenager!");
		}else if(value >= 20 && value <30) {
			System.out.println("You're getting there...");
		}else {
			System.out.println("You must be wise.");
		}
		scanner.close();
	}

}
