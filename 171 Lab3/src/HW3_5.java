package homework3;

/*
 * Homework 3 question 5
 * Read numbers from the user until they enter the number 0
 * and print out the sum of the numbers they entered.
 */
import java.util.Scanner;
public class HW3_5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean done = false;
		int sum = 0;
		while(!done) {
			System.out.println("Enter a number (0 to quit): ");
			int value = scanner.nextInt();
			if (value==0) {
				done = true;
				System.out.println("Sum of numbers: "+sum);
			}else {
				sum = sum + value;
			}
		}scanner.close();

		}

}
