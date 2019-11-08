package homework4;

// read an integer and prints a "times table" for the numbers from 1 
//to the given integer.
import java.util.Scanner;
public class HW4_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int value = scanner.nextInt();
		int x = 1;
		int y = 1;
		for(y=1;y!=value+1;y=y+1) { //number of rows
			System.out.println();
			for(x=1;x!=value+1;x=x+1) {//number of elements in every row
				System.out.print(x*y+" ");
			}
		}scanner.close();
		}
		
	}
