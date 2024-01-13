import java.util.*;
public class StringBuilderFunction {
    public static void main(String args[]){
        // StringBuilder 
        Scanner scr = new Scanner(System.in);
        StringBuilder prish = new StringBuilder(scr.nextLine());
        System.out.println(prish);

        //charAt
        System.out.println(prish.charAt(4));

        //set char at index 0
        // it means to take a particular index and change it with something else 
        // prish.setCharAt(index number , the change );
        prish.setCharAt(3,'R');
        System.out.println(prish);

        //insertion 
        // inserting soemthing for example name = tony and we want to add s to make it Stony 
        prish.insert(4,'F');
        System.out.println(prish);

        //deletion 
        // deleting a part of the string 
        // syntax string.delete(from this index, to this index);
        prish.delete(4,7);
        System.out.println(prish);

        //append which means add something at the end of the string 
        prish.append("and not");
        System.out.println(prish);
    }
}
