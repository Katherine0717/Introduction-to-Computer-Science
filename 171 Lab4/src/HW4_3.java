package homework4;

// Write a program that read 3 numbers, and print the numbers form the first
//number to the second incrementing by the third.
import java.util.Scanner;
public class HW4_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int value1 = scanner.nextInt();
		System.out.println("Enter a number:");
		int value2 = scanner.nextInt();
		System.out.println("Enter a number:");
		int value3 = scanner.nextInt();
		if(value1==0 && value2==0 && value3==0) {
			// if all three numbers are 0, the program finishes.
			System.out.print("The program is finished.");
			scanner.close();
			return;
		}else {
			for(int i=value1;i<=value2;i = i+value3) {
				System.out.println(i);
			}
		}
		scanner.close();
	}
}

