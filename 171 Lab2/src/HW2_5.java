package homework2;

/*
 * Homework 2 question 5
 * Ask he user to enter 1 or 2 based on the questions.
 * 
 */
import java.util.Scanner;
public class HW2_5 {
	public static void main(String []args) {
		System.out.println("Enter 1 if you want to discuss sports or enter 2 if you want to discuss food.");
		Scanner scanner = new Scanner(System.in);
		int value = scanner.nextInt();
		if(value == 1) {
			System.out.println("Enter 1 if you play ice hockey or 2 if you don't.");
			int hockey = scanner.nextInt();
			if(hockey == 1) {
				System.out.println("Awesome!");
			}else if(hockey == 2){
				System.out.println("You should try it some day.");
			}
		}else if(value == 2) {
			System.out.println("How many times did you eat pizza last week?");
			int pizza = scanner.nextInt();
			if(pizza >= 5) {
				System.out.println("You should eat better.");
			}else if(pizza < 5){
				System.out.println("OK");
			}
		}
		scanner.close();
	}

}
