package homework2;

import java.util.Scanner;
/*
 * Ningyuan Xiong
 * NetID:nxiong
 * assignment 2
 * lab section: MW 2:00 - 3:15
 * 
 */

//I did not collaborate with anyone on this assignment.
public class HW2_1 {
	public static void main(String []args) {
		/*
		 * Homework 2 question 1
		 * Declare an integer (int) variable named secret and sets it to
		 * some constant (literal) value. Then read an integer from the
		 * input and print “You’re a winner!”.
		 */
		int secret = 10;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int value = scanner.nextInt();
		if(value == secret) {
			System.out.println("You're a winner!");
		}else {
			System.out.println("Wrong!"); // If it is not an integer.
		}
		scanner.close();
	}

}
