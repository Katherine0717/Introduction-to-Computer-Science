package homework3;

/*
 * Homework 3 question 2
 * Using for statement to print the
 * first ten multiples of that number.
 */
import java.util.Scanner;
public class HW3_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		double value = scanner.nextDouble();
		for(int i = 1;i != 11;i = i + 1) {
			double number = value * i;
			System.out.println(number);
		}scanner.close();
	}

}
