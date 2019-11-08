package homework3;
/*
 * Ningyuan Xiong
 * NetID:nxiong
 * assignment 3
 * lab section: TR 6:15 - 7:30
 */

//I did not collaborate with anyone on this assignment.
import java.util.Scanner;
public class HW3_1 {
	public static void main(String[] args) {
		/*
		 * Homework 3 question 1
		 * Using a while statement to print 
		 * the first ten multiples of that number.
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		double value = scanner.nextDouble();
		int x = 1;
		while(x != 11) {
			double number = value * x;
			x = x+1;
			System.out.println(number);
		}scanner.close();
	}

}



