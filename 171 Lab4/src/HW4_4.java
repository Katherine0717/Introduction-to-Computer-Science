
package homework4;

import java.util.Scanner;
public class HW4_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		double n = scanner.nextDouble();
		double x=1;
		double value = 0;
		while(x!=n+1) {
			//use a loop to switch between addition and subtraction.
			if(x%2==1) {
				value = value + 1/x;
			}else {
				value = value - 1/x;
			}
			x=x+1;
	}
		double value2 = Math.log(2);
		System.out.println("The value of Math.log("+n+") is "+value2);
		scanner.close();
		System.out.println("The sum of the sequence is "+value);
		if(value2 > value) {
			System.out.println("The value of Math.log is larger then the sequence.");
		}else {
			System.out.println("The value of Math.log is smaller then the sequence.");

		}
}
}
