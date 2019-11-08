package homework3;

/*
 * Homework 3 question 6
 * Read words from the user until they enter the word “stop”.
 * Print out all the words they entered on one line 
 * separated by spaces.
 * 
 */
import java.util.Scanner;
public class HW3_6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean done = false;
		String sum = "";
		while(!done) {
			System.out.println("Enter a word (enter stop to quit): ");
			String string = scanner.next();
			if (string.equals("stop")) {
				done = true;
				System.out.println(sum);
			}else {
				sum = sum + string + " ";
			}
		}scanner.close();
	}

}
