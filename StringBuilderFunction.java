import java.util.*;

public class StringBuilderFunction {
    public static void main(String args[]) {
        // StringBuilder initialization
        Scanner scr = new Scanner(System.in);
        StringBuilder prish = new StringBuilder(scr.nextLine());
        System.out.println(prish);

        // charAt: Accessing character at a specific index
        System.out.println(prish.charAt(4));

        // setCharAt: Changing character at a specific index
        prish.setCharAt(3, 'R');
        System.out.println(prish);

        // insertion: Inserting a character at a specific index
        prish.insert(4, 'F');
        System.out.println(prish);

        // deletion: Deleting a part of the string
        // Syntax: string.delete(fromIndex, toIndex);
        prish.delete(4, 7);
        System.out.println(prish);

        // append: Adding something at the end of the string
        prish.append(" and not");
        System.out.println(prish);
    }
}
