import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String args[]) {
        // Creating an ArrayList of integers
        ArrayList<Integer> array = new ArrayList<>(); // (1, 45, 65, 78, 95, 35)
        array.add(35); // Adding elements to the ArrayList
        array.add(20);
        array.add(3);
        array.add(26);
        array.add(82);
        System.out.println(array); // Printing the ArrayList

        // Iterating through the ArrayList using a for loop
        for (int i = 0; i < array.size(); i++) {
            // Getting each element using the get method
            System.out.println(array.get(i));
        }

        // Another way to get an indexed element
        int b = array.get(0);
        System.out.println(b);

        // Adding an element at a particular index
        array.add(5, 1);
        System.out.println(array);

        // Setting an element at a specific index
        array.set(0, 5);
        System.out.println(array);

        // Deleting an element at a specific index
        array.remove(3);
        System.out.println(array);

        // Getting the size of the ArrayList
        int size = array.size();
        System.out.println("Size of the ArrayList: " + size);

        // Iterating through the ArrayList using a for loop
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + " ");
        }
        System.out.println();

        // Creating an ArrayList of strings
        ArrayList<String> array2 = new ArrayList<>();
        int numWordsOfLength = array2.size();
        array2.add("Oh");
        array2.add("me");
        array2.add("and");
        array2.add("cs");
        array2.add("sshh");

        // Printing the number of words in the ArrayList
        System.out.println("Number of words in array2: " + numWordsOfLength);

        // Iterating through the ArrayList of strings
        for (int i = 0; i < array2.size(); i++) {
            System.out.print(array2.get(i) + " ");
        }
        System.out.println();

        // Sorting the ArrayList of integers
        Collections.sort(array);
        System.out.println("Sorted ArrayList: " + array);
    }
}
