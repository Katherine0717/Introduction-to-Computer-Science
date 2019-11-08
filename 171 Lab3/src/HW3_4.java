package homework3;

/*
 * Homework 3 question 4
 * Using a loop to count down from a number to 0
 */
import java.util.Scanner;
public class HW3_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number(positive integer): ");
		int value = scanner.nextInt();
		for(int i=value; i!=-1; i=i-1) {
			System.out.println(i);
		}scanner.close();
	}

}
