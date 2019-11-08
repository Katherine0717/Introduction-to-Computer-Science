package homework1;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter temperature(Faharenheit): ");
		double F = scanner.nextDouble();
		double K = ((double)5/9)*(F-32)+273;
		System.out.println(F + " degrees Fahrenheit is "+K+" Kelvin.");
		
		scanner.close();
	}

}
