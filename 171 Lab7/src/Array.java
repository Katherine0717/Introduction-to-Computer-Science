import java.util.Scanner;

public class Array{
    int length;
    int[] array;

    public Array() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        length = scan.nextInt();

        array = new int[length];
        setArray(scan);
    }

    public void setArray(Scanner scan) {
        System.out.println("Enter numbers to fill the array:");
        for(int i = 0; i<length; i++){
            array[i] = scan.nextInt();
        }
    }

    public int[] getArray() {
        return array;
    }
}
