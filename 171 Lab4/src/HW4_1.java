package homework4;

/*
 * Ningyuan Xiong
 * NetID:nxiong
 * assignment 4
 * lab section: MW 2:00 - 3:15
 * 
 */

//I did not collaborate with anyone on this assignment.
import java.util.Scanner;
public class HW4_1 {
	public static void main(String[] args) {
		//Write a program uses a do-while loop to print the squares of numbers 
		//read from the user until they enter the number 0.
		Scanner scanner = new Scanner(System.in);
		boolean done = false;
		do {
			System.out.println("Enter a number (0 to quit): ");
			int value = scanner.nextInt();
			if (value==0) {
				done = true;
			}else {
				System.out.println(Math.pow(value, 2));
			}
		}while(!done);
		scanner.close();
	}
}
