import java.util.*;

public class lab11 {
    public static void main(String[] args) {
        // question 1:
        System.out.println("Question 1: ");
        Scanner scan = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        System.out.println("Enter a list of strings(enter 0 to stop):");
        String input1 = scan.next();
        while(!input1.equals("0")){
            list.add(input1);
            input1 = scan.next();
        }
        System.out.println("Enter another string: ");
        String input2 = scan.next();

        Boolean b = true;
        for(String temp:list){
            if(temp.equals(input2)){
                b = true; // if contains this string, b is true
            }else{
                b = false; // else is false
            }
        }
        if(b == true){
            System.out.println("The string is found.");
        }else{
            System.out.println("This string is not in the list.");
        }
        System.out.println();


        // question 2:
        System.out.println("Question 2: ");
        Set<String> names = new HashSet<>();
        names.add("Katherine");
        names.add("Jason");
        names.add("Mike");
        names.add("Robert");
        names.add("Shirley");
        names.add("Lilly");
        System.out.println("Enter a name： ");
        String input3 = scan.next();
        if(names.contains(input3)){
            System.out.println("The name is found.");
        }else{
            System.out.println("This name is not in the list.");
        }
        System.out.println();

        // question 3:
        System.out.println("Question 3: ");
        Map<String, Integer> map = new HashMap<>();
        System.out.println("Enter a series of name-number pairs: ");
        String input4 = scan.nextLine();
        String[] part = input4.split("\\s"); // split the input line by space
        for(int k = 0; k < part.length; k = k + 2){
            map.put(part[k], Integer.parseInt(part[k+1]));
        }
        System.out.println("Enter the name of the person you want to find: ");
        String input5 = scan.next();
        if(map.containsKey(input5)){
            System.out.println(map.get(input5));
        }else{
            System.out.println("Sorry, this person is not in the phonebook.");
        }
    }
}
