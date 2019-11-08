import java.util.Scanner;
/*
Ningyuan Xiong
Nxiong
HW7
Lab TR 6:15-7:30
I did not collaborate with anyone on this assignment
 */
public class Main extends Array{
    public static void main(String[] args) {
        Array array = new Array();
        printArray(array.getArray());
        printMiddle(array.getArray());
        printMin(array.getArray());
        addInteger(array.getArray());
        int[] copyArray = copyArray(array.getArray());
        addArray(array.getArray(), copyArray);

    }

    public static void printArray(int[] array){
        System.out.print(array[0]);
        for(int i = 1; i<array.length;i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println("");
    }

    public static void printMiddle(int[] array){
        int length = array.length;
        int mid = (int)Math.ceil(length/2.0); //The middle index is length divide two.
        //If it is odd, mid round up. If it is even, it is length divide two.
        System.out.println("The index(actual number - 1) of the middle element is: " + (mid-1));
        System.out.println("");

    }

    public static void printMin(int[] array){
        int min = 0;
        for(int i = 1; i<array.length; i++){
            if(array[min]>array[i]){
                min = i;
            }
        }
        System.out.println("The minimum number in this array is: "+array[min]);
        System.out.println("");
    }

    public static void addInteger(int[] array){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a new integer to add up:");
        int input = scan.nextInt();

        for(int i = 0; i < array.length; i++){
            array[i] = array[i] + input;
        }
        System.out.print("Add an integer to every element of the array: ");
        printArray(array);
        System.out.println("");
    }

    public static int[] copyArray(int[] array){
        int[] newArray = new int[array.length];

        for(int i = 0; i< array.length; i++){
            newArray[i] = array[i];
        }

        System.out.print("The copied array: ");
        printArray(newArray);
        System.out.println("The first value of the array: " + newArray[0]);
        System.out.println("The last value of the array: " + newArray[array.length-1]);
        System.out.println("");
        return newArray;
    }

    public static void addArray(int[] arrayOri, int[] arrayNew){
        for(int i = 0; i< arrayOri.length; i++){
            arrayOri[i] = arrayOri[i]+arrayNew[i];
        }
        System.out.println("Add the copy array and the original array: ");
        System.out.print("The original array: ");
        printArray(arrayOri);
        System.out.print("The added array: ");
        printArray(arrayNew);
    }
}

